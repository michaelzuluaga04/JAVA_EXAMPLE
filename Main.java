  import java.util.Scanner;


// public class Main {
//     public static void main(String[] args){
//         //VARIABLES

//         // boolean isStudent = true;
//         // System.out.print("I like pizza !!!\n");
//         // String namesito = "Pepeganga";
//         // if(isStudent){
//         //     System.out.println("Eres un estudiante mi h");
//         // }
//         // else{
//         //     System.out.println("Mi h esa vuelta no es asi ");
//         // }
//         // System.out.println(namesito);
                
//         //INPUT DE USUARIO
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Ingrese su nombre mi h ! : ");

//         String name = scanner.nextLine();

//         System.out.print("Ahora mi h ingrese su edad actual : ");

//         int age = scanner.nextInt();

//         System.out.print("Ahora mi h ingrese su promedio de icfes con decimales : ");

//         double promedio = scanner.nextDouble();

//         System.out.println("Estas matirculado en la ciaf");

//         boolean ciaf = scanner.nextBoolean();

//         if(ciaf){
//             System.out.println("Felicidades estas suscrito a la ciaf !!!!!");
//         }
//         else{
//             System.out.println("Lo lamento mucho, pero puedes ver nuestros planes de universidad");
//         }



//         // LUEGO DE QUE SE RECIBA UN DATO DE FORMA DE INT O DE NUMERO Y LUEGO UN DATO DE STRING LO MEJOR ES PONER ESTA LINEA DE CODIGO ES LLAMAR AL METODO
//         scanner.nextLine();


//         System.out.println("Hola "+ name + "  Tienes " + age + "!!!" + "  Su promedio es de "+ promedio);

//         scanner.close();
    
    
//     }

// }


public class Main {

    public static void main(String[] args){

        double ancho = 0;
        double alto = 0;
        double area = 0;
        
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("HOY VAMOS A CALCULAR EL AREA DE UN RECTANGULO");
        System.out.println("Digite por favor la base del RECTANGULO");
        ancho = scanner.nextDouble();

        System.out.println("Digite por favor la altura del RECTANGULO");
        alto = scanner.nextDouble();
        
        System.out.println("Digite por favor la base del RECTANGULO");
        ancho = scanner.nextDouble();
        

        area = alto * ancho;

        System.out.println("El area es : " + area);

        scanner.close();


        System.out.println("ESTO ES UNA IMPRESION POR MEDIO DE CONSOLA");

    }
}



