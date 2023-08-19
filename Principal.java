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
				System.out.println("Usted recibira un premio");
			}
			else{
				System.out.println("ups, perdiste...")
			}
		}
	}
}

public class Regalo {
	public static String elegir (int vida){
		String gift = "";
		switch(vida) {
			case 1: gift = "Un pasaje al caribe"; break;
			case 2: gift = "Una visita al museo mas cercano a tu casa"; break;
			case 3: gift = "Una entrada al cine"; break;
		}
		return gift;
	}
}