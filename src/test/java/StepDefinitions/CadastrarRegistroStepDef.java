package StepDefinitions;

import Domain.Usuario;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class CadastrarRegistroStepDef extends Hooks {
    private static final String REGISTRA_USUARIO = "/register";

    @Test
    public void RegistrarUsuarioComSucesso() {
        Usuario usuario = new Usuario();
        usuario.setEmail("lidianevalentim@teste.com");
        usuario.setSenha("lidiane123");
        given().
                body(usuario).
                when().
                post(REGISTRA_USUARIO).
                then().
                statusCode(HttpStatus.SC_CREATED);
        //body("email", is("lidianevalentim@teste.com"));
    }

    @Test
    public void RegistrarUsuarioSemSenha() {
        Usuario usuario = new Usuario();
        usuario.setEmail("lidianevalentim@teste.com");

        given().
                body(usuario).
                when().
                post(REGISTRA_USUARIO).
                then().
                body("error", is("Missing password"));
    }
}