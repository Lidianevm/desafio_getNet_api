#language: pt
Funcionalidade: Realizar login

  Como um usuário gostaria de realizar um login a partir de um email e senha e verificar seu retorno

  @RealizarLoginSucesso @LoginUsuario @TotalTest
  Esquema do Cenário: Realizar um login de usuario com sucesso
    Dado que o usuario insere "<email>" e "<senha>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | email                   | senha         |
      | lidianevalentim@dbc.com | @23dbccompany |

  @RealizarLoginErro @LoginSemSenha @TotalTest
  Esquema do Cenário: Realizar login de usuario faltando informacao da senha
    Dado que o usuario insere "<email>"
    Então é retornado o erro da simulacao
    Exemplos:
      | email
      | lidianevalentim@dbc.com |