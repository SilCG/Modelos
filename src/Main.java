public class Main {

    public static void main (String[] args) {

        // Modelo de un libro
        // String titulo = "Le Rouge et le Noir";
        // String autor = "Stendhal";
        // String genero = "Novela";
        // short anioPublicacion = 1830; // Short representa un número entero que ocupa 2 bytes en memoria. [-32768, 32767]

        //System.out.println("El libro se titula " + titulo + ", y es un(a) " + genero + " publicado(a) por " + autor + " en " + anioPublicacion);
        // sout + TAB

        // 1. Construcción del objeto
        Libro libro1 = new Libro();

        // 2. Asignación de los atributos del objeto
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.genero = "Novela";
        libro1.anioPublicacion = 1967;

        System.out.println("El libro se titula " + libro1.titulo + ", y es un(a) " + libro1.genero + " publicado(a) por " + libro1.autor + " en " + libro1.anioPublicacion);

        //Modelo de un perro
        String nombrePerro = "Trico";
        byte edadPerro = 7;
        String raza = "Mestizo";
        String contactoPerro = "Felipe Barboza";

        System.out.println(contactoPerro + " es el encargado de " + nombrePerro + " que es un perro de tipo " + raza + " y tiene una edad en años de " + edadPerro);

        //Modelo de una persona
        String nombrePersona = "Felipe";
        byte edadPersona = 27;
        String profesion = "Profesor de cálculo";
        String identificacion = "2-1325 0971";

        System.out.println(nombrePersona + ", cédula: " + identificacion + " es el " + profesion + " que me tocó en este cuatri y tiene unos " + edadPersona + " años");

        //Modelo de una cuenta de crédito
        String propietarioCuenta = "Lucia Contreras";
        double saldoTarjeta = 57.927;
        int fechaCorte = 9;
        String comportamientoPagos = "Acpetable";

        System.out.println("El estudio de " + propietarioCuenta + " reveló que su salgo es de " + saldoTarjeta + ", que su fecha de corte son los " + fechaCorte + " de cada mes. Y su historial de pagos es " + comportamientoPagos );

    }
}
