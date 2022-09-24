package ClassExample;

public class Telefon {
    public static int charger = 30;
    public static TEL initTEL(){
        return new TEL();
    }
        private int kamera;
        private String marka;
        private int procesori;


        public Telefon (int kamera){
            this.kamera = kamera;
        }
        public Telefon (int kamera, String marka) {
            this.kamera = kamera;
            this.marka = marka;
        }
        public Telefon (int kamera, String marka, int procesori){
            this.kamera = kamera;
            this.marka = marka;
            this.procesori = procesori;
        }
        public void setKamera (int kamera){
            this.kamera = kamera;
        }
        public void setMarka (String marka){
            this.marka = marka;
        }
        public void setProcesori (int procesori){
            this.procesori = procesori;

        }
        public int getKamera (){
            return kamera;
        }
        public String getMarka(){
            return marka;
        }
        public int getProcesori(){
            return procesori;
        }

    private static class TEL {
    }
}
