package exe;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		
        int num; 
		
		int numd=0;
		
		int i =1;
		
		
		
		System.out.println("digite o numero");
		num=in.nextInt();
		
	
		while(i<=num){
			if(num % i ==0){
				numd++;
			}
			i++;
		}
			
	if(numd==2){
		System.out.println("o numero e primo");
		
	}else{
		System.out.println("o numero não e primo");
	}

	}

}
