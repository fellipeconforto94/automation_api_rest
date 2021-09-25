# automation_api_rest

# Instalação

- Clonar o repositorio em sua máquina usando `https://github.com/fellipeconforto94/desafio_api_rest.git`

- Instalar todas as dependencias no pom.xml(Rest Assured, Junit, ...)

- mvn install

# Como Rodar

> Execução dos CTs
- A execução pode ser feita no package "tests" em /desafio_api_rest/src/test/java/tests/ApiTestsFilme.java

> Descrição dos Cts
- São feitos 4 testes usando o verbo GET.
- No primeiro teste, ele acessa a API com os parametros fornecidos(URL,ID e API KEY) e faz uma validação com o titulo do filme e o que ele retorna no Status Code.
- No segundo teste, acessa com os mesmos parametros, porém valida o Ano do Filme e o que ele retorna no status code.
- No terceiro teste, acessa com os mesmos parametros, porém valida o Idioma do Filme e o que ele retorna no status code.
- No quarto teste, acessa com os mesmos parametros, porém faz uma validação com um ID inexistente e o que ele retorna no status code.

