package com.example.restaurantea3.Conections;


import android.os.StrictMode;

import java.sql.*;

public class Authentica {
    static boolean status;

    public static void authentica_usuario(String email, String senha) {
        StrictMode.ThreadPolicy gfgPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(gfgPolicy);

        try {
            // Conectando na tabela de usuários
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(Keys.link(), Keys.user(), Keys.pass());

            Statement stmt = con.createStatement();
            String Query = "select usuario_id, nome from tb_usuario where email = '" + email + "' and senha = '" + senha
                    + "'";
            ResultSet rs = stmt.executeQuery(Query);
            int size = 0;
            try {
                rs.next();
                size = rs.getRow();
            }

            catch (Exception ex) {
                size = 0;
            }

            if (size > 0) {
                System.out.println("Usuário authenticado. " + rs.getInt(1));
                setStatus(true);
            } else {
                System.out.println("Email e(ou) senha inválido. ");
                setStatus(false);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("err:"+e);

        }

    }

    public boolean getStatus(){
        return status;
    }
    public static boolean setStatus(boolean dado){
        return status = dado;
    }

    public static void main(String[] args) {
        
        String email = "carloseduardovpereira@gmail.com";
        String senha = "senha1234";

        authentica_usuario(email, senha);

    }

}