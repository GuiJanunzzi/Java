package br.com.fiap.test;

import br.com.fiap.dao.JogoDao;
import br.com.fiap.exception.IdNaoEncontradoException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Classificacao;
import br.com.fiap.model.Jogo;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class JogoDaoTest {

    public static void main(String[] args) {
        Connection conexao = null;

        try {
            conexao = ConnectionFactory.getConnection();

            // Instanciar o DAO
            JogoDao dao = new JogoDao(conexao);

            // 1. Teste de Inserção
            Jogo novoJogo = new Jogo(1, "FIFA 22", LocalDate.of(2022, 9, 27), Classificacao.LIVRE);
            dao.cadastrar(novoJogo);
            System.out.println("Jogo cadastrado com sucesso!");

            // 2. Teste de Listagem
            List<Jogo> listaJogos = dao.listar();
            System.out.println("Jogos cadastrados:");
            for (Jogo jogo : listaJogos) {
                System.out.println(jogo);
            }

            // 3. Teste de Pesquisa por ID
            Jogo jogoPesquisado = dao.pesquisarPorId(13); // Ajustar o ID conforme necessário
            System.out.println("Jogo pesquisado: " + jogoPesquisado);

            // 4. Teste de Atualização
            jogoPesquisado.setNome("FIFA 23");
            jogoPesquisado.setClassificacao(Classificacao.MAIOR_12);
            dao.atualizar(jogoPesquisado);
            System.out.println("Jogo atualizado com sucesso!");

            // 5. Teste de Pesquisa após Atualização
            Jogo jogoAtualizado = dao.pesquisarPorId(jogoPesquisado.getId());
            System.out.println("Jogo atualizado: " + jogoAtualizado);

            // 6. Teste de Remoção
            dao.remover(jogoAtualizado.getId());
            System.out.println("Jogo removido com sucesso!");

            // 7. Teste de Pesquisa após Remoção (deve lançar exceção)
            try {
                dao.pesquisarPorId(jogoAtualizado.getId());
            } catch (IdNaoEncontradoException e) {
                System.out.println("Jogo não encontrado após remoção (conforme esperado).");
            }

            // 8. Teste de Pesquisa por nome
            try{
                List<Jogo> jogos = dao.pesquisarPorNome("FIFA");
                for (Jogo j : jogos){
                    System.out.println(j);
                }
            }catch (Exception e){
                System.err.println(e.getMessage());
            }

        } catch (SQLException | ClassNotFoundException | IdNaoEncontradoException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
