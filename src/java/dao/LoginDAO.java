package dao;

import bean.Usuario;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import util.ConexionMLab;

public class LoginDAO {

    public Usuario login(String usuario, String password) {
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        Usuario usu = null;
        try {
            DB db = mongo.getDB("biblioteca");
            DBCollection coleccion = db.getCollection("usuario");
            BasicDBObject query = new BasicDBObject();
            
            BasicDBObject subquery = new BasicDBObject();
            BasicDBObject where1 = new BasicDBObject();
            BasicDBObject where2 = new BasicDBObject();
//            where1.put("usu", usuario);
//            where2.put("pass", password);
//            subquery.put("usu", where1);
//            subquery.put("pass", where2);
            subquery.put("usuario", usuario);
            subquery.put("password", password);
//            query.put("Usuario", subquery);
            
            DBCursor cursor = coleccion.find(subquery);
            if (cursor.hasNext()) {
                DBObject dbo = cursor.next();
                usu = new Usuario();
                usu.setUsuario(usuario);
                usu.setNombre(dbo.get("nombres").toString());
                usu.setApellido(dbo.get("apellidos").toString());                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mongo.close();
        }
        return usu;

    }
    
    
    
    
}