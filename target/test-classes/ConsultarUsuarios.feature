#language: pt
Funcionalidade: Consultar os usuarios cadastrados

  Como um usuario gostaria de consultar todos os usuarios cadastrados e verificar seu retorno

  @ConsultarListaUsuarios @ListaEncontrada @TotalTest
  Cenário: Consultar lista de usuarios cadastrados
    Dado que o usuario consulta a lista de usuarios
    Então é retornado uma lista de usuarios cadastrados

  @ConsultarUnicoUsuario @UsuarioEncontrado @TotalTest
  Cenário: Consultar um unico usuario com sucesso
    Dado que o usuario consulta um usuario
    Então é retornado o sucesso da simulacao

  @ConsultarUnicoUsuario @UsuarioNaoEncontrado @TotalTest
  Cenário: Consultar um unico usuario nao encontrado
    Dado que o usuario consulta um usuario
    Então é retornado que o usuario nao foi encontrado

  @ConsultarListaUsuariosResource @ListaEncontradaResource @TotalTest
  Cenário: Consultar lista de usuarios cadastrados
    Dado que o usuario consulta a lista de usuarios
    Então é retornado uma lista resource de usuarios cadastrados

  @ConsultarUnicoUsuarioResource @UsuarioEncontradoResource @TotalTest
  Cenário: Consultar um unico usuario com sucesso
    Dado que o usuario consulta um usuario
    Então é retornado o usuario resource cadastrado com sucesso

  @ConsultarUnicoUsuario @UsuarioNaoEncontradoResource @TotalTest
  Cenário: Consultar um unico usuario nao encontrado
    Dado que o usuario consulta um usuario
    Então é retornado que o usuario resource nao foi encontrado




