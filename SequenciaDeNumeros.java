package exercicios;

// EXERCICIOS DE LOGICA DE PROGRAMACAO | PROFA. FLAVIA PEREIRA CARVALHO | FIT - CURSO DE SISTEMAS DE INFORMACAO
// ASSUNTO: FOR ANINHADO
// N. 75 | Escreva um algoritmo que imprima as seguintes seq��ncias de n�meros: (1, 1 2 3 4 5 6 7 8 9 10) 
// (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente,
// at� que o primeiro n�mero (antes da v�rgula), tamb�m chegue a 10.

public class SequenciaDeNumeros {
	
	public static void main(String[] args) {
		
		// FOR EXTERNO -> "i" vai indicar o numero principal e abrir os "(".
		// FOR INTERNO -> "j" vai contar de 1 at� 10 e "k" vai fechar o ")".
				
		for (int i = 1; i<= 10; i++) {
			System.out.print("("+i+",");
			for (int j = 1; j<= 10; j++) {
				System.out.print(" "+j);
			}
			for ( int k = 1; k <= 1; k++) {
				System.out.print(")");
			}
		}
	}
}
