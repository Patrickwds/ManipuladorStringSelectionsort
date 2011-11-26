import java.util.Scanner;
/**Classe com a função de ordenar de forma crescente as palavras da frase digitada pelo usuário. 
 *
 * @author Douglas Lenfers
 * @author Patrick Menezes
 *
 */
public class stringSelectionShort {

/**Método principal responsavel por obter dados, e imprimir o resultado.
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
/**Método responsavel pela separação da frase ou texto digitados no metodo principal.
* 
* @param frase 			Texto digitado pelo usuario.
* @return 			Separa o texto digitado pelos espaços.
*/
		public static String[] separaFrase(String frase) {
			return frase.split(" ");
		}
/**Método responsavel pela ondenação das palavras e sua montagem em frase novamente.
 * 
 * No inicio o array "palavra" recebe em suas posições cada palavra que foi separada no 
 * método anterior, o primeiro "for" é responsável por varrer todas as posições de 
 * "palavra" começando na primeira posição, o segundo "for" tem como inicio a segunda posição 
 * e ambos tem como fim o numero de palavras, dentro do segundo "for" temos uma condição, 
 * que compara a primeira palavra com a segunda, se a condição não for atendida o segundo 
 * "for" implementa mais uma posição comparando a primeira palavra com a terceira e assim 
 * por diante até encontrar uma menor que a palavra inicial, quando isto ocorre a uma troca o 
 * int "menor" recebe o valor de "j", saindo do segundo "for". Ficando então somente dentro
 * do primeiro "for" que também tem uma condição, se "menor" for diferente do índice "i" á 
 * uma troca, a posição no array da palavra inicial fica com o valor da palavra posterior 
 * considerada menor e o mesmo ocorre com a palavra posterior fica com o valor da palavra inicial
 * com o auxilio de uma variável temporária a String "temp". 
 *
 * 
 * @see separaFrase(frase) 	Associação entre o metodo "selectionSort" e "separaFrase".
 * @param frase 		Parametro de entrada de dados.
 * @param palavra 		Írray para armazenamento dos dados vindos de "separaFrase".
 * @param i 			Indice do array.
 * @param j 			Índice do array mais uma posição.
 * @param menor 		Recebe um indice.
 * @param palavraPosterior	Array palavra tendo como indice "j".
 * @param palavraAtual		Array palavra tendo como indice "menor".
 * @param temp			String temporaria.
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