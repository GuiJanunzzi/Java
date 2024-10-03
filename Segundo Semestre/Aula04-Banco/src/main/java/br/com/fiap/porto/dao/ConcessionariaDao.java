package br.com.fiap.porto.dao;

import br.com.fiap.porto.Model.Concessionaria;
import br.com.fiap.porto.exception.IdNaoEncontradoException;
import br.com.fiap.porto.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConcessionariaDao {

    private Connection conexao;

    //Realizando a conexão com o banco de dados por meio da conexão vinda do construtor
    public ConcessionariaDao(Connection connection){this.conexao = connection;}

    public void cadastrar(Concessionaria concessionaria) throws SQLException, ClassNotFoundException{
        //Criando PreparedStatement
        PreparedStatement stm = conexao.prepareStatement("insert into t_java_concessionaria (id_concessionaria, " +
                "nm_concessionaria, nr_cnpj, nr_veiculo_maximo) " +
                "values (sq_t_concessionaria.nextval, ?,?,?)");
        stm.setString(1, concessionaria.getNome());
        stm.setString(2, concessionaria.getCnpj());
        stm.setInt(3, concessionaria.getQtdVeiculoMaximo());
        //Executando o comando SQL
        stm.executeUpdate();
        System.out.println("Concessionaria cadastrada com sucesso");
    }

    public List<Concessionaria> listar() throws  SQLException, ClassNotFoundException{
        //Criando um Statement
        Statement stm = conexao.createStatement();
        //Criando um Result Set
        ResultSet rs = stm.executeQuery("select * from t_java_concessionaria order by id_concessionaria");
        //Criando um a lista de concessionarias
        List<Concessionaria> concessionarias= new ArrayList<>();
        //Recuperando concessionarias
        while (rs.next()) {
            Concessionaria concessionaria = parseConcessionaria(rs);
            concessionarias.add(concessionaria);
        }
        return concessionarias;
    }

    public void atualizar(Concessionaria concessionaria) throws IdNaoEncontradoException ,SQLException, ClassNotFoundException{
        //Criando um PreparedStatement
        PreparedStatement stm = conexao.prepareStatement("update t_java_concessionaria set nm_concessionaria = ?, " +
                "nr_cnpj = ?, nr_veiculo_maximo = ? where id_concessionaria = ?");
        //Setando valores no banco
        stm.setString(1, concessionaria.getNome());
        stm.setString(2, concessionaria.getCnpj());
        stm.setInt(3, concessionaria.getQtdVeiculoMaximo());
        stm.setInt(4,concessionaria.getId());
        //Executando o comando
        int linhas = stm.executeUpdate();
        if (linhas == 0){
            throw new IdNaoEncontradoException("Concessionaria não encontrada");
        }
        System.out.println("Concessionaria atualizada com sucesso!");
    }

    public void excluir(int id) throws IdNaoEncontradoException ,SQLException, ClassNotFoundException{
        //Criando um PreparedStatement
        PreparedStatement stm = conexao.prepareStatement("delete from t_java_concessionaria " +
                                                            "where id_concessionaria = ?");
        //Setando os valores no banco
        stm.setInt(1, id);
        //Executando o comando
        int linhas = stm.executeUpdate();
        if (linhas == 0){
            throw new IdNaoEncontradoException("Concessionaria não encontrada");
        }
        System.out.println("Concessionaria removida com sucesso!");
    }

    public Concessionaria pesquisarPoiId(int id)throws IdNaoEncontradoException, SQLException, ClassNotFoundException{
        //Crinado um PreparedStatement
        PreparedStatement stm = conexao.prepareStatement("select * from t_java_concessionaria " +
                                                        "where id_concessionaria = ? ");
        //Setar o id no comando SQL
        stm.setInt(1, id);
        //Executar o comando SQL
        ResultSet rs = stm.executeQuery();
        //Recuperar o registro, se existir
        if (!rs.next()){
            throw new IdNaoEncontradoException("Concessionaria não encontrada");
        }
        return parseConcessionaria(rs);
    }

    //Método para recuperar concessionarias do banco
    private Concessionaria parseConcessionaria(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_concessionaria");
        String nome = rs.getString("nm_concessionaria");
        String cnpj = rs.getString("nr_cnpj");
        int nrMaxCarro = rs.getInt("nr_veiculo_maximo");
        //Instanciando uma concessionaria
        return new Concessionaria(id, nome, cnpj,nrMaxCarro);
    }

}
