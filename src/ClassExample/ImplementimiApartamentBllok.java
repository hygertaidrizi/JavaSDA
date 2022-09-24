package ClassExample;

public class ImplementimiApartamentBllok {
    public static void main (String [] args){
        Apartament apartament1 = new Apartament(30, 5, "red", "Sun");
        Apartament apartament2 = new Apartament(30 ,9, "blue", "S");
        Apartament apartament3 = new Apartament(50, 12, "yellow", "D");
        Apartament apartament4 = new Apartament( 22, 6, "white", "G");
        Apartament apartament5 = new Apartament(40, 26, "black", "B");
        Apartament [] apartaments = new Apartament[]{apartament1, apartament2, apartament3, apartament4, apartament5};
        Bllok bllok = new Bllok(apartaments, "Shkoder");
        System.out.println(bllok.gjejApartamentin());
    }
}
