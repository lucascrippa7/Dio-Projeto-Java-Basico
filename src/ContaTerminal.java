import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o numero da sua conta");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o numero da Agência");
        agencia = sc.next();

        System.out.println("Por favor, digite o seu nome");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o seu saldo");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}