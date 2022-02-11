<center>
<img src="https://user-images.githubusercontent.com/96309673/153507245-372d54f1-1c31-4d01-84f1-e96ff9dcb9f4.png">
</center>


<h2> Sobre </h2>

O projeto é um desafio back-and da **Beca Java - NTT DATA BRASIL**. 
<br>Uma versão bem simploria do tão querido Spotify.</br>
O projeto foi dividido em 8 partes que estão descritas em cada desafio.


<h2> 📖 Sumário </h2>

<li>  O que é possível fazer</li>
<li>  Lista dos desafios</li>
<li>  Tecnologias utilizadas</li>
<li>  Resumo dos desafios</li>
<li>  Considerações finais</li>
<li>  Diagrama</li>
<li>  Fluxogramas</li>

<h2> 💡 O que é possível fazer</h2>
<li> Pesquisar músicas</li>
<li>  Pesquisar artistas</li>
<li>  Pesquisar coletanias</li>
<li>  Criar sua propria playlist</li>

<h2>📑 Lista de desafios</h2>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/desafio1"> Desafio 1</a> </li>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/desafio2"> Desafio 2</a> </li>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio3"> Desafio 3</a> </li>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio4"> Desafio 4</a> </li>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio5"> Desafio 5</a> </li>
<li> <a href= "https://github.com/almeidaguil/becaDesafioGuilherme/tree/Desafio6"> Desafio 6</a> </li>

<h2> 🛠 Tecnologias utilizadas</h2>
<li> IntelliJ IDEA</li>
<li>  Spring Boot</li>
<li>  Linguagem Java</li>
<li>  Postman</li>
<li>  Banco de dados H2</li>
<li>  Banco de dados MySql</li>


<h2> 📃 Resumo dos desafios</h2>
<h3>🎯<span style="color:red">Desafio 1: </span></h3>
<li>  Criar um projeto Spring Boot, implementar classes base da API;</li>
<li>  Criar um repositório no git onde será feita a entrega dos desafios;</li>
<li>  Fazer commit na brach "main" junto com o Readme.md.</li>
<p><i>O objetivo durante o desafio 1 é entender o conceito de POO, criar uma modelagem e um 
pequeno resumo sobre o que será a API, ter o primeiro contato com o Spring Boot e github.</i> </p>

<h3>🎯<span style="color:red">Desafio 2: </span></h3>
<li>  Criar classes <b>controllers</b> (<i>CRUD</i>);</li>
<li> Implementar <b>OpenAPI</b> na <b>Spring Rest API</b>;</li>
<li> Implementar <b>ResponseEntity</b> para retorno das chamadas.</li>

<i>O objetivo durante o desafio 2 é entender o conceito de CRUD(Create, Read, Update, Delete) e como 
utilizar e o ResponseEntity dentro de uma aplicação.</i>

<h3>🎯<span style="color:red">Desafio 3: </span></h3>
<li>  Criar classe(s) de <b>serviço(s)</b>;</li>
<li>  Implementar <b>interfaces</b> e declarar métodos que irá utilizar;</li>
<li>  Fazer a integração com as camadas <b>controllers</b>.</li>

<i>O Objetivo durante o desafio 3 é entender o conceito de serviços e interfaces, como fazer a utilização
e implementação de ambos além de facilitar futuras atualizações em seu projeto.</i>

<h3>🎯<span style="color:red">Desafio 4: </span></h3>
<li>  Criar classe(s) de <b>repository</b>;</li>
<li>  Configurar <b>banco de dados H2</b>;</li>
<li>  Implementar na(s) camada(s) de <b>serviço(s)</b>;</li>
<li>  Fazer <b>testes</b> para certificar a integridade da base de dados.</li>

<i>O objetivo durante o desafio 4 é conhecer a classe repository e como integra-lá dentro de uma API,
além de ter um primeiro contato com um banco de dados em memória e testar a integridade dos dados 
inseridos.</i>

<h3>🎯<span style="color:red">Desafio 5: </span></h3>
<li>  Aplicar conceito de <b>DTO</b>(Data Transfer Object);</li>
<li>  Fazer relacionamento das tabelas da API;</li>
<li> Criar end-point para retornar um DTO personalizado.</li>

<i>O objetivo durante o desafio 5 é entender o conceito de DTO e como fazer o relacionamento entre tabelas
diferentes dentro da sua API com o intuito de retornar informações personalizadas durante os testes.</i>

<h3>🎯<span style="color:red">Desafio 6: </span></h3>
<li>  Adicionar validações de dados; </li>
<li>  Adicionar <b>Mapper</b> para conversão de objetos;</li>
<li>  Implementar <b>Lombok</b>;</li>

<i>O objetivo durante o desafio 6 é criar validação de dados, entender o conceito e utilização de Mappers,
além de conhecer a anotação @Lombok para um código mais limpo e simplificado.</i>

<h2> Diagrama</h2>
Modelo conceitual

<img src="https://user-images.githubusercontent.com/96309673/150388031-daff104f-dd59-46bf-9ac2-fa67d4589c5f.png">

<h2>👨‍🔧 Fluxogramas ADMIN:</h2>

Adicionar novo artista:
<img src="https://user-images.githubusercontent.com/96309673/152421556-296adf00-fbe6-4534-8d22-b2587a722145.png">

Atualizar nome de artista existente:
<img src="https://user-images.githubusercontent.com/96309673/153522950-8fbb2d61-6b91-4479-89dc-18b2b7de7d8d.png">

Criar álbum (vinculado ao artista já existente):
<img src="https://user-images.githubusercontent.com/96309673/153522978-9f8125ec-9ade-4680-9df9-36bf90996625.png">

Adicionar música (vinculada a álbum já existente):
<img src="https://user-images.githubusercontent.com/96309673/153522991-170af4c5-adc2-4506-ac94-d859cf23340e.png">

<h2>🧔 Fluxogramas USER:</h2>

Criar playlist:
<<img src="https://user-images.githubusercontent.com/96309673/153523008-1dae3123-9a39-466b-bab0-fa7f83d96c5b.png">

Atualizar nome da playlist existente:
<img src="https://user-images.githubusercontent.com/96309673/153523024-f66085e2-2312-4033-815e-ac8e0a222165.png">

Adicionar música a uma playlist existente:
<img src="https://user-images.githubusercontent.com/96309673/153523042-fefb7e7e-e003-4053-8007-b477bac8fdee.png">

Deletar uma música playlist:
<img src="https://user-images.githubusercontent.com/96309673/153523055-9bed0ee7-032d-4603-859f-7aaa6a433de4.png">

Buscar se uma música existe no BD:
<img src="https://user-images.githubusercontent.com/96309673/153523071-e3e1119c-876e-4a26-a591-8acbbee035ba.png">

Buscar se um artista existe no BD:
<img src="https://user-images.githubusercontent.com/96309673/153523080-bd44d3ee-7d61-4e6a-a624-655d2b15818b.png">
