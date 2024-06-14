import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            
            System.out.println("Por favor, digite o número da Conta:");
            int  conta = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            
            System.out.println("Agora, digite o número da Agência:");
            String agencia = sc.nextLine();
            
            System.out.println("Agora, digite o seu Nome Completo:");
            String nomeCliente = sc.nextLine();
            
            System.out.println("Agora, digite o saldo atual:");
            float saldo = sc.nextFloat();
            
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de R$ "+saldo+" já esta disponível para saque.");
        }
    }
}
