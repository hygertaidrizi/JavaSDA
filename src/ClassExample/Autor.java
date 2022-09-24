package ClassExample;
//Krijo nje klase me emrin Autor me attribute emri/mbiemeri/numer veprash
//Krijo nje klase me emrin Shkrimtare me attribute Array me autor dhe ndertoni metodat:
//1-printo emrin e autorit qe fillon me A;
//2- printo emrin e autorit qe mbaron me il;
//3- printo emrin e autorit qe ka me shume vepra;
//Krijo klasen main per ta implementuar;
public class Autor {
    private String emri;
    private String mbiemri;
    private int numriVeprave;

    public Autor (){}
    public Autor (String emri, String mbiemri, int numriVeprave){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.numriVeprave = numriVeprave;
    }
    public void setEmri (String emri){
        this.emri = emri;
    }
    public void setMbiemri (String mbiemri){
        this.mbiemri = mbiemri;
    }
    public void setNumriVeprave (int numriVeprave){
        this.numriVeprave = numriVeprave;
    }
    public String getEmri (){
        return emri;
    }
    public String getMbiemri(){
        return mbiemri;
    }
    public int getNumriVeprave(){
        return numriVeprave;
    }
}
