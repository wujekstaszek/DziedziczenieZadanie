package Zwierzaki;

public class Kot extends Zwierze {
    private String siersc;
    private String usposobienie;

    public String getSiersc() {
        return siersc;
    }

    public void setSiersc(String siersc) {
        this.siersc = siersc;
    }

    public String getUsposobienie() {
        return usposobienie;
    }

    public void setUsposobienie(String usposobienie) {
        this.usposobienie = usposobienie;
    }

    public Kot(String newRasa,String newSiersc, String newUsposobienie) {
        super("Kot", newRasa);
        siersc = newSiersc;
        usposobienie = newUsposobienie;
        System.out.print("Konstruktor obiektu Kot o siersci: "+siersc+"\noraz usposobieniu: "+usposobienie+"\n\n");
    }
    public String toString()
    {
        return super.toString()+"Sierść: "+siersc+"\n"+"Usposobienie: "+usposobienie+"\n";
    }
    
    
}
