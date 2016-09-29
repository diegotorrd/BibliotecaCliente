/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Libro;
import bean.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.BibliotecaDAO;
import dao.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 *
 * @author Diego Torres
 */
public class LoginServlet extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usu");
        String contraseña = request.getParameter("psw");
        HttpSession session = request.getSession();
        
        
//       String url = "http://localhost:8080/webresources/generic/login";
//        URI uri = URI.create(url);
//        
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target(uri).queryParam("usuario", usuario).queryParam("password", contraseña);
//               
//        
//        
//        Invocation.Builder invocatBuilder = target.request(MediaType.APPLICATION_JSON);
//        Response resp = invocatBuilder.get();
//        String rpta = resp.readEntity(String.class);
//        
//        Gson gson = new Gson();
//        
//        usu = gson.fromJson(rpta, Usuario.class);
        
        Usuario  usu = null;
        LoginDAO dao = new LoginDAO();
        
        usu = dao.login(usuario, contraseña);
        
        if(usu!=null){
            session.setAttribute("usuario", usu);
            if(usu.getTipo().equalsIgnoreCase("operador")){
                response.sendRedirect("jsp/muro_operador.jsp");                
            }else{
                BibliotecaDAO dao2 = new BibliotecaDAO();
                List<Libro> catalogo = new ArrayList<>();

                String param = "usuario";

                catalogo = dao2.obtenerCatalogo(param);
                session.setAttribute("catalogo",catalogo);
                response.sendRedirect("jsp/muro_usuario.jsp"); 
            }
            
        }else{
            session.setAttribute("usuario", "error");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
