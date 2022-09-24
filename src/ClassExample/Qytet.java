package ClassExample;

public class Qytet {
    public static int popullsia = 132000;
    public static POPULLSIA initPOPULLSIA (){
        return new POPULLSIA();
    }
        private String shteti;
        private String emri;
        private int siperfaqja;


        public Qytet (String shteti){
            this.shteti = shteti;
        }
        public Qytet (String shteti, String emri) {
            this.shteti = shteti;
            this.emri = emri;
        }
        public Qytet (String shteti, String emri, int siperfaqja){
            this.shteti = shteti;
            this.emri = emri;
            this.siperfaqja = siperfaqja;
        }
        public void setShteti (String shteti){
            this.shteti = shteti;
        }
        public void setEmri(String emri){
            this.emri = emri;
        }
        public void setSiperfaqja(int siperfaqja){
            this.siperfaqja = siperfaqja;

        }
        public String getShteti (){
            return shteti;
        }
        public String getEmri(){
            return emri;
        }
        public int getSiperfaqja(){
            return siperfaqja;
        }

    private static class POPULLSIA {
    }
}

