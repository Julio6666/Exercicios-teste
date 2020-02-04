package exe;

import java.util.Arrays;
import java.util.Scanner;

public class Ordem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int valor[] = new int[3];

		for(int i=0; i<valor.length; i++){
		System.out.println("Digite um valor");
		valor[i]=in.nextInt();
	

		

		}

		Arrays.sort(valor);
		
		for(int j = 0; j<valor.length;j++) {
			System.out.println(valor[j]);
			
			
		}
		
		
		

	}

}
