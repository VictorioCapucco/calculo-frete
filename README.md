
Esta aplicação proporciona um calculador de frete fictício para a web, com frontend (Vue 2, Bulma, Buefy e Axios) e backend (Java 11, Maven e SpringBoot). 

O usuário informa seu cep, e por meio de integração com o site ViaCep é retornado o endereço completo. Após isso, conforme solicitar o cálculo, uma requisição é disparada para o backend, que de forma simples implementa o padrão strategy para descobrir qual a treansportadora e o respectivo valor.  


## Configurando Frontend

Clone o repositório e abra a pasta frontend no editor desejado, rode no terminal o comando <b>npm install</b> e em seguida <b>npm run serve</b>. Abra no navegador com o endereço http://localhost:3000/ e teste a aplicação. 

## Configurando Backend

Abra a pasta backend no IDE desejado e importe como um projeto maven. Tenha o Java 11 e configure para o ambiente. Em seguida, se estiver utilizando IntelliJ, vá até o Run/Debug Configurations, clicando em Current File:

![Screenshot from 2022-12-19 20-02-27](https://user-images.githubusercontent.com/65973246/208544917-d14c5466-6d78-4557-9c44-5376fc133738.png)

Clique em add new run configuration, selecione maven, deixe da seguinte forma, clique em apply, depois em ok e por fim, execute o projeto clicando em run ou debug:

![Screenshot from 2022-12-19 20-01-44](https://user-images.githubusercontent.com/65973246/208545288-405b4a15-490c-4aaa-9ae8-5fb65d3eb5ec.png)

## Links úteis deste projeto
* https://bulma.io/
* https://buefy.org/
* https://v2.vuejs.org/
* https://www.npmjs.com/package/axios
* https://viacep.com.br/

* https://maven.apache.org/
* https://start.spring.io/
* https://spring.io/


