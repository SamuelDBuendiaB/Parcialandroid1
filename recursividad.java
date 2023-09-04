import java.util.Scanner;

public class recursividad{
 public static void main(String[] args) {
   Scanner numeros = new Scanner(System.in);
   
   System.out.println("Ingrese numero base");
   double base = numeros.nextDouble();
   System.out.println("Ingrese el exponente");
   double expo = numeros.nextDouble();

  System.out.println("El numero elevado es  "+operacion(base,expo));
   
}

public static double operacion(double base,double expo){
 if (expo==0) {
    return 1;
   }
   else {
       return base *operacion(base,expo-1);
   }
}

}