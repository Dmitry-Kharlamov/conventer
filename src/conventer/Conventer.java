/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conventer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dmitriy
 */
public class Conventer {

    /**
     * @param args the command line arguments
     */
    
    public List<String> examples;
    private final Graph graph;
    
    Conventer() {
        graph = new Graph();
        examples = new ArrayList();
    }

    public void input(String filename) throws FileNotFoundException {
        File file;
        file = new File(filename);
        Scanner scan = new Scanner(file);
        
        while (scan.hasNextLine()) {
            examples.add(scan.nextLine());
        }
    
    }
    
    public String parse(String example) {
        double weight;
        String[] elements = example.split(" ");
        if (elements[0].equals("?")) {
            weight = graph.bws(elements[3], elements[1]);
            if (weight == 0) {
                return "";
            }
            double value = weight * Double.parseDouble(elements[2]);
            elements[0] = String.valueOf(value);
        }
        else if (elements[2].equals("?")) {
            weight = graph.bws(elements[1], elements[3]);
            if (weight == 0) {
                return "";
            }
            double value = weight * Double.parseDouble(elements[0]);
            elements[2] = String.valueOf(value);
        }
        else {
            weight = Double.parseDouble(elements[2]) / 
                     Double.parseDouble(elements[0]);
            graph.addEdge(elements[1], elements[3], weight);
        }
        StringBuilder str = new StringBuilder();
        for (String elem: elements) {
            str.append(elem);
            str.append(" ");
        }
        return str.toString();
    }
    
   
    
}
