<h1>Projeto DSCommerce</h1>
<p>Projeto desenvolvido durante a formação Java Spring Professional da plataforma DEVSUPERIOR.<p>
<p>Projeto desenvolvido com Spring Boot, utilizando banco de dados H2, Maven como gerenciador de dependências e Java como linguagem.</p>
<h2> O projeto contém: </h2>
<ul>
<li>Endpoints públicos GET/produts e GET/products/{id}.</li>
<li>Endpoint de login que retorna token de acesso</li>
<li>Endpoints privados de produto (POST/PUT/DELETE) funcionando somente para usuário ADMIN</li>
<li>Endpoint GET/users/me que retorna o usuário logado</li>
<li>Endpoints GET/orders/{id} e POST/orders </li>
<li>Verificação para que o usuário que não possui o role ADMIN consiga acessar apenas seus próprios produtos. </li>
<li>EndPoint GET/categories retornando todas as categorias cadastradas.</li>
</ul>