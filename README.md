Implementar o cadastro de usuário:
- As informações do usuário são: nome, email e senha;
- Todas as informações são obrigatórias e devem ser validadas na tela.

Implementar a tela de empréstimos:
- A tela deve redirecionar para uma listagem de empréstimos, no endereço /emprestimos;
- Essa tela deve ter a lista de empréstimos (que não vai carregar pois não vamos ter persitência no momento);
- A tela de empréstimos terá um botão "novo" que redireciona o usuário para a tela de "seleção de associado" no endereço 
"/emprestimo/associado";
- A tela de seleção de associado tem a listagem de associados com um campo de filtro e um botão no lado de cada associado da lista para seleciona-lo;
- Ao selecionar o associado, o sistema é redirecionado para a tela de "seleção de livros" no endereço "/emprestimo/livros";
- A tela de seleção de livros tem a listagem de livros com um campo de filtro e um botão no lado de cada livro da lista para adiciona-lo a lista de empréstimos;
- Ao selecionar um livro ele é adicionado para o carrinho de livros, como em um site de compras e o sistema mantém o usuário na tela de seleção de livros para continuar adicionando mais títulos;
- Ainda na tela de seleção de livros, haverá um botão "Finalizar empréstimo" que ao ser clicado redireciona o usuário para uma tela com os dados do associado, bem como com a listagem de livros selecionados e dois botões "Cancelar empréstimo" e "Confirmar empréstimo".
- Ao clicar em cada um dos botões, uma mensagem é exibida na tela com a confirmação da operação.

OBS: Criar um objeto de empréstimo e guardar as informações na seção do usuário.
OBS: Não implementar a persistência ainda, somente a classe empréstimo que tem os atributos: associado e a lista de livros selecionados;
