package serpent.model;

import java.sql.*;

/**
 * Created by io on 9.06.16.
 */
public class Database {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet results = null;

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

    private void create(String sql){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }

    private void insert(String sql){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }

    private void select(String sql){
        try{
            statement = connection.createStatement();
            results = statement.executeQuery(sql);
            //TODO: figure out a way to return the results
            results.close();
            statement.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }

    private void update(String sql){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }

    private void delete(String sql){
        try{
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            //TODO: log error
        }
        //TODO: log success
    }
}
