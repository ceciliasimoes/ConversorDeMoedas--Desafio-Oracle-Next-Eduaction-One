package br.com.alura.ConversorMoedaswithNextEduOne.principal;

import br.com.alura.ConversorMoedaswithNextEduOne.dto.ValorDTO;
import br.com.alura.ConversorMoedaswithNextEduOne.services.ConsumoApi;
import br.com.alura.ConversorMoedaswithNextEduOne.services.ConverteDados;
import br.com.alura.ConversorMoedaswithNextEduOne.services.IConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private IConverteDados converteDados = new ConverteDados();
    private static final String ENDERECO ="https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/";
    private List<ValorDTO> historicoConversao = new ArrayList<>();

    public void exibeMenu(){
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
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
                    """;
            System.out.println(menu);
            opcao = this.scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    converteValores("USD","ARS");
                    break;
                case 2:
                    converteValores("ARS","USD");
                    break;
                case 3:
                    converteValores("USD","BRL");
                    break;
                case 4:
                    converteValores("BRL","USD");
                    break;
                case 5:
                    converteValores("USD","COP");
                    break;
                case 6:
                    converteValores("COP","USD");
                    break;
                case 7:
                    converteValores("BRL","EUR");
                    break;
                case 8:
                    converteValores("EUR","BRL");
                    break;
                case 9:
                    converteValores("EUR","USD");
                    break;
                case 10:
                    converteValores("USD","EUR");
                    break;
                case 11:
                    verHistorico();
                    break;
                case 0:
                    System.out.println("Encerrando aplicação....");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente!");
            }
        }
    }


    private void converteValores(String moedaBase, String moedaParaConversao) {
        System.out.println("- Insira a quantidade de " + moedaBase + " que deseja converter para " + moedaParaConversao + ":");
        var valor = this.scanner.nextDouble();
        scanner.nextLine();
        try {
            var json = this.consumoApi.obterDados(ENDERECO+moedaBase+"/"+moedaParaConversao);
            ValorDTO dados = this.converteDados.obterDados(json, ValorDTO.class);
            var valorConvertido = valor * dados.conversao();
            System.out.println(dados);
            var textoParaExibir = "O valor da conversão de " + valor + " " + moedaBase + " é igual a : " + valorConvertido + " " + moedaParaConversao;
            System.out.println(textoParaExibir);
            this.historicoConversao.add(dados);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void verHistorico() {
        this.historicoConversao.forEach(dado -> System.out.println("{"+ dado + "}"));
    }


}

