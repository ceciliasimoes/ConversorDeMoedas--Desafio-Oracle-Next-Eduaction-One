
---

# Conversor de Moedas - Desafio Oracle Next Education One 💱

Neste emocionante desafio de programação, convidamos você a construir o seu próprio Conversor de Moedas. Você aprenderá a fazer requisições a uma API de taxas de câmbio, a manipular dados JSON e, por fim, a filtrar e exibir as moedas de interesse. Prepare-se para uma experiência prática e empolgante no desenvolvimento Java!

## Objetivo

Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

## Funcionalidades

- Conversão de moedas usando dados dinâmicos de uma API de taxas de câmbio.
- Interação textual com o usuário via console.
- Histórico das conversões realizadas.
- Menu com no mínimo 6 opções de conversão.

## Tecnologias Utilizadas

- Java
- API ExchangeRate-API
- Biblioteca Jackson para manipulação de JSON

## Estrutura do Projeto

- `br.com.alura.ConversorMoedaswithNextEduOne.services`: Contém as classes principais do serviço, incluindo a lógica de conversão de moedas e a comunicação com a API.
- `br.com.alura.ConversorMoedaswithNextEduOne.models`: Contém a classe `ValorDados` que modela os dados recebidos da API.

## Instruções para Execução

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Biblioteca Jackson

### Configuração da API Key

Antes de executar o programa, é necessário obter uma API key da ExchangeRate-API e substituir no código da Main.java, na constante ENDERECO.

### Passo a Passo

1. Clone este repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile o projeto:
    ```sh
    javac -d bin src/br/com/alura/ConversorMoedaswithNextEduOne/services/*.java src/br/com/alura/ConversorMoedaswithNextEduOne/models/*.java
    ```
4. Execute o programa:
    ```sh
    java -cp bin br.com.alura.ConversorMoedaswithNextEduOne.services.Main
    ```

## Exemplo de Uso

Ao executar o programa, você verá um menu como o seguinte:

```
***BEM-VINDO AO SEU CONVERSOR DE MOEDAS!***
Escolha a opção de conversão que deseja realizar!
1 - Dólar >> Peso Argentino
2 - Peso Argentino >> Dólar
3 - Dólar >> Real Brasileiro
4 - Real Brasileiro >> Dólar
5 - Dólar >> Peso Colombiano
6 - Peso Colombiano >> Dólar
7 - Real Brasileiro >> Euro
8 - Euro >> Real Brasileiro
9 - Euro >> Dólar
10 - Dólar >> Euro
11 - Ver Histórico de moedas correspondentes
0 - Encerrar
```

Selecione uma opção, insira a quantidade de moeda que deseja converter e veja o resultado exibido no console.

## Contextualização do Código

### Classe Principal (`Main`)

A classe `Main` é responsável pela interação com o usuário, exibindo o menu e capturando as entradas. Ela utiliza `ConsumoApi` para obter os dados de conversão e `ConverteDados` para processar esses dados.

### `ConsumoApi`

Essa classe faz a requisição HTTP para a API de taxas de câmbio e retorna os dados em formato JSON.

### `ConverteDados`

Implementa a interface `IConverteDados` e converte os dados JSON para um objeto `ValorDados`.

### `ValorDados`

Essa classe modela os dados de conversão de moeda, incluindo a taxa de conversão.

---

## Dependências

Certifique-se de incluir as seguintes dependências em seu projeto (por exemplo, se estiver usando Maven):

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.12.3</version>
</dependency>
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
    <version>2.12.3</version>
</dependency>
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar este projeto.

## Licença

Este projeto está licenciado sob os termos da licença MIT.

---
