import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) throws Exception {
        // case1(2000.0, 1500);
        // case1(2000.0, 2500);
        // case1(2000.0, 1900);
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA"};
        String[] candidatosSelecionados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        case2(candidatos);

        for(String candidato:candidatosSelecionados){
            case4(candidato);
        }

    }

    static void case1(double salarioBase, double salarioPretendido) {
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o CANDIDATO COM ONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    // Método que simula o valor pretendido

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void case2( String[] candidatos) {

        int candidatosSelecionados = 0;
        int candidatosConsultados = 0;

        for (int i = 0; i < candidatos.length; i++) {
            if (valorPretendido() <= 2000) {
                if(candidatosSelecionados >= 5){
                    candidatosConsultados++;
                    break;
                }
                System.out.println("Candidato " + candidatos[i] + " Foi Selecionado(a)");
                candidatosConsultados++;
                candidatosSelecionados++;

            } else {
                candidatosConsultados++;
            }
        }

        System.out.println("Foram Selecionados " + candidatosSelecionados + " Candidatos");
        System.out.println("Foram Consultados " + candidatosConsultados + " Candidatos");

    }

    static void case4(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
