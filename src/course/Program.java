package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		// #CONVERS�O DE TIPOS#:
		double a;
		float b;
		int c;
		int d;
		String s = "33";// pode ser convertida para algum tipo num�rico prq apsar de ser uma string � um
						// n�mero, n�o poderia se fosse nome.

		a = 5.7;
		b = (float) a; // Chamamos essa convers�o de Cast - Uma varia double n�o pode ser convertida
						// para float diretamente (sem o cast)
		c = (int) a;// cast de double ---> int (Houve perda de dados 0.7)
		d = Integer.parseInt(s);
		System.out.println("b=" + b + "\n" + "c=" + c + "\n" + "Variavel s string convertida para inteiro= " + d);

		// #INPRESS�O FORMATADA#:
		char gender = 'F';
		int age = 32;
		double balance = 10.5343637;
		String name = "Maria";
		System.out.println("***************************************");
		System.out.printf("%.3f%n",balance);
		Locale.setDefault(Locale.US);//vai imprimir a variavel balance separando por ".", que � o padr�o nos EUA
		System.out.printf("%.3f%n",balance);
		System.out.println("***************************************");
		System.out.printf("%s is %d year old, gender %c, and got balance = %.2f biticoins%n",name, age, gender, balance);
		
		//#ENTRADA DE DADOS JAVA (Classe Scanner):
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();//Imprimir at� o final da frase
		String x, y, z;
		x=sc.next();
		y=sc.next();
		z=sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
	}

}
