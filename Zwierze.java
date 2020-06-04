package Zwierzaki;

public class Zwierze {
    private String gatunek;
    private String rasa;
    public Zwierze(String newGatunek,String newRasa)
    {
        gatunek=newGatunek;
        rasa=newRasa;
        System.out.print("Wywołanie konstruktora obiektu zwierze gatunku: "+gatunek+"\n oraz Rasy: "+rasa+"\n\n");
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public String toString()
    {
        return "\nGatunek: "+gatunek+"\nRasa:"+rasa+"\n";
    }
    
}
