package br.com.fiap.resource;

import br.com.fiap.dao.JogoDao;
import br.com.fiap.dto.jogo.CadastroJogoDto;
import br.com.fiap.dto.jogo.DetalhesJogoDto;
import br.com.fiap.exception.IdNaoEncontradoException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Jogo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.modelmapper.ModelMapper;

import java.sql.SQLException;
import java.util.List;

//http://localhost:8080/jogos

@Path("/jogos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JogoResource {

    private JogoDao jogoDao;
    private ModelMapper modelMapper;

    public JogoResource() throws Exception{
        jogoDao = new JogoDao(ConnectionFactory.getConnection());
        modelMapper = new ModelMapper();
    }

    @POST
    public Response cadstrar(CadastroJogoDto dto, @Context UriInfo uriInfo) throws SQLException {

        Jogo jogo = modelMapper.map(dto, Jogo.class);

        jogoDao.cadastrar(jogo);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(String.valueOf(jogo.getId())); //Constroi a URI para acessar o jogo cadastrado
        return Response.created(builder.build()).build();
    }

    @GET
    @Path("pesquisa")//http://localhost:8080/jogos/pesquisa?nome=xx
    public List<Jogo> pesquisarPorNome(@DefaultValue("")@QueryParam("nome") String nome) throws SQLException, IdNaoEncontradoException{
        return jogoDao.pesquisarPorNome(nome);
    }

    @GET
    public List<Jogo> listar() throws SQLException{
        return jogoDao.listar();
    }

    @GET
    @Path("/{id}")
    public DetalhesJogoDto pesquisarPorId(@PathParam("id") int id) throws SQLException, IdNaoEncontradoException {
        Jogo jogo = modelMapper.map();
        //Tarefa
        //Implementar o mapper aqui
        return jogoDao.pesquisarPorId(id);
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(Jogo jogo, @PathParam("id") int id) throws SQLException, IdNaoEncontradoException{
        //Setar o ID no jogo
        jogo.setId(id);
        //Atualizar o jogo
        jogoDao.atualizar(jogo);
        //Retornar o status 200 OK
        return Response.ok().build();
    }

    @PATCH//Realizar a atualização parcial do objeto
    @Path("/{id}")
    public Response atualizarParcial(Jogo jogo, @PathParam("id") int id) throws  SQLException, IdNaoEncontradoException{
        //Pesquisar o jogo no banco de dados
        Jogo jogoBanco = jogoDao.pesquisarPorId(id);
        //Verifica se existe valor no objeto recebido, eu seto o novo valor no objeto do banco
        if (jogo.getNome() != null)
            jogoBanco.setNome(jogo.getNome());
        if (jogo.getDataLancamento() != null)
            jogoBanco.setDataLancamento(jogo.getDataLancamento());
        if (jogo.getClassificacao() != null)
            jogoBanco.setClassificacao(jogo.getClassificacao());
        jogoDao.atualizar(jogoBanco);
        return Response.ok().build();
    }

    @DELETE
    @Path(("/{id}"))
    public Response remover(@PathParam("id") int id) throws SQLException, IdNaoEncontradoException{
        //Removendo o jogo
        jogoDao.remover(id);
        //Retornando o Status 204
        return Response.noContent().build();
    }
}
