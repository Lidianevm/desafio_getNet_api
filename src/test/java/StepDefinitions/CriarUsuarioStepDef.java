package StepDefinitions;

import Domain.Usuario;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static io.restassured.RestAssured.given;

public class CriarUsuarioStepDef extends Hooks {
    private static final String CRIAR_USUARIO = "/users";

    @Test
    public void CriaUsuarioComSucesso() {
        Usuario usuario = new Usuario("lidiane","quality assurance engineer", "teste@gmail.com");

        given().
                body(usuario).
                when().
                post(CRIAR_USUARIO).
                then().
                statusCode(HttpStatus.SC_CREATED).
                body("name", is("lidiane"));
    }

}
