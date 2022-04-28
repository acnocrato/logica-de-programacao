package exercicios;

// EXERCICIOS DE LOGICA DE PROGRAMACAO | PROFA. FLAVIA PEREIRA CARVALHO | FIT - CURSO DE SISTEMAS DE INFORMACAO
// ASSUNTO: FOR ANINHADO
// N. 74 | Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os numeros de 1 a 10.

public class ImprimindoTabuada {

	public static void main(String[] args) {
		
		// FOR EXTERNO -> i vai indicar o numero principal a cada ciclo.
				
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("\n\t\tTabuada do numero " + i+"\n"); 
			
			System.out.println("Soma\t\tSubtracao\tMultiplicacao\tDivisao\n");
			
			// FOR INTERNO -> j vai indicar os numeros de 1-10 que vao interagir com o numero principal.
			// 				  Também vai indicar qual operacao vai acontecer ( +, -, x e /).
			
			for (int j = 1; j<=10; j++) {
				
				System.out.println(										// OPERACOES
									i + " + " + j + " = " + (i+j) + "\t" + // ADICAO
								   (i+j)+" - "+i + " = " + ((i+j)-(i))+"\t" + // SUBTRACAO
								   i + " x " + j + " = " + (i*j) + "\t"+ // MULTIPLICACAO
								   (i*j)+ " / " + i + " = " + ((i*j) / i) // DIVISAO
								   ); 										
			}
		}
	}
}
