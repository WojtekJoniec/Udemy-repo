/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie;
import dziedziczenie.potwory.Potwor;

/**
 *
 * @author M6800
 */
public class Pajak extends Potwor{
    
    void funkcja(){
        this.predkoscChodzenia = 0;
        this.zywotnosc = 1.0;
    }

    @Override
    protected void opis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
