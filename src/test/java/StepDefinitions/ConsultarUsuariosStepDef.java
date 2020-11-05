package StepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ConsultarUsuariosStepDef extends Hooks {
    private static final String LISTA_USUARIOS_ENDPOINT = "/users";

    @Dado("que o usuario consulta a lista de usuarios")
    public void queOUsuarioConsultaAListaDeUsuarios() throws Exception {
        given().
                when().
                get(LISTA_USUARIOS_ENDPOINT);

    }
    @Então("é retornado uma lista de usuarios cadastrados")
    public void éRetornadoUmaListaDeUsuariosCadastrados() throws Exception {
        given().
            then().
                statusCode(HttpStatus.SC_OK).
                body("page", is(2)).
                body("data", is(notNullValue()));

    }

    @Dado("que o usuario consulta um usuario")
    public void queOUsuarioConsultaUmUsuario() throws Exception {
        given().
                when().
                get(LISTA_USUARIOS_ENDPOINT);
    }

    @Então("é retornado o sucesso da simulacao")
    public void éRetornadoOSucessoDaSimulacao() throws Exception {
        given().
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Então("é retornado que o usuario nao foi encontrado")
    public void éRetornadoQueOUsuarioNaoFoiEncontrado() throws Exception {
        given().
                then().
                statusCode(HttpStatus.SC_NOT_FOUND);

    }
    @Então("é retornado uma lista resource de usuarios cadastrados")
    public void éRetornadoUmaListaResourceDeUsuariosCadastrados() throws Exception {
        given().
                then().
                statusCode(HttpStatus.SC_OK);

    }

    @Então("é retornado o usuario resource cadastrado com sucesso")
    public void éRetornadoOUsuarioResourceCadastradoComSucesso() throws Exception  {
    }

    @Então("é retornado que o usuario resource nao foi encontrado")
    public void éRetornadoQueOUsuarioResourceNaoFoiEncontrado() throws Exception  {
    }
}