package PacoteBancoDados;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LivroDAO {

    //Definindo atributo/variável global;
    private Connection con;

    //Criar construtor;
    public LivroDAO(Connection con) {
        this.con = con;
    }

    //Definindo Getters e Setters;
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //lb == livroBean
    public String inserir(LivroBean livro) {
        String sql = "insert into livro(titulo,autor,editora,codigo,"
                + "numExemplares,isbn,ano,genero,numPaginas,status)values(?,?,?,"
                + "?,?,?,?,?,?,?)";

        try {
            //Preparando variáveis para receber os dados
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getEditora());
            ps.setString(4, livro.getCodigo());
            ps.setString(5, livro.getNumExemplares());
            ps.setString(6, livro.getIsbn());
            ps.setString(7, livro.getAno());
            ps.setString(8, livro.getGenero());
            ps.setString(9, livro.getNumPaginas());
            ps.setString(10, livro.getStatus());

            if (ps.executeUpdate() > 0) {
                return "Livro inserido com sucesso!";
            } else {
                return "Erro ao inserir livro...";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String alterar(LivroBean lb) {

        String sql = "update livro set titulo = ?, autor = ?,"
                + " editora = ?, numExemplares = ?, isbn = ?,"
                + " ano = ?, genero = ?, numPaginas = ?, status = ?"
                + "where codigo = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, lb.getTitulo());
            ps.setString(2, lb.getAutor());
            ps.setString(3, lb.getEditora());
            ps.setString(4, lb.getCodigo());
            ps.setString(5, lb.getNumExemplares());
            ps.setString(6, lb.getIsbn());
            ps.setString(7, lb.getAno());
            ps.setString(8, lb.getGenero());
            ps.setString(9, lb.getNumPaginas());
            ps.setString(10, lb.getStatus());

            if (ps.executeUpdate() > 0) {
                return "Livro alterado com sucesso!";
            } else {
                return "Falha ao alterar livro...";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }

    }

    public String excluir(LivroBean lb) {

        String sql = "delete from livro where codigo=?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, lb.getCodigo());

            if (ps.executeUpdate() > 0) {
                return "Tabela exluída com sucesso!";
            } else {
                return "Erro ao excluir tabela...";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public List<LivroBean> listarTodos() {

        String sql = "select * from livro";

        //Criando objeto para inserir dados dos livros
        List<LivroBean> listaLivro = new ArrayList<LivroBean>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    LivroBean lb = new LivroBean();

                    lb.setTitulo(rs.getString(1));
                    lb.setAutor(rs.getString(2));
                    lb.setEditora(rs.getString(3));
                    lb.setCodigo(rs.getString(4));
                    lb.setNumExemplares(rs.getString(5));
                    lb.setIsbn(rs.getString(6));
                    lb.setAno(rs.getString(7));
                    lb.setGenero(rs.getString(8));
                    lb.setNumPaginas(rs.getString(9));
                    lb.setStatus(rs.getString(10));

                    listaLivro.add(lb);

                }
                return listaLivro;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }

    }

}
