/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejo
 */
public class testImpresor {
    @Before
    public void Before(){
        System.out.println("Before()");
        ImpresorLCD Funciones = new ImpresorLCD();
    }
     @Test
     
     public void validacionDigito1(){
        ImpresorLCD.validacionDigito('c');
     
     }
    
     @Test
     public void validacionDigito(){
        ImpresorLCD.validacionDigito('6');
     
     }
     
     @Test
     public void CadenaNumerica1(){
        
         boolean actual=ImpresorLCD.isNumeric("1ca");
         boolean esperado=false;
         assertEquals(actual,esperado);
         
            
        
     }
     @Test
     public void CadenaNumerica(){
       boolean prueba= ImpresorLCD.isNumeric("1251");
       boolean esperado=true;
       assertEquals( prueba,esperado);
     
     }
    
    public testImpresor() {
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
