## ASSESSMENT - AT (FUNDAMENTOS DO DESENVOLVIMENTO JAVA)

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

​				O projeto construído até o momento, foi realizado totalmente focando no aprendizado em **" Java Desktop"** desse trimestre. Todavía, já fizemos um pré-preparo da nossa aplicação com o framework **Spring Boot**, para que se desse procedência ao próximo trimestre, onde faremos uso do Java na parte **Web**.



