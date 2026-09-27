public class Libro { // Las clases son como un molde

    // Atributos (variable asociadas con un objeto)
    String titulo;
    String autor;
    String genero;
    short anioPublicacion;

    // Métodos
    // Constructor completo - Sin return o void, se llama exactamente igual que la clase, recibe parametros para inicializarse de una vez
    Libro(String titulo, String autor, String genero, short anioPublicacion) {
        this.titulo = titulo; // el *this* hace referencia al objeto que se está creando
        this.autor = autor; // ejemplo: al autor de this.autor pongale este autor
        this.genero = genero; //El atributo génreo DEL OBJETO que se está creando ahora mismo (this), que se le asigne el valor del parámetro género que acabo de recibir
        this.anioPublicacion = anioPublicacion;
    }

    // Constructor parcial (sobrecargado)
    Libro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        genero = null;
        anioPublicacion = 1800;
    }

    // Contructor por defecto (dejando el parantesis vacío)
    Libro (){}



}