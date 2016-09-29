/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Libro;
import bean.Usuario;
import com.google.gson.Gson;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;
import util.ConexionMLab;

/**
 *
 * @author Diego Torres
 */
public class BibliotecaDAO {
    
    private String getId(DBCollection libro){
        String res = "";
        int id = 0;
        DBCursor cursor= libro.find().sort( new BasicDBObject( "id" , -1 ) ).limit(1);
        if (cursor.hasNext()){
            BasicDBObject dbo = (BasicDBObject) cursor.next();
            id = Integer.parseInt(dbo.getString("id"));
        }
        res = Integer.toString(id+1);
        return res;
    }
    
    public String ingresarLibro(Libro libro){
        Gson gson = new Gson();
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        String id = null;
        try{
            DB db = mongo.getDB("biblioteca");
            DBCollection coleccion = db.getCollection("libro");
            id = this.getId(coleccion);
            
            BasicDBObject dbo = new BasicDBObject();
            dbo.put("id", id);
            dbo.put("titulo", libro.getTitulo());
            dbo.put("autor", libro.getAutor());
            dbo.put("genero", libro.getGenero());
            dbo.put("pais", libro.getPais());
            dbo.put("publicacion", libro.getPublicacion());
            dbo.put("paginas", libro.getPaginas());
            dbo.put("imagen", libro.getImagen());
            dbo.put("estado", "A");
            
            coleccion.insert(dbo);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            mongo.close();
        }
        if (id!=null){
            return id;            
        }else{
            return null;
        }        
    }
    
        public int modificarLibro(Libro libro){
        Gson gson = new Gson();
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        int rows = 0;
        try{
            DB db = mongo.getDB("biblioteca");
            DBCollection coleccion = db.getCollection("libro");
            
            BasicDBObject query = new BasicDBObject();
            BasicDBObject query1 = new BasicDBObject();
            query1.put("$eq", libro.getId());
            query.put("id", query1);
            
            DBObject dbo = new BasicDBObject();
            dbo.put("titulo", libro.getTitulo());
            dbo.put("autor", libro.getAutor());
            dbo.put("genero", libro.getGenero());
            dbo.put("pais", libro.getPais());
            dbo.put("publicacion", libro.getPublicacion());
            dbo.put("paginas", libro.getPaginas());
            dbo.put("imagen", libro.getImagen());
            dbo.put("estado", libro.getEstado());
            
            DBObject dbo2 = new BasicDBObject();
            dbo2.put("$set",dbo);
            
            rows = coleccion.update(query,dbo2).getN();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            mongo.close();
        }
        if (rows!=0){
            return rows;            
        }else{
            return 0;
        }        
    }
    
    public Libro obtenerLibro(String id){
        Libro lib=null;
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        try {
            DB db = mongo.getDB("biblioteca");
            DBCollection coleccion = db.getCollection("libro");
            BasicDBObject query = new BasicDBObject();
            query.put("id", id);
            
            DBCursor cursor = coleccion.find(query);
            if (cursor.hasNext()) {
                BasicDBObject dbo = (BasicDBObject)cursor.next();
                lib = new Libro();
                lib.setId(dbo.getString("id"));
                lib.setTitulo(dbo.getString("titulo"));
                lib.setAutor(dbo.getString("autor"));
                lib.setGenero(dbo.getString("genero"));
                lib.setPais(dbo.getString("pais"));
                lib.setPublicacion(dbo.getString("publicacion"));
                lib.setPaginas(dbo.getInt("paginas"));
                lib.setImagen(dbo.getString("imagen"));
                lib.setEstado(dbo.getString("estado"));
            }else{
                lib=null;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mongo.close();
        }
        return lib;
    }
    
    public List<Libro> obtenerCatalogo(String param){
        List<Libro> catalogo = new ArrayList<>();
        Libro lib = null;
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        try {
            DB db = mongo.getDB("biblioteca");
            DBCollection coleccion = db.getCollection("libro");
            BasicDBObject query = new BasicDBObject();
            if (param.equalsIgnoreCase("usuario")){
                query.put("estado", "A");                
            }           
            
            DBCursor cursor = coleccion.find(query);
            while (cursor.hasNext()) {
                BasicDBObject dbo = (BasicDBObject)cursor.next();
                lib = new Libro();
                lib.setId(dbo.getString("id"));
                lib.setTitulo(dbo.getString("titulo"));
                lib.setAutor(dbo.getString("autor"));
                lib.setGenero(dbo.getString("genero"));
                lib.setPais(dbo.getString("pais"));
                lib.setPublicacion(dbo.getString("publicacion"));
                lib.setPaginas(dbo.getInt("paginas"));
                lib.setImagen(dbo.getString("imagen"));
                lib.setEstado(dbo.getString("estado"));
                catalogo.add(lib);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mongo.close();
        } 
        if(catalogo.size()==0){
            return null;
        }else{
            return catalogo;
        }        
    }
    
}
