package com.company;

public class Libro {
    private String Titulo;
    private String isbn;
    private String autor;
    private String paginas;
    // constructor de la clase libro, este constructor recibe parametros
    public Libro(String titulo, String isbn, String autor, String paginas) {
        this.Titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = paginas;
    }
// de aca, se presentan los get y set de cada atributo (variables de la clase libro)

    public String getTitulo() {
        return Titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
@Override
    public String  toString(){
        return "el libro " + Titulo + "con su ISBN"+ isbn+ "creado por el autor" + autor + "tiene esta cantidad de pagina"+ paginas;
    }

}
