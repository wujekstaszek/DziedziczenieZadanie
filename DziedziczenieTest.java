package DziedziczenieTest;
import Zwierzaki.*;
import java.util.*;  

public class DziedziczenieTest {
    public static void main(String args[])
    {
    System.out.print("Test pierwsze zadanie\n");
    System.out.print("---------------------\n\n");
    Zwierze piesek=new Zwierze("Pies","Dog niemiecki");
    System.out.print("\n\n");
    Kot kotek=new Kot("Pers","Beżowa","Agresywny");
    System.out.print("\n\n");
    Legwan legwanik=new Legwan("Legwan pustynny","Żółte",0.5);
    System.out.print("\n\n");
    System.out.print(piesek);
    System.out.print("\n\n");
    System.out.print(kotek);
    System.out.print("\n\n");
    System.out.print(legwanik);
    System.out.print("\n\n");
    
    
    System.out.print("Test drugie zadanie\n");
    System.out.print("---------------------\n\n");
    
    
    testWagiLegwanikow();
    
    System.out.print("Test trzecie zadanie\n");
    System.out.print("---------------------\n\n");
    
     testPoli();
    //Wywoływane są funkcje poszczególnych klas, których obiekty zostały utworzone, a nie zadeklarowane. Dla kotka wywołało się Kot.toString, mimo, że zadeklarowaliśmy obiekt typu Zwierze.
    }
    
    private static void testWagiLegwanikow()
    {
    Legwan Legwanik1=new Legwan("Legwan dżunglowy","Czerwone",5);
    Legwan Legwanik2=new Legwan("Legwan Pustynny","Żółte",0.5);
    Legwan Legwanik3=new Legwan("Legwan Euroazjatycki","Niebieskie",15);
    List<Legwan> listaLegwanow=new ArrayList<Legwan>();
    listaLegwanow.add(Legwanik1);
    listaLegwanow.add(Legwanik2);    
    listaLegwanow.add(Legwanik3);
    
    listaLegwanow.sort(Comparator.reverseOrder());
    System.out.print("\nLegwany poukładane rosnąco:\n");
    System.out.print(listaLegwanow);
    listaLegwanow.sort(Comparator.naturalOrder());
    System.out.print("\nLegwany poukładane malejąco:\n");
    System.out.print(listaLegwanow);
    System.out.print("\n\n");
    
    }
    private static void testPoli()
    {
    Zwierze poliPiesek=new Zwierze("Pies","Dog niemiecki");
    Zwierze poliKotek=new Kot("Pers","Beżowa","Agresywny");
    Zwierze poliLegwanik=new Legwan("Legwan pustynny","Żółte",0.7);
    
    System.out.print("\n\n");
    System.out.print(poliPiesek.toString());
    System.out.print("\n\n");
    System.out.print(poliKotek.toString());
    System.out.print("\n\n");
    System.out.print(poliLegwanik.toString());
    System.out.print("\n\n");
    }
}
