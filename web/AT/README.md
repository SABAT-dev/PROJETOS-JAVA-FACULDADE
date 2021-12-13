## ASSESSMENT - AT (DESENVOLVIMENTO WEB COM JAVA EE)

​			:white_check_mark: Nesse projeto final (Assesment) da faculdade, eu tive **um grande desafio**, mas com alguns ***níveis intermediários*** e ***avançados*** em Java: :mortar_board: :computer: 

------

​				Dentro do projeto, eu tinha como objetivo escolher uma **temática** para meu sistema e desenvolver todo o conhecimento aprendido ao decorrer do trimestre. A partir da escolha, o professor que ministrava as aulas iria **definir**:

####  			Classes do Sistema

```java
Temática: Gestão de TV por assinatura na web.

Plano (principal);
Cliente (associação);
Servico (mãe);
Filme (filha);
Serie (filha);
Esporte (filha);
```

​				As classes acima foram definidas como **regra de negócio** e também para se ter uma **ideia geral do sistema**. Tais classes, foram colocadas dentro de um mesmo pacote *"appcanal.model.domain"*. Além disso, seria preciso também:

#### 			Classes de Teste

```java
ClienteTeste;
PlanoTeste;
ServicoTeste;
ArquivoTeste (leitura);
```

​				As classes acima ficaram responsáveis pelos **testes** realizados do algoritmo e **verificar** se tudo estava ocorrendo de maneira correta. Tais classes, foram colocadas dentro de um mesmo pacote *"appcanal.testes"*. Ademais, foi implementado também:

#### 			Classes de Exceção

```java
TaxaNegativaException;
TaxaMaximaException;
```

​				As classes acima tinham como objetivo tratar as exceções presentes nas "Classes de Teste" e foram colocadas dentro de um mesmo pacote *"appcanal.model.domain.excecoes"*. Por fim, foi implementada mais um item ao código:

#### 			Classe de Leitura

```java
ArquivoTeste;
```

​				Essa foi a única classe que tinha como intuito realizar a leitura de um arquivo: **"planos.txt"**, mas que estava presente no pacote *"appcanal.testes"*.



### OBSERVAÇÃO:

​				O projeto construído, foi realizado totalmente focando no aprendizado adquirido no trimestre anterior em **"Java Desktop"** e no fim desse trimestre em **" Java Web"**, para conclusão desse primeiro período. Logo, caso queira ver o sistema funcionando, segue o roteiro abaixo:

**LOADER**

| Apague o  seu banco de dados.                                |
| ------------------------------------------------------------ |
| Rode a  aplicação e veja se as tabelas foram criadas (uma para cada classe e a de  relacionamento). |
| Observe se em  cada tabela tem pelo menos um registro.       |

**ACESSO DO USUÁRIO**

| Tente acessar o sistema com uma credencial (email/senha) inexistente. |
| ------------------------------------------------------------ |
| A mensagem de usuário inválido deve ser apresentada.         |
| Verifique se os menus de cadastros não aparecem sem um usuário logado. |
| Acesse o sistema e cadastre um novo usuário pelo link de signup. |
| Tente acessar o sistema com as credenciais do usuário admin. |
| Clique no menu de usuários para listar todos os registros existentes no banco. |
| A tela home deve ser apresentada com o nome do usuário utilizado nas credenciais de login. |
| A listagem de usuários deve estar organizada alfabeticamente de forma crescente através do nome. |

**PLANO: CLIENTES E SERVIÇOS**

| Clique  no menu de pedidos para listar todos os registros existentes no banco. |
| ------------------------------------------------------------ |
| Verifique se  além dos dados cadastrais também está sendo exibida a informação do  cliente deste plano e da quantidade de serviços. |
| Clique no menu  de clientes para listar todos os registros existentes no banco. |
| Faça a  inclusão de um cliente e verifique se existe algum critério de ordenação. |
| Clique no menu  de filmes para listar todos os registros existentes no banco. |
| Faça a  inclusão de uma filme e verifique se existe algum critério de ordenação. |
| Clique no menu  de séries para listar todos os registros existentes no banco. |
| Faça a  inclusão de uma série e verifique se existe algum critério de ordenação. |
| Clique no menu  de esportes para listar todos os registros existentes no banco. |
| Faça a  inclusão de uma esporte e verifique se existe algum critério de ordenação. |
| Clique no menu  de serviços para listar todos os registros existentes no banco de forma ordenada. |

**PLANOS**

| Crie um  novo plano com o cliente e os três serviços cadastrados. |
| ------------------------------------------------------------ |
| Verifique no  campo "select" se todos os clientes cadastrados aparecem ordenados. |
| Verifique no  campo "checkbox" se todos os serviços cadastrados aparecem ordenados. |
| Após a  inclusão verifique se os planos aparecem de forma ordenada. |

**USUÁRIO**

| Faça o  logout no sistema e entre com o novo usuário.        |
| ------------------------------------------------------------ |
| Clique no menu  de usuários para listar todos e confirme se a opção de exclusão está invisível. |
| Verifique se  os dois usuários cadastrados têm algum critério de ordenação. |

**PLANO DE NOVO USUÁRIO**

| Clique  no menu de planos para cadastrar um novo registro.   |
| ------------------------------------------------------------ |
| Verifique se existe uma indicação de ausência de clientes e de serviços. |
| Faça a  inclusão de um cliente e verifique se aparece apenas um registro na  lista. |
| Faça a  inclusão de um filme, de uma série e de um esporte e verifique se aparece apenas um registro em cada listagem. |
| Verifique se aparecem apenas três registros na lista de serviço de forma ordenada. |
| Clique no menu de planos e realize o cadastro de um novo registro. |
| Vá ao menu de usuário para confirmar a quantidade de clientes, serviços e planos por usuário. |

**EXCLUSÃO**

| Faça o  cadastramento de um novo usuário e acesse com as credenciais desse usuário. |
| ------------------------------------------------------------ |
| Faça a  inclusão de um filme, uma série, um esporte, um cliente e de um plano |
| Faça a  exclusão de algum plano e veja se a listagem foi atualizada, além da  listagem de usuários. |
| Faça a  exclusão deste filme e veja se a listagem foi atualizada, além da listagem  de serviços e de usuários. |
| Faça a  exclusão desta série e veja se a listagem foi atualizada, além da listagem  de serviços e de usuários. |
| Faça a  exclusão deste esporte e veja se a listagem foi atualizada, além da  listagem de serviços e de usuários. |
| Faça a  exclusão deste cliente e veja se a listagem foi atualizada, além da listagem de usuários. |

**INTEGRIDADE**

| Tente  fazer a exclusão de um cliente que esteja associado a um plano. Não deve  permitir e emitir uma mensagem. |
| ------------------------------------------------------------ |
| Tente fazer a  exclusão de um filme que esteja associada a um plano. Não deve permitir e  emitir uma mensagem. |
| Tente fazer a  exclusão de uma série que esteja associada a um plano. Não deve permitir e  emitir uma mensagem. |
| Tente fazer a  exclusão de um esporte que esteja associada a um plano. Não deve permitir  e emitir uma mensagem. |
| Agora tente  excluir algum registro - através do menu de serviços - que esteja associado a  um plano. Mesma regra. |

**FIM**

| Vá ao  menu de usuário e exclua um registro e verifique no banco se todos os  registros associados foram excluídos. |
| ------------------------------------------------------------ |
| Faça o logout  no sistema, confirme se os menus sumiram e tente entrar com o usuário  excluído. |
