
Esta aplicação proporciona um calculador de frete fictício para a web, com frontend (Vue 2, Bulma, Buefy e Axios) e backend (Java 11, Maven e SpringBoot). 

O usuário informa seu cep, e por meio de integração com o site ViaCep é retornado o endereço completo. Após isso, conforme solicitar o cálculo, uma requisição é disparada para o backend, que de forma simples implementa o padrão strategy para descobrir qual a treansportadora e o respectivo valor.  

## Subindo o ambiente

Primeiramente clone o repositório. Caso queira subir de forma simples e prática usando docker, abra um terminal e rode:
```
docker compose up
```
<b>OU</b> (dependendo da versão)
```
docker-compose up
```
Caso queira subir o frontend e o backend, consulte diretamente o readme de cada uma das pastas (frontend e backend, presentes na raiz do projeto)

## Links úteis deste projeto
* https://bulma.io/
* https://buefy.org/
* https://v2.vuejs.org/
* https://www.npmjs.com/package/axios
* https://viacep.com.br/

* https://maven.apache.org/
* https://start.spring.io/
* https://spring.io/


