package Zwierzaki;

public class Legwan extends Zwierze implements Comparable<Legwan> {
    private String luski;
    private double waga;
    public Legwan(String newRasa,String newLuski, double newWaga)
    {
        super("Legwan",newRasa);
        waga=newWaga;
        luski=newLuski;
        System.out.print("Wywołanie konstruktora klasy legwan z łuskami w kolorze:"+luski+"\n oraz o wadze:"+waga+"kg\n\n");
    }

    public String getLuski() {
        return luski;
    }

    public void setLuski(String luski) {
        this.luski = luski;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

        public String toString()
    {
        return super.toString()+"Łuski: "+luski+"\nWaga:"+waga+"kg\n";
    }
    public int compareTo(Legwan inny)
    {
        return Double.compare(inny.waga,this.waga);
    }
}
