import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class Principal {

    //Metodo para realizar a conversão
    public static void converterMoeda(String moedaBase, String moedaAlvo, double valor, ConsultaMoeda consulta) {
        String jsonResposta = consulta.buscaCotacao(moedaBase);

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResposta, JsonObject.class);
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double taxa = conversionRates.get(moedaAlvo).getAsDouble();

        double valorConvertido = valor * taxa;

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%.2f %s corresponde ao valor de %.2f %s %n", valor, moedaBase, valorConvertido, moedaAlvo);
        System.out.println("--------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        int opcao = 0;

        String menu = """
                *************************************************
                Seja bem-vindo/a ao Conversor de Moedas!
                
                1) Dólar =>> Real Brasileiro
                2) Real Brasileiro =>> Dólar
                3) Dólar =>> Euro
                4) Euro =>> Dólar
                5) Dólar =>> Peso Argentino
                6) Peso Argentino =>> Dólar
                7) Sair
                
                Escolha uma opção válida:
                *************************************************
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Digite o valor que deseja converter:");
                double valor = leitura.nextDouble();

                // Lógica de conversão agora está mais limpa
                switch (opcao) {
                    case 1: // Dólar para Real
                        converterMoeda("USD", "BRL", valor, consulta);
                        break;
                    case 2: // Real para Dólar
                        converterMoeda("BRL", "USD", valor, consulta);
                        break;
                    case 3: // Dólar para Euro
                        converterMoeda("USD", "EUR", valor, consulta);
                        break;
                    case 4: // Euro para Dólar
                        converterMoeda("EUR", "USD", valor, consulta);
                        break;
                    case 5: // Dólar para Peso Argentino
                        converterMoeda("USD", "ARS", valor, consulta);
                        break;
                    case 6: // Peso Argentino para Dólar
                        converterMoeda("ARS", "USD", valor, consulta);
                        break;
                }
            } else if (opcao != 7) {
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("Programa finalizado.");
        leitura.close();
    }
}