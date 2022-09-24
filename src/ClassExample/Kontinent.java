package ClassExample;

public class Kontinent {
    private String emri;
    private int siperfaqja;
    private int numriShteteve;
    private int mosha;
    static String planeti;

    public Kontinent(String emri, int siperfaqja, int numriShteteve, int mosha, String planeti) {
        this.emri = emri;
        this.siperfaqja = siperfaqja;
        this.numriShteteve = numriShteteve;
        this.mosha = mosha;
        this.planeti = planeti;
    }
    public void setEmri(String emri){
        this.emri = emri;
    }
    public void setSiperfaqja (int siperfaqja){
        this.siperfaqja = siperfaqja;
    }
    public void setNumriShteteve (int numriShteteve){
        this.numriShteteve = numriShteteve;
    }
    public void setMosha (int mosha){
        this.mosha = mosha;
    }
    public String getEmri (){
        return emri;
    }
    public int getSiperfaqja(){
        return siperfaqja;
    }
    public int getNumriShteteve(){
        return numriShteteve;
    }
    public int getMosha(){
        return mosha;
    }
    public String planeti() {
        return planeti;
    }
}
