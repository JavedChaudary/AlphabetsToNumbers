/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Javed Asghar
 */
public class Mine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("JAIDI");
        System.out.print(getWordNumbers("jaidi"));
    }

    public static String getWordNumbers(String abc) {
        String output = "";
        for (int i = 0; i < abc.length(); ++i) {
            char aplhabet = abc.toLowerCase().charAt(i);
            if (!output.isEmpty()) {
                output += " ";
            }
            int num = (int) aplhabet - (int) 'a' + 1;
            output += String.valueOf(num);
        }
        return output;
    }
}
