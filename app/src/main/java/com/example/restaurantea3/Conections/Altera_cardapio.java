package com.example.restaurantea3.Conections;

import java.sql.*;

public class Altera_cardapio {

    static void altera_cardapio(int cardapio_id, String prato, String desc_ingredientes)
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(Keys.link(), Keys.user(), Keys.pass());

        Statement stmt_update = con.createStatement();
        String Query_update = "update restaurante_a3.tb_cardapio set prato = '" + prato
                + "' , desc_ingredientes = '" + desc_ingredientes + "' where cardapio_id = " + cardapio_id;

        System.out.println(Query_update);
        stmt_update.executeUpdate(Query_update);
        System.out.println("Cardápio alterado com sucesso! ");

        con.close();

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //altera_cardapio(2, "Macarrão", "Molho de tomate, Massa");

    }
}