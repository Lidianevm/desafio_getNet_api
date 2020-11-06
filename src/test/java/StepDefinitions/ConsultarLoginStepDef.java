package StepDefinitions;

import Domain.Usuario;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class ConsultarLoginStepDef extends Hooks {
    private static final String LOGIN_USUARIO = "/login";

    @Test
    public void RealizarLoginErro() {
        Usuario usuario = new Usuario();
        usuario.setEmail("sydney@fife");

        given().
                body(usuario).
                when().
                post(LOGIN_USUARIO).
                then().
                body("error", is("Missing password"));
    }
}
