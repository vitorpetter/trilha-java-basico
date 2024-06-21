import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));
        double saldo = 0;
        boolean continuar = true;

        
        while (continuar) {
    
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo+= deposito;
                    System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    String validaSaque = saque > saldo || saldo == 0 ? "Saldo insuficiente." : "Saldo atual: "+ (String.format("%.1f",saldo-= saque));
                    System.out.println(validaSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    break;
                case 4:
                System.out.println("Programa encerrado.");
                continuar = false;  // Atualiza a variável de controle para encerrar o loop
                break;    
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}