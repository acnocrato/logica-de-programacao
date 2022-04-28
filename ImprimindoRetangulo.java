package exercicios;

// CADETES JAVA
// ASSUNTO: FOR ANINHADO + CONCEITO DE LINHAS E COLUNAS (MATRIZ)
// TASK | DESENHAR UM AS BORDAS DE UM RETÂNGULO COM DE 10 LINHAS E 60 COLUNAS


public class ImprimindoRetangulo {

	public static void main(String[] args) {

		// Y = LINHAS
		// X = COLUNAS

		// 10 LINHAS
		for(int y = 1; y <= 10; y++) {
			System.out.print("\n+");

			// 60 COLUNAS
			for (int x = 1; x<=60; x++) {

				// PRENCHER COM " " DAS LINHAS 2 ATÉ A 9 + DA COLUNA 2 ATÉ A 59.
				if (y > 1 && y <= 9 && x>=1 && x<=59) {
					System.out.print(" ");
				// PLANTA + NO QUE SOBRAR 
				} else {
					System.out.print("+");
				}
			}
		}
	}

}
