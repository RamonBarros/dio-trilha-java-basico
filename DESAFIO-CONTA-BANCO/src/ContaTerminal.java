import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Digite o Seu Nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Olá, Digite a Sua Agência:");
        String agencia = scanner.nextLine();
        System.out.println("Olá, Digite o Número da Sua Conta:");
        int numero = scanner.nextInt();
        System.out.println("Olá, Digite o Seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println(" Olá, "+nomeCliente+" Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", Conta " + numero+" e saldo "+saldo);

        scanner.close();
        
    }
}
