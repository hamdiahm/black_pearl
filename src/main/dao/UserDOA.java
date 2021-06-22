package main.dao;

import main.DataSource;
import main.entities.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDOA {
    // select one, select multiple, create one, update one, delete one
    Connection connection = DataSource.getConnection();

    public User get_user(int id)
    {
        String query = "SELECT * FROM public.\"User\" WHERE id = " + id + ";";
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
            {
                int user_id = result.getInt(10);
                String user_name = result.getString(1);
                String user_email = result.getString(2);
                String user_phone = result.getString(3);
                String user_reset_code = result.getString(4);
                String user_photo = result.getString(5);
                String user_cin = result.getString(6);
                Date user_created_at = result.getDate(7);
                String user_role = result.getString(8);
                String user_postal_code = result.getString(9);
                System.out.print("ID: " + user_id);
                System.out.print("| Name: " + user_name);
                System.out.print("| Email: " + user_email);
                System.out.print("| Phone: " + user_phone);
                System.out.print("| Reset Code: " + user_reset_code);
                System.out.print("| Photo URL: " + user_photo);
                System.out.print("| CIN: " + user_cin);
                System.out.print("| Created_at: " + user_created_at);
                System.out.print("| Role: " + user_role);
                System.out.print("| Postal_code: " + user_postal_code);
                return new User(user_id, user_name, user_email, user_phone, user_reset_code, user_photo, user_cin,
                            user_created_at, user_role, user_postal_code);
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Problem !!!");
        }
        return null;
    }

    public List<User> get_users()
    {
        String query = "SELECT * FROM public.\"User\" ;";
        List<User> list=new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next())
            {
                int user_id = result.getInt(10);
                String user_name = result.getString(1);
                String user_email = result.getString(2);
                String user_phone = result.getString(3);
                String user_reset_code = result.getString(4);
                String user_photo = result.getString(5);
                String user_cin = result.getString(6);
                Date user_created_at = result.getDate(7);
                String user_role = result.getString(8);
                String user_postal_code = result.getString(9);
                System.out.print("ID: " + user_id);
                System.out.print("| Name: " + user_name);
                System.out.print("| Email: " + user_email);
                System.out.print("| Phone: " + user_phone);
                System.out.print("| Reset Code: " + user_reset_code);
                System.out.print("| Photo URL: " + user_photo);
                System.out.print("| CIN: " + user_cin);
                System.out.print("| Created_at: " + user_created_at);
                System.out.print("| Role: " + user_role);
                System.out.print("| Postal_code: " + user_postal_code);
                list.add(new User(user_id, user_name, user_email, user_phone, user_reset_code, user_photo, user_cin,
                        user_created_at, user_role, user_postal_code));
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Problem !!!");
        }
        return null;
    }

    public void add_user(User user)
    {
        String query = "INSERT INTO public.\"User\" (";
        String values = "(";
        String sql_query = "";
        if (user.getId() > -1)
        {
            query +=  "\"id\", ";
            values += user.getId() + ",";
        }
        if (user.getName() != null)
        {
            query +=  "\"name\", ";
            values += "\'" + user.getName() + "\',";
        }
        if (user.getRole() != null)
        {
            query +=  "\"role\", ";
            values += "\'" + user.getRole() + "\',";
        }
        if (user.getCin() != null)
        {
            query +=  "\"cin\", ";
            values += "\'" + user.getCin() + "\',";
        }
        if (user.getPhone() != null)
        {
            query +=  "\"phone\", ";
            values += "\'" + user.getPhone() + "\',";
        }
        if (user.getReset_code() != null)
        {
            query +=  "\"reset_code\", ";
            values += "\'" + user.getReset_code() + "\',";
        }
        if (user.getEmail() != null)
        {
            query +=  "\"email\", ";
            values += "\'" + user.getEmail() + "\',";
        }
        if (user.getPhoto_profile() != null)
        {
            query +=  "\"photo_profile\", ";
            values += "\'" + user.getPhoto_profile() + "\',";
        }
        if (user.getPostal_code() != null)
        {
            query +=  "\"postal_code\", ";
            values += "\'" + user.getPostal_code() + "\',";
        }
        query = query.substring(0, query.length()-2) + ")";
        values = values.substring(0, values.length()-1) + ")";
        sql_query = query +" VALUES "+ values;
        System.out.println(sql_query);
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql_query);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Problem !!!");
        }
    }

    public void update_user(User user, int id)
    {
        String query = "UPDATE public.\"User\" SET ";
        if (user.getName() != null)
        {
            query +=  "\"name\"=\'"+ user.getName() +"\',";
        }
        if (user.getRole() != null)
        {
            query +=  "\"role\"= \'"+ user.getRole() +"\',";
        }
        if (user.getCin() != null)
        {
            query +=  "\"cin\"=\' "+ user.getCin() +"\',";
        }
        if (user.getPhone() != null)
        {
            query +=  "\"phone\"=\' "+ user.getPhone() +"\',";
        }
        if (user.getReset_code() != null)
        {
            query +=  "\"reset_code\"=\' "+ user.getReset_code() +"\',";
        }
        if (user.getEmail() != null)
        {
            query +=  "\"email\"=\'"+ user.getEmail() +"\',";
        }
        if (user.getPhoto_profile() != null)
        {
            query +=  "\"photo_profile\"=\' "+ user.getPhoto_profile() +"\',";
        }
        if (user.getPostal_code() != null)
        {
            query +=  "\"postal_code\"=\' "+ user.getPostal_code() +"\',";
        }
        query = query.substring(0, query.length()-1) + " WHERE id=" + user.getId();
        System.out.println(query);
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Problem !!!");
        }
    }

    public void delete_user(int id)
    {
        String query = "DELETE FROM public.\"User\" WHERE id=" + id;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Problem !!!");
        }
    }


}
