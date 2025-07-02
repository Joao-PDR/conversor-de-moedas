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
        }

        System.out.println("Programa finalizado.");
        leitura.close();
    }
}
