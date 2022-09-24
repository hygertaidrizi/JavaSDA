package ClassExample;
//Ndertoni nje klase Appartament qe ka si
//members numrin e shtepive te shitura, numrin kateve, ngjyren e pallatit,emrin
//pastaj ndertoni nje class Bllok qe ka member nje array me Apartament, dhe emrin e bllokut,
//me pas ndertoni nje metode qe gjen se cili apartamenti qe ka numrin me te madh te shtepive te shitura
//Me pas tek nje klas tjeter ndertoni metoden main qe inicilizon blokun
public class Apartament {

    private int numriShtepiveTeShitura;
    private int numriKateve;
    private String ngjyra;
    private String emri;

    public Apartament (){}
    public Apartament (int numriShtepiveTeShitura, int numriKateve, String ngjyra, String emri){
        this.numriShtepiveTeShitura = numriShtepiveTeShitura;
        this.numriKateve = numriKateve;
        this.ngjyra = ngjyra;
        this.emri = emri;
    }
    public void setNumriShtepiveTeShitura (int numriShtepiveTeShitura){
        this.numriShtepiveTeShitura=numriShtepiveTeShitura;
    }
    public void setNumriKateve (int numriKateve){
        this.numriKateve = numriKateve;
    }
    public void setEmri (String emri){
        this.emri = emri;
    }
    public void setNgjyraPallatit (String ngjyraPallatit){
        this.ngjyra = ngjyraPallatit;
    }

    public int getNumriShtepiveTeShitura() {
        return numriShtepiveTeShitura;
    }
    public int getNumriKateve () {
        return numriKateve;
    }
    public String getNgjyraPallatit() {
        return ngjyra;
    }
    public String getEmri() {
        return emri;
    }
}
