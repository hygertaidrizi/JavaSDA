package ClassExample;

public class CastingExample {
    public static void main(String[] args) {
        byte vleraByte = 21;
        short vleraShort = vleraByte;

        int vlera = vleraShort;
        float vleraFloat = vlera;
        float vleraFloat1 = vleraByte;
        System.out.println(vleraFloat);
        char character = 'a';
        int numberOfCharacter= (int) character;
        System.out.println(numberOfCharacter);
        long vleraLong = vleraByte;
        int vlera2 = (int) vleraFloat;
        char vlera4 = (char) numberOfCharacter;
        System.out.println(vlera2);
        System.out.println(vlera4);

        long vlera6 = 1l;
        short vlera7 = (short) vlera6;
        System.out.println(vlera7);

        float vlera8= 2f;
        float vlera9= 3f;
        float vlera10= 4f;

        char character11= 'c';
        char character12= 'd';
        char character13= 'e';

        int vlera33= (int) vlera8;
        int vlera34= (int) vlera9;
        int vlera35= (int) vlera10;

        int vlera222 = (int) character11;
        int vlera333= (int) character12;
        int vlera444= (int) character13;
        System.out.println (vlera33);
        System.out.println(vlera34);
        System.out.println(vlera35);
        System.out.println(vlera222);
        System.out.println(vlera333);
        System.out.println(vlera444);



    }

}


