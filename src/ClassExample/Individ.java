package ClassExample;

import java.time.LocalDate;
import java.util.ArrayList;

public class Individ {
    private String emri;
    private String mbiemri;
    private int mosha;
    private int gjatesia;
    private String gjinia;
    private String fakulteti;
    private String puna;
    private int rroga;
    private String gjendjaCivile;
    private boolean makine;
    private LocalDate ditelindja;
    private boolean vellezer;
    private boolean motra;

    public Individ (){}
    public Individ (String emri, String mbiemri, int mosha, int gjatesia,
                    String gjinia, String gjendjaCivile, String puna,
                    int rroga, int ditelindja, boolean makine, boolean vellezer, boolean motra){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.fakulteti= fakulteti;
        this.gjinia = gjinia;
        this.puna = puna;
        this.mosha = mosha;
        this.gjatesia = gjatesia;
        this.gjendjaCivile = gjendjaCivile;
        this.rroga = rroga;
        this.makine = makine;
        this.vellezer = vellezer;
        this.motra = motra;
        this.ditelindja = LocalDate.ofEpochDay(ditelindja);

    }
    public void setEmri (String emri){
        this.emri=emri;
    }

    public String getEmri() {
        return emri;
    }
    public void setMbiemri (String mbiemri){
        this.mbiemri = mbiemri;
    }
    public String getMbiemri(){
        return  mbiemri;
    }
    public void setMosha (int mosha){
        this.mosha = mosha;
    }
    public int getMosha (){
        return mosha;
    }
    public void setGjatesia (int gjatesia){
        this.gjatesia = gjatesia;
    }
    public int getGjatesia (){
        return gjatesia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }
    public String getGjinia (){
        return gjinia;
    }
    public void setFakulteti (String fakulteti){
        this.fakulteti = fakulteti;
    }
    public String getFakulteti (){
        return fakulteti;
    }
    public void setPuna (String puna){
        this.puna = puna;
    }
    public String getPuna(){
        return puna;
    }
    public void setRroga(int rroga){
        this.rroga = rroga;
    }
    public int getRroga (){
        return rroga;
    }
    public void setGjendjaCivile (String gjendjaCivile){
        this.gjendjaCivile = gjendjaCivile;
    }
    public String getGjendjaCivile(){
        return gjendjaCivile;
    }
    public void setMakine (boolean makine){
        this.makine = makine;
    }

    public boolean isMakine() {
        return makine;
    }
    public void setDitelindja(int ditelindja){
        this.ditelindja = LocalDate.ofEpochDay(ditelindja);
    }
    public LocalDate getDitelindja() {
        return ditelindja;
    }
    public void setVellezer (boolean vellezer){
        this.vellezer = vellezer;
    }

    public boolean isVellezer() {
        return vellezer;
    }
    public void setMotra (boolean motra){
        this.motra = motra;
    }

    public boolean isMotra() {
        return motra;
    }

    public static void getSaFemraKa(ArrayList<Individ> individList, int count){
        int femra = 0;
        int meshkuj = 0;
        for (int i=0; i<individList.size();i++){
            if (individList.get(i).getGjinia()=="femer"){
                femra = i;
            }
            else if (individList.get(i).getGjinia()=="mashkull"){
                meshkuj =i;
            }
        }
    }

    }





