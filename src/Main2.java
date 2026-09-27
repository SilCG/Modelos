public class Main2 {

    public static void main (String[] args){

        int edad = 20;
        mensajeCumpleanios(edad); // Paso de parámetro por valor
        System.out.println(edad); // esta es lo que hay en la posición de memoria

        String ejemplo = "        Hola a todos     ";
        quitarEspacios(ejemplo);
        System.out.println(ejemplo);
    }

    static void mensajeCumpleanios(int edadAnterior){
        edadAnterior = edadAnterior + 1;
        System.out.println("¡Felicidades, cumpliste " + edadAnterior + " años!");
    }

    static void quitarEspacios(String original){
        original = original.strip();
        System.out.println("La cadena sin espacios es: " + original);
    }
}

// me quedó incompleto
