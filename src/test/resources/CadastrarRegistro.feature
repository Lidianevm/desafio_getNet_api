#language: pt
Funcionalidade: Criar um registro para um usuario

  Como um usuário gostaria de criar um registro com login e senha para um usuario e verificar seu retorno

  @CriarRegistroSucesso @CriarRegistroUsuario @TotalTest
  Esquema do Cenário: Criar um registro de usuario com sucesso
    Dado que o usuario insere "<email>" e "<senha>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | email                   | senha         |
      | lidianevalentim@dbc.com | @23dbccompany |

  @CriarRegistroErro @CriarRegistroSemSenha @TotalTest
  Esquema do Cenário: Criar um registro de usuario faltando informacao da senha
    Dado que o usuario insere "<email>"
    Então é retornado o erro da simulacao
    Exemplos:
      | email
      | lidianevalentim@dbc.com |

