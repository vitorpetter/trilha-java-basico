import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Informe o Primeiro Número: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Informe o Segundo Número: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException valoresInvalidos) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if(parametroUm > parametroDois)
                throw new ParametrosInvalidosException();
        
            int contagem = parametroDois - parametroUm;
                       
                for(int i = 1;i <= contagem; i++){
                    System.out.println("Imprimindo o número " + i);
                    
                }
    }
}
