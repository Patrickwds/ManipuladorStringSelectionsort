import java.util.Scanner;
/**
 *
 * @author Douglas Lenfers
 * @author Patrick Menezes
 *
 */
public class stringSelectionShort {
/**
 * 
 * @param args
 */
		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			
				System.out.print("Digite uma frase :");
				String resultado = selectionSort(entrada.nextLine());
				System.out.println("Sua frase ordenada ficou assim: "+resultado);
				continuar();

		}
/**
* 
* @param frase 			Texto digitado pelo usuario.
* @return 			Separa o texto digitado pelos espaços.
*/
		public static String[] separaFrase(String frase) {
			return frase.split(" ");
		}
/**
 * 
 * 
 * @see separaFrase(frase) 	Associação entre o metodo "selectionSort" e "separaFrase".
 * @param frase 		Parametro de entrada de dados.
 * @param palavra 		Array para armazenamento dos dados vindos de separaFrase.
 * @param i 			Indice do array.
 * @param menor 		Recebe o indice i.
 * @param j 			Indice do array mais uma posição.
 * @param palavraPosterior	
 * @param resultado 		Recebe ele mesmo e o array palavra com indice e um espaço.
 * @return	 		frase ordenada sem os espaços no inicio e no fim. 
 */
		public static String selectionSort(String frase){
			String[] palavra = separaFrase(frase);
			String resultado="";
			
			for (int i = 0; i < palavra.length; i++) {
				int menor = i;
				for (int j = i + 1; j < palavra.length; j++) {
					String palavraPosterior = palavra[j];
					String palavraAtual = palavra[menor];

					if(palavraPosterior.length() < palavraAtual.length()) {
						menor = j;
					}
				}
				if(menor !=i){
				String temp = palavra[menor];
				palavra[menor] = palavra[i];
				palavra[i] = temp;
				}
			}
			for(int i = 0; i < palavra.length; i++){
				resultado += palavra[i] + " ";
			}
			return resultado.trim();
		}

		private static void continuar(){
			Scanner entrada = new Scanner(System.in);

			System.out.println("Ordenar outra frase?:");
			System.out.println("Digite \"1\" para SIM:");
			System.out.println("Digite \"2\" para NÃO:");
			int continua = entrada.nextInt(); 

			switch (continua) {
			case 1:
				main(null);
				break;
			case 2:
				System.out.print("\\-----Programa finalizado------\\");
				break;
			}
		}
}