package ClassExample;

public class MethodExample {
    public static void main(String[] args) {
        int numri1= 3;
        int numri2= 6;
        System.out.println(shuma (numri1,numri2));
        System.out.println(zbritja (numri1,numri2));

    }

    static int shuma(int numri1, int numri2){
        return numri1+numri2;
    }

    static int zbritja(int numri1, int numri2) {
        return numri1/numri2;
    }

}

