/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conventer;

import java.math.BigDecimal;

/**
 *
 * @author Dmitriy
 */
class Edge {
    public int num;
    public BigDecimal weight;
    
    Edge(int num, double weight) {
        this.num = num;
        this.weight = new BigDecimal(weight);
    }

}
