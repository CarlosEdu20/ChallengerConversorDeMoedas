import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ApiRequest apiRequest = new ApiRequest();

        int opcao = 0;
        double valor, valorConvertido;


        try {
            while (opcao != 7) {
                System.out.println("*********************************************************");
                System.out.println("Seja bem vindo/a ao Conversor de Moeda =]");
                System.out.println("          ");
                System.out.println("1) Dolár =>> Peso argentino");
                System.out.println("2) Peso argentino =>> Dólar");
                System.out.println("3) Dolár =>> Real brasileiro");
                System.out.println("4) Real brasileiro =>> Dólar");
                System.out.println("5) Dolár =>> Peso colombiano");
                System.out.println("6) Peso colombiano =>> Dolár");
                System.out.println("7) Sair");
                System.out.println("Escolha uma opção de moedas");
                System.out.println("*********************************************************");
                System.out.println("         ");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite um valor que deseja converter: ");
                        valor = ler.nextDouble();
                        Coins coins = apiRequest.getCoins(valor);
                        valorConvertido = valor * coins.getARS();
                        System.out.println("Valor convertido: " + valorConvertido);
                        break;

                    case 2:
                        System.out.println("Digite um valor que deseja converter: ");
                        valor = ler.nextDouble();
                        coins = apiRequest.getCoins(valor);
                        valorConvertido = coins.getARS() * valor;
                        System.out.println("Valor convertido: " + valorConvertido);
                        break;




                }

            }





        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());

        }




    }
}