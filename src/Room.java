public class Room {

    int rumNummer;
    String Klimat;
    String Yta;

    public Room (){
        Klimat="Rummet är inte valt än!";
        Yta = "Rummet är inte valt än!";
    }

    public Room (int rumNummer, String Klimat, String Yta){
        this.rumNummer = rumNummer;
        this.Klimat = Klimat;
        this.Yta = Yta;
    }

    public void setRumNummer(int rumNummer) {
        this.rumNummer = rumNummer;
    }

    public String getKlimat() {
        return Klimat;
    }

    public void setKlimat(String klimat) {
        Klimat = klimat;
    }

    public String getYta() {
        return Yta;
    }

    public void setYta(String yta) {
        Yta = yta;
    }

    public int getrumNummer() { return rumNummer;
    }
}