import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        // Loop for para iterar sobre os saques
        for (int i = 1 ;limiteRestante > 0; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteRestante -= valorSaque;
                System.out.println("Saque realizado. Limite restante: "+limiteRestante);
                System.out.println(i);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}