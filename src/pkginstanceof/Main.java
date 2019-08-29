/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

/**
 *
 * @author M6800
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Arek", "Włodarczyk", 100000);
        osoba[1] = new Student("Alusia", "Joniec");
        
//        for(int i = 0; i < osoba.length; i++){
//            
//            if(osoba[i] instanceof Osoba)
//            osoba[i].pobierzOpis();
//            else 
//                break;
//        }

        for(Osoba person: osoba){
            if(person instanceof Osoba)
            person.pobierzOpis();
            else 
                break;
        }
        
        
    }
    
}

abstract class Osoba{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwiko){
        this.imie = imie;
        this.nazwisko = nazwiko;
    }
    
    abstract void pobierzOpis();    
    
}

class Pracownik extends Osoba{
    double wynagrodzenie;
    
    Pracownik (String imie, String nazwisko, double wynagrodzenie){
        super(imie,nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    
    @Override
    void pobierzOpis(){
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie " + wynagrodzenie);
}
}

class Student extends Osoba{
    
    Student(String imie, String nazwisko){
        super(imie, nazwisko);
    }
    
    @Override
    void pobierzOpis(){
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        }
}