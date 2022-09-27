package com.example.restaurantea3.Conections;

import android.text.Editable;

import java.sql.*;

public class Cadastra {

    public static void cria_usuario(String nome, String email, String senha, int ddd, int telefone, String endereco,
                                    String bairro, String cidade, String estado, String validade_cartao, String codigo_cartao)
            throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurante_a3", "root", "grupodaa32022");

            Statement stmt = con.createStatement();
            String query1 = "INSERT INTO tb_usuario (`nome`,`email`, `senha`, `ddd`, `telefone`, `endereco`, `bairro`, `cidade`, `estado`, `num_cartao`, `validade_cartao`, `codigo_cartao`) ";
            query1 = query1 + "VALUES ";
            query1 = query1 + "('" + nome + "','" + email + "','" + senha + "','" + senha + "','" + ddd + "','"
                    + telefone + "','" + endereco + "','" + bairro + "','" + cidade + "','" + estado + "','"
                    + validade_cartao + "','" + codigo_cartao + "')";
            stmt.executeUpdate(query1);
            System.out.println("Record is inserted in the table successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurante_a3", "root", "grupodaa32022");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tb_usuario");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
                        rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
