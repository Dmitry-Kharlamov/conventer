/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conventer;

import java.io.FileNotFoundException;

/**
 *
 * @author Dmitriy
 */
public class Main {
     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Conventer conventer = new Conventer();
        conventer.input("input.txt");
        for (String example: conventer.examples) {
            System.out.println(conventer.parse(example));
        }
    }
}
