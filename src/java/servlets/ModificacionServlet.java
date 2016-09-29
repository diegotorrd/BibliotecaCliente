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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego Torres
 */
public class ModificacionServlet extends HttpServlet {

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
                Gson gson = new Gson();
                String id = request.getParameter("id");
                String titulo = request.getParameter("titulo");
                String autor = request.getParameter("autor");
                String genero = request.getParameter("genero");
                String pais = request.getParameter("pais");
                String publicacion = request.getParameter("publicacion");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date d = null;
                try {
                    d = df.parse(publicacion);
                } catch (ParseException ex) {
                    Logger.getLogger(RegistroServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                df = new SimpleDateFormat("dd/MM/yyyy");
                publicacion = df.format(d);
                int paginas = Integer.parseInt(request.getParameter("paginas"));
                String imagen = request.getParameter("imagen");
                String estado = request.getParameter("estado");

                Libro lib = new Libro();
                lib.setId(id);
                lib.setTitulo(titulo);
                lib.setAutor(autor);
                lib.setGenero(genero);
                lib.setPais(pais);
                lib.setPublicacion(publicacion);
                lib.setPaginas(paginas);
                lib.setImagen(imagen);
                lib.setEstado(estado);

                BibliotecaDAO dao = new BibliotecaDAO();
                int rows = dao.modificarLibro(lib);

                if(rows!= 0){
                    String json = new Gson().toJson("true");
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().write(json);
                }else{
                    String json = new Gson().toJson("false");
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().write(json);
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
