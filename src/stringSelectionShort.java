 import java.util.Scanner;

public class stringSelectionShort {

		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);

			while (true) {
				System.out.print("Digite uma frase :");
				String resultado = selectionSort(entrada.nextLine());
				System.out.println(resultado);
			}

		}
		public static String[] separaFrase(String frase) {
			return frase.split(" ");
		}

		static String selectionSort(String frase){
			String[] palavra = separaFrase(frase);
			String resultado="";
			
			for (int i = 0; i < palavra.length; i++) {
				int menor = i;
				for (int j = i + 1; j < palavra.length; j++) {
					String palavraAtual = palavra[j];
					String palavraPosterior = palavra[menor];

					if(palavraAtual.length() < palavraPosterior.length()) {
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
}
