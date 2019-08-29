/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramowanieObiektowe;

/**
 *
 * @author M6800
 */
public class slowoThis {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(11,22);
        Punkt p2 = new Punkt(33,44);
        
        Samochod[] cars = new Samochod[3];
        cars[0] = new Samochod("Ford");
        cars[1] = new Samochod("Audi");
        cars[2] = new Samochod("Fiat");
        
        System.out.println(cars[0].getNazwaSamochodu());
        System.out.println(cars[1].getNazwaSamochodu());
        System.out.println(cars[2].getNazwaSamochodu());
        
    }
    
}

class Punkt{
    int x;
    int y;
    
    Punkt(){
        // konstruktor domyślny
        System.out.println("Wywołano konstruktor domyślny");
    }
    
    Punkt (int x, int y){
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        this.x=x;
        this.y=y;
        System.out.println("X: " + x + ", Y: " + y);
    }    
}

class Samochod{
    String nazwa;
    
    Samochod(){
    // kontruktor domyślny   
    }
    
    Samochod(String nazwa){
        this.nazwa = nazwa;
        System.out.println("Ustawiono samochód: " + nazwa);
    }
    
    String getNazwaSamochodu(){
        return nazwa;
        // return this.nazwa;
    }
    
}
