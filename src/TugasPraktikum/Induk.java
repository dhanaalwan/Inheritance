/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Dna
 */
public class Induk {
    public void test(){
        System.out.println("Method di dalam kelas Induk");
    }
}

class Turunan extends Induk{
public void test(String s){
System.out.println("Method di dalam kelas Turunan");
System.out.println("s :\"" + s + "\"");
}
}
