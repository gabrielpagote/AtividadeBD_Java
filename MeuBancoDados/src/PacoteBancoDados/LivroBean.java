package PacoteBancoDados;

public class LivroBean {

    //Definindo atributos/variáveis globais;
    private String titulo;
    private String autor;
    private String editora;
    private String codigo;
    private String numExemplares;
    private String isbn;
    private String ano;
    private String genero;
    private String numPaginas;
    private String status;

    //Criar os Construtores;
    public LivroBean() {
    }

    public LivroBean(String titulo, String autor, String editora, String codigo, String numExemplares, String isbn, String ano, String genero, String numPaginas, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.codigo = codigo;
        this.numExemplares = numExemplares;
        this.isbn = isbn;
        this.ano = ano;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.status = status;
    }

    //Definindo os Getters e Setters;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumExemplares() {
        return numExemplares;
    }

    public void setNumExemplares(String numExemplares) {
        this.numExemplares = numExemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
