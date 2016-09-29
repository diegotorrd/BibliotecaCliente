/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Libro;
import com.google.gson.Gson;
import dao.BibliotecaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class BuscarLibroPorID extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_mod = request.getParameter("id_mod");
        BibliotecaDAO dao = new BibliotecaDAO();
        Libro lib = null;
        
        lib = dao.obtenerLibro(id_mod);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = df.parse(lib.getPublicacion());
        } catch (ParseException ex) {
            Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        df = new SimpleDateFormat("yyyy-MM-dd");
        lib.setPublicacion(df.format(d));
        
        if(lib!=null){
            
            String json = new Gson().toJson(lib);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }else{
            String json = new Gson().toJson(lib);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            String msg = "error";
            response.getWriter().write(msg);
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BibliotecaDAO dao = new BibliotecaDAO();
        List<Libro> catalogo = new ArrayList<>();
        
        String param = request.getParameter("param");
        
        catalogo = dao.obtenerCatalogo(param);
        
        if(catalogo!=null){
            request.setAttribute("catalogo",catalogo);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            String msg = "true";
            response.getWriter().write(msg);
        }else{
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            String msg = "false";
            response.getWriter().write(msg);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
