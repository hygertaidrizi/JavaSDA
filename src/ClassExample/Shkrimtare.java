package ClassExample;

public class Shkrimtare {
    private Autor autors[];
    private String emri;

    public Shkrimtare() {
    }
    public Shkrimtare(Autor[] autors) {
        this.autors = autors;
    }

    public String gjejAutorin() {
        int max = autors[0].getNumriVeprave();
        for (int i = 0; i < autors.length; i++) {
            if (autors[i].getNumriVeprave() > max) {
                max = autors[i].getNumriVeprave();
                emri = autors[i].getEmri();
            }
        }
        return emri;
    }
    public String gjejAutorin1() {
        if (emri.startsWith("A")) {
            emri= autors[0].getEmri();

        }

        return emri;
    }
    public String gjejAutorin2(){
        if (emri.endsWith("il")){
            emri = autors[0].getEmri();

        }
        return emri;
    }
}