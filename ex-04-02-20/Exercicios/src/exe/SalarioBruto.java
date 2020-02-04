package exe;

import java.util.Scanner;

public class SalarioBruto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		float resultado;
		
		float salario;
		
		float retira;
		


System.out.println("digite o salario atual");
salario = in.nextFloat();

resultado = (float) (salario + (salario * 0.10));

retira = (float) (resultado -(salario * 0.20));

System.out.println("o salario atual é: "+retira);


	}

}
