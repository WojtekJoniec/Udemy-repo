package butelka;

class Butelka {
    private double ileLitrow;
    private final double pojemnosc = 10.0;
    
    Butelka()
    {   // konstruktor domyślny
        
    }
    Butelka (double ileLitrow)
    {   // konstruktor zalecany
        if (ileLitrow <= this.pojemnosc) 
        {
            this.ileLitrow = ileLitrow;
        }
        else 
        {
            this.ileLitrow = 0.0;
            System.out.println("Za mała butelka do inicjalizacji");
        }        
    }
    
    double getIleLitrow()
    {
        return ileLitrow ;
    }
    
    void wlej(double ilosc)
    {
        if (this.pojemnosc > (this.ileLitrow + ilosc)) {
            this.ileLitrow +=ilosc;
            System.out.println("Dolano wody");
        }
        else 
            System.out.println("Brak miejsca na wlanie");

        //System.out.println("Butelka ma teraz: " + getIleLitrow());
    }
    
    boolean wylej(double ilosc)
    {  
        if (ilosc < ileLitrow){
            this.ileLitrow -=ilosc;
        }
        else return false;
        
        return true;
        
        //System.out.println("Butelka ma teraz: " + getIleLitrow());
    }
    
    void przelej(double ilosc, Butelka gdziePrzelac)
    {
        if(this.wylej(ilosc)){
            gdziePrzelac.wlej(ilosc);
        }
        else
            System.out.println("Za mało wody");
        
        System.out.println("Butelka ma teraz: " + getIleLitrow());
    }


    public static void main(String[] args){
        
        Butelka[] butelka = new Butelka[10];
        
        for (int i=0; i<10; i++){
            butelka[i] = new Butelka(i+2);
            System.out.println("Butelka nr "+ i +" ma w sobie : " + butelka[i].getIleLitrow() + " litrów");
            if (i==9)
                    System.out.println("Przygotowano 10 butelek  ," + butelka[9]);
        }
        
       
        for (int i=0; i<10; i++){
            butelka[i].przelej(i-1, butelka[i]);
        }
         
        
        
        

}
}