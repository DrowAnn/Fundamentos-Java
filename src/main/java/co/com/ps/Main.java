package co.com.ps;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //Primer Video
//        System.out.println("Hola Mundo!");
//        System.out.println("Suscribite a Todo Code y dale Like");
//
//        //Segundo Video
//        int primerNumero = 5;
//        String nombreGato = "Shakespeare";
//        char inicialNombre = 's';
//        double temperatura = 35.2;
//        boolean amorPorJava = true;
//        long velocidadSonido = 300000000;
//
//        //Tercer Video
//        int num1, num2;
//        float resultado;
//
//        num1 = 40;
//        num2 = 8;
//        resultado = num1 / num2;
//
//        System.out.println("El resultado es: " + resultado);
//
//        //Primer Ejercicio - Intercambio de Variables
//         int numA = 5, numB = 10, paso;
//
//         paso = numB;
//         numB = numA;
//         numA = paso;
//
//        System.out.println("La variable A vale: " + numA + " y la variable B vale: " + numB);
//
//        //Cuarto Video
//        int numA = 5, numB = 10;
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        }
//
//        //Quinto Video
//        int numA = 15, numB = 15;
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        } else if (numA == numB) {
//            System.out.println("El numero B es mayor que el A");
//        }
//
//        //Sexto Video
//        int numA = 15, numB = 15;
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        } else {
//            if (numA == numB){
//                System.out.println("El numero A es igual que el B");
//            } else {
//                System.out.println("El numero B es mayor que el A");
//            }
//        }
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        } else if (numA == numB) {
//            System.out.println("El numero B es igual que el A");
//        } else {
//            System.out.println("El numero B es mayor que el A");
//        }
//
//        //Septimo Video
//        char caso = 'c';
//        String respuesta;
//
//        switch (caso) {
//            case 'a':
//                respuesta = "Letra A";
//                break;
//            case 'b':
//                respuesta = "Letra B";
//                break;
//            case 'c':
//                respuesta = "Letra C";
//                break;
//            default:
//                respuesta = "No hay Letra";
//                break;
//        }
//        System.out.println(respuesta);
//
//        //Segundo Ejercicio - Sueldos Empleados
//        int categoria;
//        double sueldo = 0;
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("1. Repositor");
//        System.out.println("2. Cajero");
//        System.out.println("3. Supervisor");
//        System.out.println("Digite el numero de la opcion que corresponede al cargo:");
//
//        categoria = teclado.nextInt();
//
//        switch (categoria) {
//            case 1:
//                sueldo = 15890 * 1.1;
//                break;
//            case 2:
//                sueldo = 25630.20;
//                break;
//            case 3:
//                sueldo = 35560.20 * 0.89;
//                break;
//            default:
//                System.out.println("Opción Incorrecta");
//                break;
//        }
//
//        if (sueldo != 0) {
//            System.out.println("El sueldo es: " + sueldo);
//        }
//
//        //Operador Terciario
//        double notaCurso;
//        String estadoCurso;
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("Digite la nota final del curso: ");
//        notaCurso = teclado.nextDouble();
//
//        estadoCurso = (notaCurso >= 3) ? "Aprobado" : "Desaprobado";
//
//        System.out.println("El Alumno esta " + estadoCurso);
//
//        //Noveno Video
//        int count = 0, centinel = 0;
//        Scanner teclado = new Scanner(System.in);
//
//        while (count <= 10) {
//            System.out.println("Numero " + count);
//            count++;
//        }
//
//        while (centinel != 5) {
//            System.out.println("Digite un numero: ");
//            centinel = teclado.nextInt();
//        }
//        System.out.println("El centinela a detectado el valor esperado y finalizo el programa");
//
//        //Onceava Clase
//        for (int i = 0; i < 10; i = i + 5) {
//            System.out.println("Numero " + i);
//        }
//
//        //Ciclos Ejercicio Uno
//        int limite;
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("Digite el limite para el conteo");
//        limite = teclado.nextInt();
//
//        for (int i = 1; i <= limite; i++) {
//            System.out.println(i);
//        }
//
//        //Ciclos Ejercicio Dos
//        int count = 200;
//
//        while (count <= 250) {
//            System.out.println(count);
//            count += 2;
//        }
//
//        //Ciclos Ejercicio Tres
//        String palabra = "";
//        Scanner teclado = new Scanner(System.in);
//
//        while (!palabra.toLowerCase().equals("salir")) {
//            System.out.println("Digite una palabra");
//            palabra = teclado.next();
//        }
//
//        //Inegrador Ejercicio Uno
//        String nombre = "";
//        int dni = 1, edad = 0;
//        Scanner teclado = new Scanner(System.in);
//
//        while (dni != 0 && !nombre.equalsIgnoreCase("salir")) {
//            System.out.println("Digite el DNI:");
//            dni = teclado.nextInt();
//            System.out.println("Digite el Nombre: ");
//            nombre = teclado.next();
//
//            if (dni != 0){
//                System.out.println("Digite la Edad: ");
//                edad = teclado.nextInt();
//                System.out.println("Categoria asignada a " + nombre + ": ");
//                if (edad > 50) {
//                    System.out.println("Adultos Mayores");
//                } else if (edad >= 31) {
//                    System.out.println("Adultos");
//                } else if (edad >= 18) {
//                    System.out.println("Juveniles");
//                } else if (edad >= 11) {
//                    System.out.println("Menores B");
//                } else if (edad >= 6 && edad <= 10) {
//                    System.out.println("Menores A");
//                } else {
//                    System.out.println("Ninguna, edad inferior al minimo permitido");
//                }
//            }
//        }
//
//        //Ciclos Ejercicio Cuatro
//        Scanner teclado = new Scanner(System.in);
//        int tamano;
//        String line;
//
//        System.out.println("Digite el numero de lineas para el arbol:");
//        tamano = teclado.nextInt();
//
//        for (int i = 1; i <= tamano; i++){
//            line = "";
//            for (int j = 1; j < tamano + i; j++){
//                if (j <= tamano - i) {
//                    line = line + " ";
//                } else {
//                    line = line + "*";
//                }
//            }
//            System.out.println(line);
//        }

    }
}