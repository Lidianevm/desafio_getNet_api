package StepDefinitions;

import Domain.Usuario;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class ConsultarUsuariosStepDef extends Hooks {
    private static final String LISTA_USUARIOS_ENDPOINT = "/users";
    private static final String unicoUsuario = "/users/{userId}";

    @Test
    public void ListaDeUsuariosCadastrados() {
        given().param("page","2").
                when().
                get(LISTA_USUARIOS_ENDPOINT).then().
                log().body().
                statusCode(HttpStatus.SC_OK).
                body("page", is(2)).
                body("data", is(notNullValue()));

    }

    @Test
    public void UnicoUsuarioCadastrado() throws Exception {
        Usuario usuario = given().
                pathParam("userId", 2).
                when().
                get(unicoUsuario).
                then().
                statusCode(HttpStatus.SC_OK).
                extract().
                body().jsonPath().getObject("data", Usuario.class);


        assertThat(usuario.getEmail(), containsString("@reqres.in"));
        //assertThat(usuario.getName(), is("Janet"));
        //assertThat(usuario.getLastName(), is("Weaver"));
    }



    @Test
    public void UsuarioNaoEncontrado() throws Exception {
        Usuario usuario = given().
                pathParam("userId", 23).
                when().
                get(unicoUsuario).
                then().
                statusCode(HttpStatus.SC_NOT_FOUND).
                extract().
                body().jsonPath().getObject("data", Usuario.class);

    }

}
