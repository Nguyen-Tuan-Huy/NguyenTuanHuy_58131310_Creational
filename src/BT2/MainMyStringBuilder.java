/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author zasx1
 */
public class MainMyStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder mystringb = new MyStringBuilder.Builder()
                .addFloat(5)
                .addString(" < ")
                .addFloat(3)
                .addString(" : ")
                .addBool(false)
                .build();
        System.out.println(mystringb.toString());
            
    }
    
}
