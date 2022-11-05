package com.example.restaurantea3.Conections;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ListRestaurantes {

    public static void restaurante(){
        // permissão total
        StrictMode.ThreadPolicy gfgPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(gfgPolicy);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Keys.link(), Keys.user(), Keys.pass());
            String sql = "SELECT restaurante_id,nomeRestaurante,descricao FROM tb_restaurantes";

            // n saquei
            Connection conn = null;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ArrayList<String> arr = new ArrayList<>();
            while (rs.next()){
                arr.add(rs.getInt("restaurante_id"), sql);
                arr.add(rs.getString("nomeRestaurante"));
                arr.add(rs.getString("descricao"));
            }

            System.out.print(arr);

        }
        catch (Exception e){
            System.out.print("err"+e);
        }
    }

    public static void main(String[] args){
        restaurante();
    }

}
