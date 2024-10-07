package logica;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //Hola Mundo
//        System.out.println("Hola Mundo!");
//        System.out.println("Suscribite a Todo Code y dale Like");
//
//        //Variables
//        int primerNumero = 5;
//        String nombreGato = "Shakespeare";
//        char inicialNombre = 's';
//        double temperatura = 35.2;
//        boolean amorPorJava = true;
//        long velocidadSonido = 300000000;
//
//        //Operaciones con Variables
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
//        //Condicionales If
//        int numA = 5, numB = 10;
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        }
//
//        //Condicionales If-Else
//        int numA = 15, numB = 15;
//
//        if (numA < numB){
//            System.out.println("El numero A es mayor que el B");
//        } else if (numA == numB) {
//            System.out.println("El numero B es mayor que el A");
//        }
//
//        //Condicionales If-Else Anidado
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
//        //Condicionales Switch
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
//        //Condicionales Operador Terciario
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
//        //Ciclos While
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
//        //Ciclos For
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
//
//        //Arreglos Vectores 1
//        int numbers[] = new int[5];
//        numbers[0] = 45;
//        numbers[1] = 159;
//        numbers[2] = 7536;
//        numbers[3] = 789;
//        numbers[4] = 123;
//
//        System.out.println(numbers[4]);
//
//        //Arreglos Vectores 2
//        int numbers[] = {159, 753, 456, 258, 321};
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println("Estoy en el indice " + i);
//            System.out.println("Tengo almacenado el valor " + numbers[i]);
//            System.out.println("----------------------");
//        }
//
//        //Arreglos Vectores 3
//        Scanner teclado = new Scanner(System.in);
//        int numbers[] = new int[5];
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println("Digite el valor para la posicion" + (i + 1));
//            numbers[i] = teclado.nextInt();
//        }
//
//        for (int i = 0; i < numbers.length; i++){
//           System.out.println("Estoy en el indice " + i);
//           System.out.println("Tengo almacenado el valor " + numbers[i]);
//           System.out.println("----------------------");
//        }
//
//        //Arreglos Matrices 1
//        int numbers[][] = new int[3][3];
//
//        numbers[0][0] = 123;
//        numbers[1][1] = 456;
//        numbers[2][2] = 789;
//
//        System.out.println(numbers[2][2]);
//
//        //Arreglos Matrices 2
//        int numbers[][] = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
//
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println("Posición[" + i + "][" + j + "]: " + numbers[i][j]);
//            }
//        }
//
//        //Arreglos Matrices 3
//        int numbers[][] = new int[3][3];
//        Scanner teclado = new Scanner(System.in);
//
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println("Digite el valor para la posicion[" + i + "][" + j + "]: ");
//                numbers[i][j] = teclado.nextInt();
//            }
//        }
//
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println("Posición[" + i + "][" + j + "]: " + numbers[i][j]);
//            }
//        }
//
//        //Arreglos Ejercicio 1
//        Scanner teclado = new Scanner(System.in);
//        int numbers[] = new int[15];
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Digite el valor numero " + (i + 1) + ": ");
//            numbers[i] = teclado.nextInt();
//            if (numbers[i] == 3) {
//                count++;
//            }
//        }
//
//        System.out.println("El numero 3 se repite un total de " + count + " veces");
//
//        //Arreglos Ejercicio 2 Solucion 1
//        Scanner teclado = new Scanner(System.in);
//        double notas[][] = new double[4][4];
//        double acumulado;
//        String resultado;
//
//        for (int i = 0; i < notas.length; i++) {
//            acumulado = 0;
//            for (int j = 0; j < notas[i].length; j++) {
//                if (j != (notas[i].length - 1)) {
//                    System.out.println("Digete la nota " + (j + 1) + " para el alumno " + (i + 1) + ":");
//                    notas[i][j] = teclado.nextDouble();
//                    acumulado += notas[i][j];
//                } else {
//                    notas[i][j] = acumulado / (notas[i].length - 1);
//                }
//            }
//            System.out.println("------------------");
//        }
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Notas del alumno " + (i + 1) + ":");
//            for (int j = 0; j < notas[i].length; j++) {
//                if (j != (notas[i].length - 1)) {
//                    System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
//                } else {
//                    System.out.println("Promedio del curso: " + notas[i][j]);
//                    if (notas[i][j] >= 3){
//                        resultado = "Aprobado";
//                    } else {
//                        resultado = "Reprobado";
//                    }
//                    System.out.println("El alumno " + resultado + " el curso");
//                }
//            }
//            System.out.println("------------------");
//        }
//
//        //Arreglos Ejercicio 2 Solucion 2
//        Scanner teclado = new Scanner(System.in);
//        double notas[][] = new double[4][4];
//        double acumulado;
//        String resultado;
//
//        for (int i = 0; i < notas.length; i++) {
//            acumulado = 0;
//            for (int j = 0; j < (notas[i].length - 1); j++) {
//                    System.out.println("Digete la nota " + (j + 1) + " para el alumno " + (i + 1) + ":");
//                    notas[i][j] = teclado.nextDouble();
//                    acumulado += notas[i][j];
//                }
//            notas[i][notas[i].length - 1] = acumulado / (notas[i].length - 1);
//            System.out.println("------------------");
//        }
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Notas del alumno " + (i + 1) + ":");
//            for (int j = 0; j < (notas[i].length - 1); j++) {
//                    System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
//            }
//            System.out.println("Promedio del curso: " + notas[i][notas[i].length - 1]);
//            if (notas[i][notas[i].length - 1] >= 3){
//                resultado = "Aprobado";
//            } else {
//                resultado = "Reprobado";
//            }
//            System.out.println("El alumno " + resultado + " el curso");
//            System.out.println("------------------");
//        }
//
//        //Arreglos Ejercicio 3
//        Scanner teclado = new Scanner(System.in);
//        String nombres[] = new String[8];
//
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Digite el nombre de la persona:");
//            nombres[i] = teclado.next();
//        }
//
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println((i + 1) + ". " + nombres[i]);
//        }
//
//        //Arreglos Ejercicio 4
//        Scanner teclado = new Scanner(System.in);
//        int cantidadCiudades = 5, ciudadMinTemp = 0, ciudadMaxTemp = 0;
//        String ciudades[] = new String[cantidadCiudades];
//        double maxTemperatura[] = new double[cantidadCiudades], minTemperatura[] = new double[cantidadCiudades];
//
//        for (int i = 0; i < cantidadCiudades; i++) {
//            System.out.println("Digite el nombre de la ciudad: ");
//            ciudades[i] = teclado.next();
//            System.out.println("Digite la temperatura minima de la ciudad: ");
//            minTemperatura[i] = teclado.nextDouble();
//            System.out.println("Digite la temperatura maxima de la ciudad: ");
//            maxTemperatura[i] = teclado.nextDouble();
//            if (i != 0) {
//                if (maxTemperatura[i] > maxTemperatura[i - 1]) {
//                    ciudadMaxTemp = i;
//                } else {
//                    ciudadMaxTemp = i - 1;
//                }
//                if (minTemperatura[i] < minTemperatura[i - 1]) {
//                    ciudadMinTemp = i;
//                } else {
//                    ciudadMinTemp = i - 1;
//                }
//            }
//            System.out.println("-----------------------");
//        }
//
//        System.out.println("La ciudad con la menor temperatura es " + ciudades[ciudadMinTemp]
//                + " con " + minTemperatura[ciudadMinTemp] + " grados de temperatura");
//        System.out.println("-----------------------");
//        System.out.println("La ciudad con la mayor temperatura es " + ciudades[ciudadMaxTemp]
//                + " con " + maxTemperatura[ciudadMaxTemp] + " grados de temperatura");
//
//        //Arreglos Ejercicio 5
//        int numbers[][] = new int[4][5];
//        String impresionFila = "";
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = 5;
//            }
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            impresionFila = "";
//            for (int j = 0; j < numbers[i].length; j++) {
//                impresionFila += numbers[i][j];
//            }
//            System.out.println(impresionFila);
//        }
//
//        //Arreglos Ejercicio 6
//        String centinel = "";
//        int destino = 0, horario = 0, asientos = 0;
//        Scanner teclado = new Scanner(System.in);
//        int asientosVuelos[][] = {
//                {50, 16, 32},
//                {48, 45, 23},
//                {32, 45, 21},
//                {78, 56, 95},
//                {56, 23, 48},
//                {32, 15, 63}
//        };
//
//        while (!centinel.equalsIgnoreCase("finish")) {
//            System.out.println("Digite el destino para el que desea reservar:");
//            System.out.println("0. Rio de Janeiro");
//            System.out.println("1. Cancún");
//            System.out.println("2. Madrid");
//            System.out.println("3. Roma");
//            System.out.println("4. Milán");
//            System.out.println("5. Iguazú");
//            destino = teclado.nextInt();
//
//            System.out.println("Digite el horario del vuelo:");
//            System.out.println("0. Mañana");
//            System.out.println("1. Tarde");
//            System.out.println("2. Noche");
//            horario = teclado.nextInt();
//
//            System.out.println("Digite la cantidad de asientos a reservar:");
//            asientos = teclado.nextInt();
//
//            if (asientosVuelos[destino][horario] >= asientos) {
//                asientosVuelos[destino][horario] -= asientos;
//                System.out.println("Reserva realizada con exito");
//            } else {
//                System.out.println("Solo hay " + asientosVuelos[destino][horario] + " asientos disponibles");
//                System.out.println("No se pudo realizar la reserva");
//            }
//
//            System.out.println("¿Continuar realizando reservas? (yes/finish)");
//            centinel = teclado.next();
//        }

    }
}