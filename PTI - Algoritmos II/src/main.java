// PTI DE Algoritmos e Programa��o II
// Aluno: Nathan de Sousa Pires - An�lise e Desenvolvimento de Sistemas.

import java.util.Scanner;
import java.util.Arrays;

public class main {
	  // O C�digo foi montado conforme est� documentado na PTI.
	  public static String verificaOrdem (int[] vetor, int index) {
		// Verifica a ordem em que est� o vetor.
		if (vetor == null || vetor.length <=1 || index == 1) {
			return "Sim";
		}
		if (vetor[index - 1] < vetor[index - 2]) {
			return "N�o";
		}
		return verificaOrdem(vetor, index - 1);
	}
	
	public static void main(String[] args) {
		int n, max, min;
		char escolher;
		do {
			Scanner sc = new Scanner(System.in);
			// Calcula e retorna o valor da maior difen�a entre dois elementos distintos no vetor.
			System.out.println("Informe o n�mero de elementos: ");
			n = sc.nextInt();
			int vetor[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.printf("Informe um n�mero inteiro para o vetor %d: ", i + 1);
				vetor[i] = sc.nextInt();
			}
		System.out.println("O seu vetor �: "+ Arrays.toString(vetor));
		max = vetor[0];
		min = vetor[0];
		for (int i = 0; i < n; i++) { 
			if (vetor[i] > max) {
				max = vetor[i];
			}
		} for (int i = 0; i < n; i++) { 
			if (vetor[i] < min) {
				min = vetor[i];
			}
		}
		
		System.out.println("O valor da maior diferen�a entre dois elementos " +
				 "distintos do vetor �: " + (max - min));
		System.out.println("O vetor est� em ordem crescente? " + verificaOrdem(vetor, vetor.length));
		System.out.println("Deseja retornar para o in�cio? (Sim/N�o)?");
		escolher = sc.next().charAt(0);
		} 
		while (escolher == 'S' | escolher == 's');
		System.out.println("Fim do programa");
	}
}