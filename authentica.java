import java.sql.*;

public class authentica {

    static void authentica_usuario(String email, String senha) {

        try {
            // Conectando na tabela de usuários
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurante_a3", "root", "grupodaa32022");

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

            } else {
                System.out.println("Email e(ou) senha inválido. ");

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        String email = "carloseduardovpereira@gmail.com";
        String senha = "senha1234";

        authentica_usuario(email, senha);
    }
}