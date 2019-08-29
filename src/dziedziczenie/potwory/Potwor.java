/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;

/**
 *
 * @author M6800
 */
public abstract class Potwor {
    protected double predkoscChodzenia = 10;
    protected double zywotnosc;
    
    public void atakuj(){
        System.out.println("To jest metoda atakuj z klasy Potwór");
    }
    
    protected abstract void opis();  
    
    
    public Potwor(){
        System.out.println("Domyślny konstruktor z klasy Potwór");
    }
    
    public Potwor(double predkoscChodzenia, double zywotnosc){
        
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nie-domyślny konstruktor z klasy Potwór");
    }
}
