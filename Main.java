// Clase que define los datos y acciones de cada personaje
class Personaje {
    String nombrePersonaje;
    int rango;
    int saludTotal;

    // Constructor: asigna los datos iniciales al crear el personaje
    public Personaje(String nombrePersonaje, int rango, int saludTotal) {
        this.nombrePersonaje = nombrePersonaje;
        this.rango = rango;
        this.saludTotal = saludTotal;
    }

    // Metodo para restar salud cuando el personaje recibe un golpe
    public void golpear(int danio) {
        saludTotal = saludTotal - danio;
        System.out.println(nombrePersonaje + " recibio " + danio + " de danio. Salud restante: " + saludTotal);
    }

    // Metodo para subir de rango y recuperar algo de salud
    public void subirDeNivel() {
        rango = rango + 1;
        saludTotal = saludTotal + 20;
        System.out.println("!Genial! " + nombrePersonaje + " subio al rango " + rango);
    }

    // Metodo para imprimir el perfil del personaje
    public void mostrarPerfil() {
        System.out.println("Personaje: " + nombrePersonaje + " | Rango: " + rango + " | Salud: " + saludTotal);
    }
}

// Clase principal donde probamos el programa
public class Main {
    public static void main(String[] args) {
        // Creacion de personajes con 100 de salud inicial
        Personaje jugador1 = new Personaje("Gema", 1, 100);
        Personaje jugador2 = new Personaje("Nestor", 2, 100);

        System.out.println("=== Inicio de la partida ===");
        jugador1.mostrarPerfil();
        jugador2.mostrarPerfil();

        System.out.println("\n=== Simulando jugadas ===");
        // Gema recibe un ataque de 31 de danio
        jugador1.golpear(31);
        jugador1.subirDeNivel();

        System.out.println("\n=== Estado final ===");
        jugador1.mostrarPerfil();
        jugador2.mostrarPerfil();
    }
}