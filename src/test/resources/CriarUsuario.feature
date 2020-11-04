#language: pt
Funcionalidade: Criar um cadastro de usuario

  Como um usuário gostaria de criar um cadastro para um usuario e verificar seu retorno

  @CriarCadastroSucesso @CriarCadastroUsuario @TotalTest
  Esquema do Cenário: Criar um cadastro de usuario com sucesso
    Dado que o usuario insere "<nome>" e "<job>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | nome             | job                       |
      | Lidiane Valentim | Quality Assurance Analyst |

