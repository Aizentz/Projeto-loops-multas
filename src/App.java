public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("Bem vindo ao multador App!");

        System.out.print("por favor, adicione o código de 8 dígitos do veículo: ");
        String placa = scanner.nextLine();

        while (placa.length() != 8){

            System.out.print("Placa inválida, adicione a placa do veículo: ");
            placa = scanner.nextLine();
        }

        System.out.println("""
               Entre as opções 1 e 2, qual se adequa mais a você?
               1- rua dos guararapes (principal)
               2- Avenida arantes (rota 32)
               """);
        System.out.print("escolha entre 1 e 2: ");
        int escolhaLocal = Integer.parseInt(scanner.nextLine());

        if (escolhaLocal == 1){
            int tol = 77;

            System.out.println("O limite da rua dos guararapes é de 70km/h com 7km/h de tolerância");

            System.out.print("Por favor, Adicione a velocidade do veículo alvo da multa: ");
            int velocidade = Integer.parseInt(scanner.nextLine());

            int multa = (velocidade - tol) * 10;

            System.out.println("o valor da multa é de R$"+ multa +",00. será cobrado do carro código:"+placa);
        }else if (escolhaLocal == 2){

            double tol = (double) 10 / 120 * 100;

            System.out.println("O limite da avenida arantes é de 120km/h com 10% de tolerância");

            System.out.print("Por favor, Adicione a velocidade do veículo alvo da multa: ");
            int velocidade = Integer.parseInt(scanner.nextLine());

            double tot = velocidade + tol;

            double multa = (tot - tol) * 10;



            System.out.println("o valor da multa é de R$"+ multa +". será cobrado do carro código:"+placa);

        }else{
            System.out.println("opção não esperada, reinicializando a chamada!");
        }





    }
}
