package com.example.restaurantea3.Conections;

import java.sql.*;

public class Altera_senha {

    static void altera_senha(String senha, String nova_senha, String email)
            throws SQLException, ClassNotFoundException {

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
            // Connection con = DriverManager.getConnection(
            // "jdbc:mysql://localhost:3306/restaurante_a3", "root", "grupodaa32022");

            Statement stmt_update = con.createStatement();
            String Query_update = "update restaurante_a3.tb_usuario set senha = '" + nova_senha
                    + "' where usuario_id = " + rs.getInt(1);
            stmt_update.executeUpdate(Query_update);
            System.out.println("Senha alterada com sucesso. " + rs.getInt(1));

        } else {
            System.out.println("Email e(ou) senha inválido. ");

        }

        con.close();

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //altera_senha("nova_senha123", "senha123", "carloseduardovpereira@gmail.com");

    }
}
