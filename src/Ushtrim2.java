public class Ushtrim2 {
    public static void main (String [] args){
        float vlera_1= 5f;
        float vlera_2= 6f;

        float shuma= vlera_1 + vlera_2;
        float zbritja= vlera_1 - vlera_2;
        float shumezimi= vlera_1 * vlera_2;
        float pjestimi= vlera_1/ vlera_2;
        float perpjestimi= vlera_1 % vlera_2;

        System.out.println (shuma);
        System.out.println(zbritja);
        System.out.println(shumezimi);
        System.out.println(pjestimi);
        System.out.println(perpjestimi);
        shuma+=2;
        zbritja+=2;
        shumezimi+=2;
        pjestimi+=2;
        perpjestimi+=2;

        System.out.println (shuma+=2);
        System.out.println(zbritja+=2);
        System.out.println(shumezimi+=2);
        System.out.println(pjestimi+=2);
        System.out.println(perpjestimi+=2);



    }
}

