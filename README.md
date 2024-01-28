<h1 align="center">
    ChamaNois - Projeto Spring
</h1>

<div align="center">
        <img src="https://github.com/Chama-Nois/Chama-Nois/blob/Joilton/imagens/icon.png" width="100">
</div>

Este repositório contém o projeto desenvolvido como parte das atividades do curso RecodePro. O projeto envolve a criação de um banco de dados e um site voltados para a promoção da acessibilidade e empreendedorismo nas periferias. O banco de dados, desenvolvido no BRModelo e no MySQL, foi concebido para armazenar informações essenciais sobre empresas, produtos e clientes.
Este projeto utiliza o framework Spring Boot para implementar um aplicativo Java baseado em MVC (Model-View-Controller). O foco principal é a gestão de produtos e empresas, explorando o relacionamento entre essas entidades.

Nota: Este projeto faz parte de uma atividade do curso RecodePro, tendo como objetivo não apenas oferecer produtos e serviços às periferias, mas também criar oportunidades de emprego e empreendedorismo, contribuindo assim para o crescimento e transformação positiva das comunidades periféricas.

## Modelagem do banco de dados

<h3>
        Banco de dados conteitual
    </h3>
    <div align="center">
        <img src="https://github.com/Chama-Nois/chama_nois_final/blob/main/modelagem_de_dados/modelo_conceitual.jpg">
    </div>
    <hr>
    <h3>
        Banco de dados lógico
    </h3>
    <div align="center">
        <img src="https://github.com/Chama-Nois/chama_nois_final/blob/main/modelagem_de_dados/modelo_logico.jpg">
    </div>
    <hr>
    <h3>
        Banco de dados físico
    </h3>
    <div>
        <p>Clique para acessar o código sql: <a href="https://github.com/Chama-Nois/chama_nois_final/blob/main/modelagem_de_dados/modelo_fisico.sql">banco de dados físico </a></p>
    </div>
    <hr>
    <h3>
        Diagrama de classes
    </h3>
    <div align="center">
        <img src="https://github.com/Chama-Nois/chama_nois_final/blob/main/modelagem_de_dados/diagrama_de_classes.jpg">
    </div>
    <hr>
    <h3>
        Estrutura do projeto
    </h3>

```plaintext
chamanois
│
├── src
│   └── main
│       ├── java
│       │   ├── com.chamanois
│       │   │   ├── model
│       │   │   │   ├── Empresas.java
│       │   │   │   ├── Produtos.java
│       │   │   │   ├── Usuarios.java
│       │   │   │   └── Role.java
│       │   │   ├── dto
│       │   │   │   └── UsuariosDTO.java
│       │   │   ├── services
│       │   │   │   ├── empresasService.java
│       │   │   │   ├── ProdutosService.java
│       │   │   │   └── UsuariosService.java
│       │   │   ├── servicesimpl
│       │   │   │   ├── empresasServiceImpl.java
│       │   │   │   ├── ProdutosServiceImpl.java
│       │   │   │   └── UsuariosServiceImpl.java
│       │   │   ├── repositories
│       │   │   │   ├── EmpresasRepository.java
│       │   │   │   ├── ProdutosRepository.java
│       │   │   │   ├── RoleRepository.java
│       │   │   │   └── UsuariosRepository.java
│       │   │   ├── controller
│       │   │   │   ├── EmpresasController.java
│       │   │   │   ├── ProdutosController.java
│       │   │   │   ├── RotasController.java
│       │   │   │   └── UsuariosController.java
│       │   │   └── config
│       │   │       └── SecurityConfig.java
│       ├── resources
│       │   ├── static
│       │   │   └── styles
│       │   │       ├── entrar.css
│       │   │       └── cadastro.css
│       │   └── templates
│       │       ├── fragments
│       │       │   ├── navbar.html
│       │       │   └── footer.html
│       │       └── pages
│       │           ├── empresas
│       │           │   ├── atualizarEmpresas.html
│       │           │   ├── formEmpresa.html
│       │           │   └── listarEmpresas.html
│       │           ├── produtos
│       │           │   ├── atualizarProdutos.html
│       │           │   ├── formProdutos.html
│       │           │   └── listarProdutos.html
│       │           ├── usuarios
│       │           │   ├── atualizarUsuarios.html
│       │           │   ├── listarUsuarios.html
│       │           │   └── cadastro.html
│       │           ├── index.html
│       │           └── entrar.html
│       │       
│       └── data.sql
├── src/test/java
├── target/generated-sources/annotations
├── target/generated-test-sources/test-annotations
├── src
├── target
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```