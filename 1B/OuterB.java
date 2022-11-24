/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBONadiaZafiraZahra;

/**
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author Acer
 */
public class OuterB {
    
     int number=0;
     
    void outerMethod(){
        class Inner{     
        public void print(){
            System.out.println("Mengakses inner class yang ke: "+(++number)); 
        }
    }
    
        Inner inner = new Inner();
        inner.print();
    }
}

class OuterAccess{
    public static void main(String[] args){
        Outer out = new Outer();
        out.displayFromMethod();
        out.displayFromMethod();
        out.displayFromMethod();
    } 
}