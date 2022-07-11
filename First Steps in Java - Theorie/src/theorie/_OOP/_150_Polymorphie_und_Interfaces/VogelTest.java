package theorie._OOP._150_Polymorphie_und_Interfaces;

public class VogelTest {

	public static void main(String[] args) {
		Amsel amselVar = new Amsel();
		amselVar.kannFliegen();
		System.out.println(amselVar.melodieSingen());
		amselVar.geschlechterFarbenAusgeben();
		
		System.out.println();
		Vogel vogelVar = new Vogel();
		vogelVar.kannFliegen();
		System.out.println(vogelVar.melodieSingen());
		//vogelVar.geschlechterFarbenAusgeben funktioniert nicht, da die Klasse Vogel die Methode nicht kennt
		
		System.out.println();
		VogelGesang vgVar = new Vogel();
		vgVar.melodieSingen(); //vgVar.melodieSingen ist nicht implementiert!
		
		System.out.println();
		Vogel vogelVar2 = new Amsel();
		vogelVar2.kannFliegen();
		System.out.println(vogelVar2.melodieSingen());
		//vogelVar2.geschlechterFarbenAusgeben();  //Compiler kennt keine Methoden des Objekts Amsel, sondern kennt nur Methoden des Referenztyps
		
		System.out.println();
		if(vogelVar2 instanceof Amsel) {						//Während der Laufzeit des Programms weiß die JVM sehr wohl, auf welches
			((Amsel)vogelVar2).geschlechterFarbenAusgeben();	//Objekt die Referenz zeigt, weshalb wir mit einer vorigen instanceof Prüfung
																//kontrollieren können, ob die Referenz wirklich dem Typ entspricht, von dem wir
																//Methoden aufrufen wollen
		}
		
		Vogel vogelVar3 = new Vogel();
		//Amsel amselVar2 = (Amsel)vogelVar3;					//Der explizite Cast auf Amsel überschreibt das normaler Compiler Verhalten
																//Der Compiler akzeptiert diesen Cast, denn mit dem expliziten Cast glaubt 
																//der Compiler es handle sich um eine Amsel wird in eine. Die JVM erkennt es ist keine Amsel
																//und wirft eine "ClassCastException". Vor expliziten Typ-Casts immer mit instanceof
																//sicherstellen, dass es sich wirklich um den richtigen Typen handelt
		System.out.println();
		VogelGesang vgVar2 = new Vogel();
		vgVar2 = amselVar;
		
		if(vgVar2 instanceof Amsel) {
			((Amsel)vgVar2).geschlechterFarbenAusgeben();
		}
																
	}

}
