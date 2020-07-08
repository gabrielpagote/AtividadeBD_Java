package PacoteBancoDados;

import java.sql.*;
import java.util.*;

public class Conexao {

    public static Connection abrirConexao() {

        Connection con = null;

        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            //"jdbc:mysql://127.0.0.1/livraria?user=root&password=";

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/livraria?user=root&password=&serverTimezone=UTC";

            con = DriverManager.getConnection(url);

            System.out.println("Conexão iniciada...");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão encerrada...");

        } catch (SQLException ex) {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}