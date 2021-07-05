# desafio-QA CI&T

Linguagem de programação utilizada: Java.  
Framework de automação: Selenium.

# Primeiro Teste em Gherkin.

Funcionalidade: Busca no Banco de Questões  
Cenário: Busca por questão inexistente  
Dado que navego para a página de busca do banco de questões  
E digito 'Science: Computers' no campo de busca  
Quando clico no botão de buscar  
Então visualizo uma mensagem de erro com o texto 'No questions found.'  

# Segundo Teste em Gherkin.

Funcionalidade: Busca no Banco de Categorias.  
Cenário: Busca por quantidade de questões.  
Dado que navego para a página de busca do banco de categorias  
E digito 'Science: Computers' no campo de busca  
Quando clico no botão de buscar  
Então visualizo a listagem com 25 itens e o controle de paginação.  

# Terceiro Teste em Gherkin.

Funcionalidade: Verificação de Loguin.  
Cenário: Realizar loguin na pagina.  
Dado que navego para a página de loguin do site  
E digito o usuario no campo de 'Username' e senha no campo de Password  
Quando clico no botão Entrar  
Então visualizo o painel de Usuário.  



Integrantes: Alan Wender, Gabriel Perreira, Guilherme Pedrosa e Pedro Henrique.
