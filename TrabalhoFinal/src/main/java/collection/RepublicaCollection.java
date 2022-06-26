/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

/**
 *
 * @author Heitor
 */
public class RepublicaCollection {

    private static RepublicaCollection INSTANCE = null;
         
    public static RepublicaCollection instance() {
        if (INSTANCE == null) {
            INSTANCE = new RepublicaCollection();
        }
        return INSTANCE;
    }
    
}
