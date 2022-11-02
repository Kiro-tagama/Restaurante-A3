package com.example.restaurantea3.Conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ArrayPratos {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "SELECT * FROM tb_cardapios";
            Connection con = DriverManager.getConnection(Keys.link(), Keys.user(), Keys.pass());
            Connection conn = null;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ArrayList<String> arr = new ArrayList<String>();
            while (rs.next()) {
                //O add não está funcionando com um getInt.
                arr.add(rs.getInt(1), sql);
                arr.add(rs.getString("prato"));
                arr.add(rs.getString("desc_ingredientes"));
                System.out.println(arr.get(arr.size() - 1));
            }

        } catch (Exception err) {
            System.out.println(err);
        }
    }

}