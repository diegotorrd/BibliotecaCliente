package util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

public class ConexionMLab {

    private static final String USERNAME = "grupo07";
    private static final String PASSWORD = "Grupo07";
    private static final String HOST = "ds039125.mlab.com";
    private static final String PORT = "39125";
    private static final String DATABASE = "biblioteca";
    private MongoClient cliente;
    private MongoClientURI uri;

    public ConexionMLab() {
        uri = new MongoClientURI("mongodb://" + USERNAME + ":" + PASSWORD +"@"+ HOST + ":"+ PORT+"/" + DATABASE);
        try {
            cliente = new MongoClient(uri);
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }

    public MongoClient getConexion() {
        return cliente;
    }
}
