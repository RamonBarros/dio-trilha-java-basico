import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if(parametroDois==0 || parametroUm==0){
			throw new ParametroNuloException("PARAMETROS NÃO PODEM SER NULOS");
		}

		if(parametroDois<0 || parametroUm<0){
			throw new ParametroNegativoException("PARAMETROS NÃO PODEM SER NEGATIVOS");
		}

		if(parametroDois<parametroUm) {
			throw new SegundoParametroMaiorException("SEGUNDO PARAMETRO DEVE SER MAIOR DO QUE O PRIMEIRO");
		}

		int contagem = 0;
		//realizar o for para imprimir os números com base na variável contagem

		for(int index = parametroUm; index < parametroDois; index++){
			contagem++;
			System.out.println("Imprimindo o Número:" + contagem);
		}

	}
}