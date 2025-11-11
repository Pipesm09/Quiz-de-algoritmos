
package quizayp2;

import java.util.Scanner;


public class QuizAyP2 {

    
    public static void main(String[] args) {
      int opcion = 0;
        int dato;
        Scanner teclado = new Scanner (System.in);
        Lista_simplemente_ligada listaSimple= new Lista_simplemente_ligada ();
        
        do{
            System.out.println("Menú de opciones de la lista simple");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final ");
            System.out.println("3. Insertar en medio");
            System.out.println("4. Eliminar al inicio");
            System.out.println("5. Eliminar al final");
            System.out.println("6. Eliminar en medio");
            System.out.println("7. Mostrar datos");
            System.out.println("8. Borrar el dato mas grande");
            System.out.println("9. Invertir lista");
            System.out.println("10. Salir");
            System.out.print("Ingrese la opcion: ");
            
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el valor: ");
                    dato = teclado.nextInt();
                    listaSimple.InsertarInicio(dato);
                    break;
                case 2: 
                    System.out.println("Ingrese el valor");
                    dato = teclado.nextInt();
                    listaSimple.InsertarFinal(dato);
                    break;
                case 3:
                    System.out.println("Ingrese el valor");
                    dato = teclado.nextInt();
                    listaSimple.InsertarEnMedio(dato);
                    break;
                case 4:
                    listaSimple.BorrarInicio();
                    break;
                case 5: 
                     listaSimple.BorrarAlFinal();
                    break;
                case 6: 
                    System.out.println("Ingrese el valor a borrar: ");
                    dato = teclado.nextInt();
                    listaSimple.BorrarEnMedio(dato);
                    break;
                case 7:
                    listaSimple.MostrarDatos();
                    break;
                case 8: 
                    listaSimple.BorrarDatoMayor();
                    break;
                case 9:
                    listaSimple.listaInvertida();
                    break;
                case 10:
                    System.out.println("Saliendo ...");
                    break;
                    
                    
            }
        }while(opcion != 10);
          
    }
    
}
