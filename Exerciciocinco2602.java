import  java.util.Scanner ;

public class Exerciciocinco2602 {
	public  static  void  main ( String [] args ) {
		int num, soma = 0 ;
		Scanner leia =new  Scanner ( System.in );
		do{
			System.out.println ( " Digite um número: " );
			num = leia . nextInt ();}
		while (num == 0);
		{
			soma = soma + num;
		}
		do {
			System.out.println ( " ok " );
		}
		while(num != 0 );
		System .out. println ( " A soma das idades diferentes de zero (0) é: " + soma);
	}
}
