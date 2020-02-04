package exe;

import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y,a;
		System.out.println("Digite valor para X");
		x=in.nextInt();

		System.out.println("Digite valor para Y");
		y=in.nextInt();

		a=x;
		x=y;
		y=a;

		System.out.println("O valor de X é "+x+" E o valor de Y é "+y);

	}

}
