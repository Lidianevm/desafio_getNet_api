#language: pt
Funcionalidade: Atualziar o cadastro de um usuario

  Como um usuário gostaria de atualizar o cadastro para um usuario e verificar seu retorno

  @AtualizarCadastroSucesso @TotalTest
  Esquema do Cenário: Atualizar o cadastro de um usuario com sucesso
    Dado que o usuario insere "<nome>" e "<job>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | nome             | job                       |
      | Lidiane Valentim | Quality Assurance Analyst |

  @AtualizarCadastroSucesso @AtualizacaoParcial @TotalTest
  Esquema do Cenário: Atualizar o cadastro de um usuario com sucesso
    Dado que o usuario insere o "<job>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | job                      |
      | Quality Assurance Senior |