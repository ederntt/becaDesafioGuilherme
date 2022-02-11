
<center>
<img src="https://user-images.githubusercontent.com/96309673/153507245-372d54f1-1c31-4d01-84f1-e96ff9dcb9f4.png">
</center>


<h2> Sobre </h2>

O projeto é um desafio back-and da **Beca Java - NTT DATA BRASIL**. 
<br>Uma versão bem simploria do tão querido Spotify.</br>
O projeto foi dividido em 8 partes que estão descritas em cada desafio.




<h2> 📖 Sumário </h2>

- O que é possível fazer
- Lista dos desafios
- Tecnologias utilizadas
- Resumo dos desafios
- Considerações finais
- Diagrama
- Fluxogramas

<h2> 💡 O que é possível fazer</h2>
- Pesquisar músicas
- Pesquisar artistas
- Pesquisar coletanias
- Criar sua propria playlist

<h2>📑 Lista de desafios</h2>
- [Desafio 1](https://github.com/almeidaguil/becaDesafioGuilherme/tree/desafio1) <br>
- [Desafio 2](https://github.com/almeidaguil/becaDesafioGuilherme/tree/desafio2) <br>
- [Desafio 3](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio3) <br>
- [Desafio 4](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio4) <br>
- [Desafio 5](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio5) <br>
- [Desafio 6](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio6) <br>
- [Desafio 7](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio7) <br>
- [Desafio 8](https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio8) <br>


<h2> 🛠 Tecnologias utilizadas</h2>
- IntelliJ IDEA
- Spring Boot
- Linguagem Java
- Postman
- Banco de dados H2
- Banco de dados MySql


<h2> 📃 Resumo dos desafios</h2>
<h3>🎯<span style="color:red">Desafio 1: </span></h3>
- Criar um projeto Spring Boot, implementar classes base da API;
- Criar um repositório no git onde será feita a entrega dos desafios;
- Fazer commit na brach "main" junto com o Readme.md.
<p><i>O objetivo durante o desafio 1 é entender o conceito de POO, criar uma modelagem e um 
pequeno resumo sobre o que será a API, ter o primeiro contato com o Spring Boot e github.</i> </p>

<h3>🎯<span style="color:red">Desafio 2: </span></h3>
- Criar classes **controllers (_CRUD_)**;
- Implementar **OpenAPI** na **Spring Rest API**;
- Implementar **ResponseEntity** para retorno das chamadas.

_O objetivo durante o desafio 2 é entender o conceito de CRUD(Create, Read, Update, Delete) e como 
utilizar e o ResponseEntity dentro de uma aplicação._

<h3>🎯<span style="color:red">Desafio 3: </span></h3>
- Criar classe(s) de **serviço(s)**;
- Implementar **interfaces** e declarar métodos que irá utilizar;
- Fazer a integração com as camadas **controllers**.

_O Objetivo durante o desafio 3 é entender o conceito de serviços e interfaces, como fazer a utilização
e implementação de ambos além de facilitar futuras atualizações em seu projeto._

<h3>🎯<span style="color:red">Desafio 4: </span></h3>
- Criar classe(s) de **repository**;
- Configurar **banco de dados H2**;
- Implementar na(s) camada(s) de **serviço(s)**;
- Fazer **testes** para certificar a integridade da base de dados.

_O objetivo durante o desafio 4 é conhecer a classe repository e como integra-lá dentro de uma API,
além de ter um primeiro contato com um banco de dados em memória e testar a integridade dos dados 
inseridos._

<h3>🎯<span style="color:red">Desafio 5: </span></h3>
- Aplicar conceito de **DTO**(Data Transfer Object);
- Fazer relacionamento das tabelas da API;
- Criar end-point para retornar um DTO personalizado.

_O objetivo durante o desafio 5 é entender o conceito de DTO e como fazer o relacionamento entre tabelas
diferentes dentro da sua API com o intuito de retornar informações personalizadas durante os testes._

<h3>🎯<span style="color:red">Desafio 6: </span></h3>
- Adicionar validações de dados;
- Adicionar **Mapper** para conversão de objetos;
- Implementar **Lombok**;

_O objetivo durante o desafio 6 é criar validação de dados, entender o conceito e utilização de Mappers,
além de conhecer a anotação @Lombok para um código mais limpo e simplificado._

<h3>🎯<span style="color:red">Desafio 7: </span></h3>
- Fazer tratamento de erros utilizando **try catch** e se necessário **finaly**;
- Fazer tratamento de eros utilizando **throw** e **@ExceptionHandler**;
- Criar classe para tratamento de erros utilizando **@ControllerAdvice**;
- Fazer testes para verificar se o resultado dos erros é o esperado.

_O objetivo do desafio 7 é aprofundar o conhecimento em tratamento de erros que tenham retorno
de forma customizadas para facilitar o entendimento dos mesmo. Utilizando thy catch para um erro 
condicional, @ExceptionHandler para retorno de mensagem explicativa do erro e o @ControllerAdvice
para ter uma forma mais clara e objetiva com a mensagem do erro._

<h3>🎯<span style="color:red">Desafio 8: </span></h3>
- Criar um **docker-compose.yml**;
- Criar um **container** contendo a nova base de dados;
- Integrar a API com a base de dados;
- Fazer testes de integração com a base de dados;

_O objetivo do desafio 8 é aprofundar o conhecimento em banco de dados e integração com uma
base dados mais fiel as usadas em aplicações reais. Uma das funções do Docker é poder definir um comportamento
caso um container apresente falhas._

<h3>🙌<span style="color:red">Considerações finais: </span></h3>
_A ideia é do mentor **Flavius Gama**, pessoa que me ajudou muito
nas dificuldades que tive pelo caminho até a conclusão. Deixo aqui expresso meus agradecimentos
pelo seu tempo e paciência que teve com seus mentorados. <br>
Tiveram algumas partes bem desafiadoras, onde travei, mas corri atrás de ajuda para conseguir
conclui-lo. Foram muitos aprendizados nessa caminhada, sei que ainda tenho muito a
aprender, mas até aqui me sinto satisfeito. Guardarei esse projeto com
muito carinho e futuramente espero voltar aqui e melhora-lo._

<h2> Diagrama</h2>
Modelo conceitual

![image](https://user-images.githubusercontent.com/96309673/150388031-daff104f-dd59-46bf-9ac2-fa67d4589c5f.png)

<h2>👨‍🔧 Fluxogramas ADMIN:</h2>

Adicionar novo artista:
![image](https://user-images.githubusercontent.com/96309673/152421556-296adf00-fbe6-4534-8d22-b2587a722145.png)

Atualizar nome de artista existente:
![img.png](img.png)

Criar álbum (vinculado ao artista já existente):
![img_1.png](img_1.png)

Adicionar música (vinculada a álbum já existente):
![img_2.png](img_2.png)

<h2>🧔 Fluxogramas USER:</h2>

Criar playlist:
![img_3.png](img_3.png)

Atualizar nome da playlist existente:
![img_4.png](img_4.png)

Adicionar música a uma playlist existente:
![img_5.png](img_5.png)

Deletar uma música playlist:
![img_6.png](img_6.png)

Buscar se uma música existe no BD:
![img_7.png](img_7.png)

Buscar se um artista existe no BD:
![img_8.png](img_8.png)
