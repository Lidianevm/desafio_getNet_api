package StepDefinitions;

import Domain.Usuario;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class CadastrarRegistroStepDef extends Hooks {
    private static final String REGISTRA_USUARIO = "/register";

    @BeforeClass
    public static void setupRegistro() {
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_BAD_REQUEST)
                .build();
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