import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
    
    public static void main(String[] args) {
        String[] candidatos = {"Felipe","Rennan","Vitor","Willian","Samuel"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);

        }
        
        }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do{
                atendeu= atender();
                continuarTentando =!atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso.");


            }while(continuarTentando && tentativasRealizadas<3);
            if(atendeu)
                System.out.println("Conseguimos contato com" + candidato + "NA" + tentativasRealizadas + "tentativa");
                else
                System.out.println("Não conseguimos contato com" + candidato + ", número maximo de tentativas" + tentativasRealizadas + "Realizada");
        }
    
     static  boolean atender() {
            return new Random().nextInt(3)==1;
        }
    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe","Rennan","Vitor","Willian","Samuel"};

        System.out.println("imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato ne nº" + (indice+1) + "é" + candidatos[indice]);
        }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe","Rennan","Vitor","Willian","Samuel","Henrique","Ana","Simone","Marcela","Isis"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual< candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "solicitou esse valor de salário" + salarioPretendido);
        }   if(salarioBase >= valorPretendido() ){
            System.out.println("O candidato" + candidatos + "foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }
        static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase==salarioPretendido)
        System.out.println("Ligar para o candidato com contra proposta");
        else {
            System.out.println("Aguardando resultado dos demais candidato");
        }
    }
}