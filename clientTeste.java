package aulaPOO;

import java.util.Scanner;

public class clientTeste {

	public static void main(String[] args) {
		
		clientes clientepj=new clientePj("Christian Patrick","23 Anos","Jundiaí/SP","Solteiro","Tamanho G", "37.677.855/0001-61");
		clientes clientepf=new ClientePf("Luis Guerreiro","25 Anos","Santos/SP","Solteiro","Tamanho G", "388.958.847-25");
		int x;		
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Você que ver as informações de: "+"\n 1-Clientes PJ"+"\n 2-Clientes PF"+"\nDIGITE APENAS O CÓDIGO");
		x=leia.nextInt();		
			if(x==1) {
		clientepj.imprimirInfo();
	}
			else if(x==2){
				clientepf.imprimirInfo();
		}
			else {
				System.out.println("\nOpção invalida!");
		}
	}
}