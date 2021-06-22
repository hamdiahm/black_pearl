package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
    static Connection con=null;
    static String jdbcURL = "jdbc:postgresql://bzj7cbq9gqk9xvs7hqq0-postgresql.services.clever-cloud.com:5432/bzj7cbq9gqk9xvs7hqq0";
    static String username = "uwmkereaewwy6nddqldy";
    static String password = "vCoV7VY2nP5Vt7TN9tvk";
    public static Connection getConnection()
    {
        if (con != null) return con;
        return getConnection(jdbcURL, username, password);
    }

    private static Connection getConnection(String jdbcURL,String username,String password)
    {
        try
        {
            con = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connexion etablir");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }
}