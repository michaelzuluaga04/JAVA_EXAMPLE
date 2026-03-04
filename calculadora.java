public class Calculadora {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA ===");
        
        int numero1 = 10;
        int numero2 = 5;
        
        // ERROR: escribí "suma" pero la variable se llama "resultado"
        System.out.println("La suma es: " + suma);  // ❌ ERROR: 'suma' no existe
        
        int resultado = numero1 + numero2;
        System.out.println("Esto sí funciona: " + resultado);
    }
}