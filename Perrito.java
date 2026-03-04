public class Perrito {
    private String nombre;
    public Perrito(String nombre) {
        this.nombre = nombre;
    }
    public void saludar() {
        System.out.println("Hola, humano soy " + nombre);
    }
}