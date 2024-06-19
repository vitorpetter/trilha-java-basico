package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com Sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o "+ candidato + " na " + tentativasRealizadas + "ª tentativa");
        }else
            System.out.println("Não conseguimos contato com o "+ candidato + ", número de tentativas "+ tentativasRealizadas);

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }  

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice=0;indice < candidatos.length;indice++){
           System.out.println("O candidato de nº "+ (indice+1) + " é "+ candidatos[indice]); 
        }
    }

    static void selecaoCandidatos (){
        
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a próxima fase.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // static void analisarCandidato (double salarioPretendido){
    //     double salarioBase = 2000.0;
    //     if(salarioBase > salarioPretendido){
    //         System.out.println("Ligar para o candidato");
    //     } else if(salarioBase==salarioPretendido){
    //         System.out.println("Ligar para o candidato com contra proposta");
    //     }else{
    //         System.out.println("Aguardando o resultado dos demais candidatos");
    //     }
    // }
}
