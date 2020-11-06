# desafio_getNet_api
Desafio de Automação de API GetNet - DBC Company

O seguinte projeto teve como objetivo testar as funcionalidades de uma API com Rest Assured e Java. 
Seus serviços e retornos. 
API utilizada: http://reqres.in/api/

Requisitos
	• Java 8+

	• Maven 4.0.0 

	• IntelliJ - IDE utilizada. 

Branches

	• Master - Contem o projeto final. 

	• Developer - contem todos os commits.

	• Core_Project - contem os commits mais estaveis. 

De início foi pensado em fazer com Rest + Cucumber porém visto que não
seria possível abrager todos os casos de teste pensado, achei melhor seguir
no raciocinio de annotation com JUnit. 
Utilizei os conceitos de Rest como Serialização, Request Specification, deserialização, 
Response Spec, lombok e hashmap. 
A estrutura do projeto é simples onde no package Domain guardo minha classe Usuarios que contém
todos os objetos e atributos que utilizo no package StepDefinitios que por sua vez contém as classes
do teste propriamente dito, dividido por categorias, o StepDefinition também contem o Hooks
que nada mais é do que a BasePage onde seto a API a ser utilizado e o request specification. 

As classes estão dividas em:

	• CadastrarRegistroStepDef Onde validei o response de um cadastro com erro, faltando a informação da senha.

	• ConsultarLoginStepDef Onde validei o response de um login com erro, faltando a informação da senha.

	• ConsultarUsuarioStepDef Onde validei o response de uma consulta de Lista de usuarios, unico usuario e usuario não encontrado.

CriarUsuarioStepDef Onde validei o responde da criação de um usuario com sucesso. 
