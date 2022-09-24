package ClassExample;

public class IndividImplementim {
    public static void main (String []args) {


        Individ hygerta = new Individ("Hygerta", "Idrizi", 24,
                163, "femer", "e martuar", "translator",
                35000, 03 / 02 / 1998, false, true, false);
        Individ eltion = new Individ("Eltion", "Kuptrija", 27, 170, "mashkull",
                "i martuar", "IT", 35000, 01/01/1996, true, true, false);
        Individ elvis = new Individ("Elvis", "Kavaja", 28, 177, "mashkull","e martuar", "IT", 40000, 01/01/1994,
                true, false, false);
        Individ ester = new Individ("Ester", "Dervishi", 21, 168, "femer", "beqare", "studente", 0, 01/01/2001,
                false, true, true);


System.out.println ("Personi 1:");
        System.out.println(hygerta.getEmri());
        System.out.println(hygerta.getMbiemri());
        System.out.println(hygerta.getGjinia());


        System.out.println( "  ");
        System.out.println ("Personi 2:");
        System.out.println(eltion.getEmri());
        System.out.println(eltion.getMbiemri());
        System.out.println(eltion.getGjinia());


        System.out.println( "  ");
        System.out.println ("Personi 3:");
        System.out.println(elvis.getEmri());
        System.out.println(elvis.getMbiemri());
        System.out.println(elvis.getGjinia());


        System.out.println( "  ");
        System.out.println ("Personi 4:");
        System.out.println(ester.getEmri());
        System.out.println(ester.getMbiemri());
        System.out.println(ester.getGjinia());


    }
}

