import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
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
                double valor = leitura.nextDouble(); // Lê um valor com casas decimais

                // Futuramente, aqui virá a lógica de conversão
                switch (opcao) {
                    case 1:
                        // Lógica para Dólar para Real
                        System.out.println("Valor de " + valor + " [USD] corresponde a ... [BRL]"); // MUDANÇA AQUI
                        break;
                    case 2:
                        // Lógica para Real para Dólar
                        System.out.println("Valor de " + valor + " [BRL] corresponde a ... [USD]"); // MUDANÇA AQUI
                        break;
                    case 3:
                        // etc...
                        break;
                    case 4:
                        // etc...
                        break;
                    case 5:
                        // etc...
                        break;
                    case 6:
                        // etc...
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