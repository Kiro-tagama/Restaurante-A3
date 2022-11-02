package com.example.restaurantea3.Conections;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ListRestaurantes {
    private String restaurantes[];

    public String[] getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(String[] restaurantes) {
        this.restaurantes = restaurantes;
    }

    public static void restaurante(){
        // permissão total
        StrictMode.ThreadPolicy gfgPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(gfgPolicy);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Keys.link(), Keys.user(), Keys.pass());
            String sql = "SELECT * FROM tb_restaurantes";

            // n saquei
            Connection conn = null;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ArrayList<String> arr = new ArrayList<>();

        }
        catch (Exception e){
            System.out.print(e);
        }
    }

}
