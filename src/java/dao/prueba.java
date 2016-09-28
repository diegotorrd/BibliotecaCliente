/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Libro;
import bean.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Torres
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       BibliotecaDAO dao = new BibliotecaDAO();
       Libro lib = dao.obtenerLibro("12345");
        List<Libro> libs = new ArrayList<>();
        
        libs = dao.obtenerCatalogo("usuario");
       
        System.out.println(libs.size());
    }
    
}
