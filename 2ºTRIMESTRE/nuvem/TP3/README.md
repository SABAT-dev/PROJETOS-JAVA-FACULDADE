###  TESTE DE PERFORMANCE - TP3 (DESENVOLVIMENTO DE SERVIÇOS EM NUVEM COM JAVA)

​			:white_check_mark: Nesse terceiro projeto (TP3) da faculdade, eu tive como objetivo a criação de um **Cadastramento de Usuários**, onde nele deverá ter os campos:

```java
nome, email, telefone, CEP e endereço (o campo email será a chave de busca).
```

​				Esses dados precisam ser gravados em um banco de dados **AWS RDS** (configurado por mim).

​				O **campo CEP** foi usado para buscar o endereço completo através do serviço:

```java
 https://viacep.com.br/
```

​				O usuário deverá digitar o CEP e o sistema irá preencher os **campos do endereço**, exceto o **número **e o **complemento**.

​				Além disso, subimos uma **foto do usuário** para ser armazenada em um bucket do **AWS S3** (configurado por mim). :books:

------

#### OBSERVAÇÕES:

- Tive a opção de realizar o projeto via **tela** ou via **Postman**, onde resolvi fazê-lo pelo Postman;

- Para o _AWS RDS_, implementei:

  ```java
  consulta, inclusão e alteração de dados.
  ```

- Para o _AWS S3_, implementei:

  ```java
  consultar, enviar e deletar
  ```

- O projeto está configurado para ser startado na porta **8081**;
- Foi utilizado o programa **DBeaver**, para acompanhar CRUD no banco AWS RDS;
- Para **alterar** um usuário, é preciso adicionar seu **ID e ID_ENDERECO**;
- Os métodos de deletar para RDS e S3 _não estão funcionando bem_.
