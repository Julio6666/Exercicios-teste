package exe;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		
		float resultado;
		
		float salario;
		


System.out.println("digite o salario atual");
salario = in.nextFloat();

resultado = (float) (salario + (salario * 0.15));

System.out.println("o salario atual é: "+resultado);

	}

}
