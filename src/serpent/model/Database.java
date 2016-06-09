package serpent.model;

import java.sql.*;

/**
 * Created by io on 9.06.16.
 */
public class Database {

    private Connection connection = null;
    private Statement statement = null;
    private String sql = null;
    private ResultSet resultSet = null;


    public Database(){
        connect();
        disconnect();
    }

    private void connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
        }
        catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }

    private void disconnect(){
        try{
            connection.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }



}
