import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do{
			numerovidas(vida);
			System.out.println("Vida numero: " + vida + "\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if(rp == 1234){
				fl = true;
			}
		}
		while (vida < 3 && !fl);
			if (fl == true){
				System.out.println("Adivinaste!");
				System.out.println("Ganaste un premio");
				String salida = Regalo.elegirRegalo(vida);
			}
			else{
				System.out.println("ups, perdiste...");
			}
	}	
	
	
	public static int numerovidas(int vida){
		vida ++;
		return vida;
	}
}import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do{
			numerovidas(vida);
			System.out.println("Vida numero: " + vida + "\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if(rp == 1234){
				fl = true;
			}
		}
		while (vida < 3 && !fl);
			if (fl == true){
				System.out.println("Adivinaste!");
				System.out.println("Ganaste un premio");
				String salida = Regalo.elegirRegalo(vida);
			}
			else{
				System.out.println("ups, perdiste...");
			}
	}	
	
	
	public static int numerovidas(int vida){
		vida ++;
		return vida;
	}
}
