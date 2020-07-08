package PacoteBancoDados;

import java.sql.*;
import java.util.*;

public class TestaLivro {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        LivroBean livroBean = new LivroBean();

        LivroDAO livroDAO = new LivroDAO(con);

        livroBean.setTitulo("Divina comedia");
        livroBean.setAutor("Dante Alighierri");
        livroBean.setEditora("LL Library");
        livroBean.setCodigo("ABC1234XYZ");
        livroBean.setNumExemplares("30000000");
        livroBean.setIsbn("978078582");
        livroBean.setAno("1472");
        livroBean.setGenero("Poesia epica");
        livroBean.setStatus("Em andamento");

        livroDAO.inserir(livroBean);

        String resultado = livroDAO.inserir(livroBean);

        System.out.println(resultado);
    
           //inserir
        //String resultado = carroDAO.inserir(carroBean);
        //System.out.println(resultado);
        
        //Alterar
       // System.out.println(carroDAO.alterar(carroBean));
       
       //Excluir
       //System.out.println(carroDAO.excluir(carroBean));
       
       //Consultar / Pesquisar

    }

}
