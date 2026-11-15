// Datos y acciones básicas de cualquier personaje
class Personaje {
    String nombrePersonaje;
    int rango;
    int saludTotal;

    // Asigna los valores iniciales cuando se crea el personaje
    public Personaje(String nombrePersonaje, int rango, int saludTotal) {
        this.nombrePersonaje = nombrePersonaje;
        this.rango = rango;
        this.saludTotal = saludTotal;
    }

    // Le bajamos salud si le dan un golpe
    public void golpear(int danio) {
        saludTotal = saludTotal - danio;
        System.out.println(nombrePersonaje + " recibió " + danio + " de daño. Salud restante: " + saludTotal);
    }

    // Sube de nivel y le regalamos un poco más de salud
    public void subirDeNivel() {
        rango = rango + 1;
        saludTotal = saludTotal + 20;
        System.out.println("¡Genial! " + nombrePersonaje + " subió al rango " + rango);
    }

    // Muestra cómo va el personaje
    public void mostrarPerfil() {
        System.out.println("Personaje: " + nombrePersonaje + " | Rango: " + rango + " | Salud: " + saludTotal);
    }
}

// Aquí aplicamos la herencia: esta clase hija hereda todo lo de Personaje
class Luchador extends Personaje {
    String armaEspecial;

    // Usamos super para heredar los datos del personaje base y le añadimos su arma
    public Luchador(String nombrePersonaje, int rango, int saludTotal, String armaEspecial) {
        super(nombrePersonaje, rango, saludTotal);
        this.armaEspecial = armaEspecial;
    }

    // Un método extra que solo tiene esta clase hija
    public void atacarConArma() {
        System.out.println(nombrePersonaje + " usa su ataque especial con " + armaEspecial + "!");
    }
}

// Aquí probamos que todo funcione bien
public class Main {
    public static void main(String[] args) {
        // Creamos un personaje normal y un luchador heredando de la clase principal
        Personaje jugador1 = new Personaje("Gema", 1, 100);
        Luchador jugador2 = new Luchador("Nestor", 2, 100, "Espada de fuego");

        System.out.println("=== Inicio de la partida ===");
        jugador1.mostrarPerfil();
        jugador2.mostrarPerfil();

        System.out.println("\n=== Simulando jugadas ===");
        jugador1.golpear(31);
        jugador1.subirDeNivel();
        
        // Probamos el método exclusivo de la clase hija
        jugador2.atacarConArma();

        System.out.println("\n=== Estado final ===");
        jugador1.mostrarPerfil();
        jugador2.mostrarPerfil();
    }
}
