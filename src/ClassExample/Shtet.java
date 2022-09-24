package ClassExample;

public class Shtet {
    //Atributet e Shkolles
    private String emri;
    private int siperfaqja;
    private String kryeqyteti;

    public  Shtet (String emri, int siperfaqja, String kryeqyteti) {
        this.emri = emri;
        this.siperfaqja = siperfaqja;
        this.kryeqyteti = kryeqyteti;
    }

    public void setEmri (String emri){
        this.emri = emri;
    }

    public void setSiperfaqja (int siperfaqja){
        this.siperfaqja = siperfaqja;
    }
    public void setKryeqyteti (String kryeqyteti){
        this.kryeqyteti = kryeqyteti;
    }

    public String getEmri(){
        return emri;
    }
    public int getSiperfaqja (){
        return siperfaqja;
    }
    public String getKryeqyteti(){
        return kryeqyteti;
    }

}
