#language: pt
Funcionalidade: Deletar um usuario

  Como um usuário gostaria de deletar o cadastro de um usuario e verificar seu retorno

  @DeletarCadastro @TotalTest
  Esquema do Cenário: Deletar o cadastro de um usuario com sucesso
    Dado que o usuario insere "<nome>" e "<job>"
    Então é retornado o sucesso da simulacao
    Exemplos:
      | nome             | job                       |
      | Lidiane Valentim | Quality Assurance Analyst |

