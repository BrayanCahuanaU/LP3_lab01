public class Pricnipal {
	Public stactic void main (Strinf[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Sanner(System.in);
		do{
			vida ++;
			System.out.prinln("Vida numero: " + vida + "\t¿Cual es el numero secreto?")
			rp = sc.nextInt();
			if(rp == 1234){
				fl = true;
			}
			while (vida < 3 && !fl);
			if (fl == true){
				System.out.println("Adivinaste!");
			}
			else{
				System.out.println("ups, perdiste...")
			}
		}
	}
}