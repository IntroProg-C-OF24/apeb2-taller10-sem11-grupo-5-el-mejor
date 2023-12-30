//EJERCICIO 01 ------------------------------------------------------------------------------------------------------------------------------------------------------
/*  public class TALLER10 {
    public static void main(String[] args) {
        String nomAlabado[] = {"ESTUDIANTE 1","ESTUDIANTE 2","ESTUDIANTE 3","ESTUDIANTE 4","ESTUDIANTE 5","ESTUDIANTE 6","ESTUDIANTE 7","ESTUDIANTE 8","ESTUDIANTE 9","ESTUDIANTE 10","ESTUDIANTE 11","ESTUDIANTE 12","ESTUDIANTE 13","ESTUDIANTE 14","ESTUDIANTE 15","ESTUDIANTE 16","ESTUDIANTE 17","ESTUDIANTE 18","ESTUDIANTE 19","ESTUDIANTE 20","ESTUDIANTE 21","ESTUDIANTE 22","ESTUDIANTE 23","ESTUDIANTE 24","ESTUDIANTE 25","ESTUDIANTE 26","ESTUDIANTE 27","ESTUDIANTE 28"};
        int limEst = nomAlabado.length, limNotas = 3;
        double matNotas[][] = new double[limEst][limNotas];
        double arrPromedio[] = new double[limEst];
        double promedioGeneral = 0;
        int EstudianteChever = 0;
        int Estudiantevago = 0;

        for (int i = 0; i < limEst; i++)
            for (int j = 0; j < limNotas; j++)
                matNotas[i][j] = (double) (Math.random() * 9 + 1);

        for (int i = 0; i < limEst; i++) {
            arrPromedio[i] = (matNotas[i][0] * 0.35) + (matNotas[i][1] * 0.35) + (matNotas[i][2] * 0.30);
            promedioGeneral += arrPromedio[i];

            if (arrPromedio[i] > arrPromedio[EstudianteChever]) {
                EstudianteChever = i;
            }
            if (arrPromedio[i] < arrPromedio[Estudiantevago]) {
                Estudiantevago = i;
            }
        }
        promedioGeneral /= limEst;

        System.out.println("NOMBRES | ACD   | APE   | AA    | PROMEDIOS");
        for (int i = 0; i < limEst; i++) {
            System.out.print(nomAlabado[i] + "\t");
            for (int j = 0; j < limNotas; j++)
                System.out.printf("| %.2f \t", matNotas[i][j]);
            System.out.printf("| %.2f \t", arrPromedio[i]);
            System.out.println("");
        }

        System.out.printf("\nPromedio General: %.2f\n", promedioGeneral);
        System.out.println("\nMejor Estudiante: " + nomAlabado[EstudianteChever] +
                " | Promedio: " + arrPromedio[EstudianteChever]);

        System.out.println("Peor Estudiante: " + nomAlabado[Estudiantevago] +
                " | Promedio: " + arrPromedio[Estudiantevago]);
        System.out.println("\nEstudiantes por encima del promedio:");
        for (int i = 0; i < limEst; i++) {
            if (arrPromedio[i] > promedioGeneral) {
                System.out.println(nomAlabado[i] + " | Promedio: " + arrPromedio[i]);
            }
        }

        System.out.println("\nEstudiantes por debajo del promedio:");
        for (int i = 0; i < limEst; i++) {
            if (arrPromedio[i] < promedioGeneral) {
                System.out.println(nomAlabado[i] + " | Promedio: " + arrPromedio[i]);
            }
        }
    }
}

// EJECUCION DEL PROGRAMA
   /*
NOMBRES | ACD   | APE   | AA    | PROMEDIOS
ESTUDIANTE 1	| 6.08 	| 6.57 	| 2.87 	| 5.28 	
ESTUDIANTE 2	| 8.67 	| 7.49 	| 7.96 	| 8.04 	
ESTUDIANTE 3	| 1.20 	| 1.51 	| 3.98 	| 2.14 	
ESTUDIANTE 4	| 9.79 	| 5.45 	| 7.55 	| 7.60 	
ESTUDIANTE 5	| 2.57 	| 5.54 	| 2.01 	| 3.44 	
ESTUDIANTE 6	| 7.67 	| 9.13 	| 7.96 	| 8.27 	
ESTUDIANTE 7	| 1.07 	| 3.04 	| 2.92 	| 2.32 	
ESTUDIANTE 8	| 9.21 	| 2.12 	| 5.74 	| 5.69 	
ESTUDIANTE 9	| 8.53 	| 8.06 	| 4.33 	| 7.10 	
ESTUDIANTE 10	| 4.94 	| 1.85 	| 3.44 	| 3.41 	
ESTUDIANTE 11	| 9.10 	| 3.37 	| 7.93 	| 6.75 	
ESTUDIANTE 12	| 5.93 	| 2.73 	| 3.72 	| 4.15 	
ESTUDIANTE 13	| 3.59 	| 6.62 	| 8.50 	| 6.12 	
ESTUDIANTE 14	| 5.79 	| 7.94 	| 4.85 	| 6.26 	
ESTUDIANTE 15	| 1.27 	| 4.78 	| 4.23 	| 3.39 	
ESTUDIANTE 16	| 3.12 	| 7.06 	| 9.66 	| 6.46 	
ESTUDIANTE 17	| 3.44 	| 4.60 	| 4.93 	| 4.29 	
ESTUDIANTE 18	| 3.92 	| 5.57 	| 9.04 	| 6.04 	
ESTUDIANTE 19	| 7.94 	| 7.04 	| 7.86 	| 7.60 	
ESTUDIANTE 20	| 4.16 	| 8.82 	| 1.77 	| 5.08 	
ESTUDIANTE 21	| 1.20 	| 9.92 	| 6.65 	| 5.89 	
ESTUDIANTE 22	| 8.32 	| 6.90 	| 9.84 	| 8.28 	
ESTUDIANTE 23	| 4.55 	| 4.35 	| 2.84 	| 3.97 	
ESTUDIANTE 24	| 6.20 	| 8.36 	| 5.57 	| 6.77 	
ESTUDIANTE 25	| 9.75 	| 6.59 	| 4.80 	| 7.16 	
ESTUDIANTE 26	| 4.22 	| 5.93 	| 8.35 	| 6.06 	
ESTUDIANTE 27	| 6.85 	| 6.67 	| 7.83 	| 7.08 	
ESTUDIANTE 28	| 5.55 	| 9.52 	| 1.92 	| 5.85 	

Promedio General: 5.73

Mejor Estudiante: ESTUDIANTE 22 | Promedio: 8.28
Peor Estudiante: ESTUDIANTE 3 | Promedio: 2.13

Estudiantes por encima del promedio:
ESTUDIANTE 2 | Promedio: 8.04
ESTUDIANTE 4 | Promedio: 7.60
ESTUDIANTE 6 | Promedio: 8.26
ESTUDIANTE 9 | Promedio: 7.10
ESTUDIANTE 11 | Promedio: 6.74
ESTUDIANTE 13 | Promedio: 6.12
ESTUDIANTE 14 | Promedio: 6.25
ESTUDIANTE 16 | Promedio: 6.45
ESTUDIANTE 18 | Promedio: 6.03
ESTUDIANTE 19 | Promedio: 7.59
ESTUDIANTE 21 | Promedio: 5.88
ESTUDIANTE 22 | Promedio: 8.28
ESTUDIANTE 24 | Promedio: 6.76
ESTUDIANTE 25 | Promedio: 7.15
ESTUDIANTE 26 | Promedio: 6.05
ESTUDIANTE 27 | Promedio: 7.08
ESTUDIANTE 28 | Promedio: 5.85

Estudiantes por debajo del promedio:
ESTUDIANTE 1 | Promedio: 5.28
ESTUDIANTE 3 | Promedio: 2.13
ESTUDIANTE 5 | Promedio: 3.44
ESTUDIANTE 7 | Promedio: 2.31
ESTUDIANTE 8 | Promedio: 5.68
ESTUDIANTE 10 | Promedio: 3.41
ESTUDIANTE 12 | Promedio: 4.14
ESTUDIANTE 15 | Promedio: 3.38
ESTUDIANTE 17 | Promedio: 4.28
ESTUDIANTE 20 | Promedio: 5.07
ESTUDIANTE 23 | Promedio: 3.96
*/
//EJERCICIO 02--------------------------------------------------------------------------------------------------------------------------------------------------
/* import java.util.Scanner;

public class TALLER10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[100][3];
        int totalProductos = 0;

        int opcion;
        do {
            System.out.println("\nINVENTARIO DE MI TIENDA SETSI:");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar nuevo producto
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    String precio = scanner.next();
                    System.out.print("Ingrese la cantidad en stock: ");
                    String cantidad = scanner.next();

                    inventario[totalProductos][0] = nombre;
                    inventario[totalProductos][1] = precio;
                    inventario[totalProductos][2] = cantidad;

                    System.out.println("Producto agregado exitosamente.");
                    totalProductos++;
                    break;

                case 2:
                    // Actualizar existencias
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.next();

                    int indiceActualizar = -1;
                    for (int i = 0; i < totalProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreActualizar)) {
                            indiceActualizar = i;
                            break;
                        }
                    }

                    if (indiceActualizar != -1) {
                        System.out.print("Ingrese la nueva cantidad en stock: ");
                        String nuevaCantidad = scanner.next();
                        inventario[indiceActualizar][2] = nuevaCantidad;
                        System.out.println("Existencias actualizadas exitosamente.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    // Buscar producto
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.next();

                    int indiceBuscar = -1;
                    for (int i = 0; i < totalProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreBuscar)) {
                            indiceBuscar = i;
                            break;
                        }
                    }

                    if (indiceBuscar != -1) {
                        System.out.println("Producto encontrado:");
                        System.out.println("Nombre: " + inventario[indiceBuscar][0]);
                        System.out.println("Precio: " + inventario[indiceBuscar][1]);
                        System.out.println("Cantidad en stock: " + inventario[indiceBuscar][2]);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    // Eliminar producto
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.next();

                    int indiceEliminar = -1;
                    for (int i = 0; i < totalProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                            indiceEliminar = i;
                            break;
                        }
                    }

                    if (indiceEliminar != -1) {
                        for (int i = indiceEliminar; i < totalProductos - 1; i++) {
                            inventario[i] = inventario[i + 1];
                        }
                        System.out.println("Producto eliminado exitosamente.");
                        totalProductos--;
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\nInventario:");
                    System.out.println("Nombre\t\tPrecio\t\tCantidad en stock");
                    for (int i = 0; i < totalProductos; i++) {
                        System.out.println(inventario[i][0] + "\t\t" + inventario[i][1] + "\t\t" + inventario[i][2]);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);
    }
}*/
//EJECUCION DEL PROGRAMA*********************
/*
INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 1
Ingrese el nombre del producto: pan
Ingrese el precio del producto: 0.15
Ingrese la cantidad en stock: 25
Producto agregado exitosamente.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 1
Ingrese el nombre del producto: leche
Ingrese el precio del producto: 1.00
Ingrese la cantidad en stock: 25
Producto agregado exitosamente.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 1
Ingrese el nombre del producto: galletas
Ingrese el precio del producto: 0.25
Ingrese la cantidad en stock: 20
Producto agregado exitosamente.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 2
Ingrese el nombre del producto a actualizar: [an
Producto no encontrado.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 2
Ingrese el nombre del producto a actualizar: pan
Ingrese la nueva cantidad en stock: 25
Existencias actualizadas exitosamente.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 
3
Ingrese el nombre del producto a buscar: leche
Producto encontrado:
Nombre: leche
Precio: 1.00
Cantidad en stock: 25

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 4
Ingrese el nombre del producto a eliminar: galletas
Producto eliminado exitosamente.

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 5

Inventario:
Nombre		Precio		Cantidad en stock
pan		0.15		25
leche		1.00		25

INVENTARIO DE MI TIENDA SETSI:
1. Agregar nuevo producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
0. Salir
Seleccione una opción: 0
Saliendo del programa.*/
//EJERCICIO 3 ------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inventario de la tienda [nombre, precio, cantidad]
        String[][] inventario = {
            {"Producto1", "10.0", "50"},
            {"Producto2", "20.0", "30"},
            {"Producto3", "15.0", "40"}
        };

        int opcion;
        do {
            System.out.println("\nGestión de Tienda:");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Facturar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInventario:");
                    System.out.println("Código\tNombre\t\tPrecio\tCantidad");
                    for (int i = 0; i < inventario.length; i++) {
                        System.out.println(i + 1 + "\t" + inventario[i][0] + "\t\t$" + inventario[i][1] + "\t" + inventario[i][2]);
                    }
                    break;

                case 2:
                    System.out.println("\nInventario:");
                    System.out.println("Código\tNombre\t\tPrecio\tCantidad");
                    for (int i = 0; i < inventario.length; i++) {
                        System.out.println(i + 1 + "\t" + inventario[i][0] + "\t\t$" + inventario[i][1] + "\t" + inventario[i][2]);
                    }

                    System.out.print("Ingrese el código del producto a facturar: ");
                    int codigoProducto = scanner.nextInt();

                    if (codigoProducto >= 1 && codigoProducto <= inventario.length) {
                        int indiceProducto = codigoProducto - 1;
                        System.out.print("Ingrese la cantidad deseada: ");
                        int cantidadDeseada = scanner.nextInt();

                        double precioUnitario = Double.parseDouble(inventario[indiceProducto][1]);
                        double subtotal = precioUnitario * cantidadDeseada;
                        double iva = 0.12 * subtotal;

                        double descuento = 0;
                        double total = subtotal + iva;

                        if (total > 100) {
                            descuento = 0.1 * total;
                            total -= descuento;
                            System.out.println("¡Alerta! Descuento aplicado: -$" + descuento);
                        }

                        System.out.println("\nFACTURA:");
                        System.out.println("Producto: " + inventario[indiceProducto][0]);
                        System.out.println("Precio Unitario: $" + precioUnitario);
                        System.out.println("Cantidad: " + cantidadDeseada);
                        System.out.println("Subtotal: $" + subtotal);
                        System.out.println("IVA (12%): +$" + iva);
                        System.out.println("Descuento: -$" + descuento);
                        System.out.println("Total a Pagar: $" + total);
                    } else {
                        System.out.println("Código de producto no válido.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}

*/
//EJECUCION DEL PROGRAMA
/*
Gestión de Tienda:
1. Mostrar Inventario
2. Facturar Producto
0. Salir
Seleccione una opción: 1

Inventario:
Código	Nombre		Precio	Cantidad
1	Producto1		$10.0	50
2	Producto2		$20.0	30
3	Producto3		$15.0	40

Gestión de Tienda:
1. Mostrar Inventario
2. Facturar Producto
0. Salir
Seleccione una opción: 2

Inventario:
Código	Nombre		Precio	Cantidad
1	Producto1		$10.0	50
2	Producto2		$20.0	30
3	Producto3		$15.0	40
Ingrese el código del producto a facturar: 2
Ingrese la cantidad deseada: 25
¡Alerta! Descuento aplicado: -$56.0

FACTURA:
Producto: Producto2
Precio Unitario: $20.0
Cantidad: 25
Subtotal: $500.0
IVA (12%): +$60.0
Descuento: -$56.0
Total a Pagar: $504.0

Gestión de Tienda:
1. Mostrar Inventario
2. Facturar Producto
0. Salir
Seleccione una opción: 0
Saliendo del programa.
*/
//PROBLEMA 4----------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class PRUEBA {

    public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jugadorActual = 'X';
        boolean juegoEnCurso = true;
        while (juegoEnCurso) {
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("  -----");
                }
            }
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int fila, columna;
            do {
                System.out.println("Jugador " + jugadorActual + ", ingresa la fila (0-2) y la columna (0-2) separadas por espacio:");
                fila = scanner.nextInt();
                columna = scanner.nextInt();
            } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');
            tablero[fila][columna] = jugadorActual;
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                    (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                    juegoEnCurso = false;
                }
            }
            if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
                juegoEnCurso = false;
            }

            boolean empate = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        empate = false;
                        break;
                    }
                }
                if (!empate) {
                    break;
                }
            }
            if (empate) {
                juegoEnCurso = false;
                System.out.println("¡El juego es un empate!");
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }
}
*/
//EJECUCION DEL PROGRAMA ******************************************
/*
  0 1 2
0  | | 
  -----
1  | | 
  -----
2  | | 

Jugador X, ingresa la fila (0-2) y la columna (0-2) separadas por espacio:
2
2
  0 1 2
0  | | 
  -----
1  | | 
  -----
2  | |X

Jugador O, ingresa la fila (0-2) y la columna (0-2) separadas por espacio:
2
0
  0 1 2
0  | | 
  -----
1  | | 
  -----
2 O| |X

Jugador X, ingresa la fila (0-2) y la columna (0-2) separadas por espacio:
1
1
  0 1 2
0  | | 
  -----
1  |X| 
  -----
2 O| |X

Jugador O, ingresa la fila (0-2) y la columna (0-2) separadas por espacio:
0
1
  0 1 2
0  |O| 
  -----
1  |X| 
  -----
2 O| |X

Jugador X, ingresa la fila (0-2) y la columna (0-2) separadas por espacio:
0
0
  0 1 2
0 X|O| 
  -----
1  |X| 
  -----
2 O| |X

¡Jugador X ha ganado!
*/
//PROBLEMA 5---------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la primera matriz:");
        System.out.print("Número de filas de la primera matriz: ");
        int filasA = scanner.nextInt();
        System.out.print("Número de columnas de la primera matriz: ");
        int columnasA = scanner.nextInt();
        System.out.println("Ingrese las dimensiones de la segunda matriz:");
        System.out.print("Número de filas de la segunda matriz: ");
        int filasB = scanner.nextInt();
        System.out.print("Número de columnas de la segunda matriz: ");
        int columnasB = scanner.nextInt();
        if (columnasA != filasB) {
            System.out.println("Error: No se pueden multiplicar estas matrices.");
            return;
        }
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];
        boolean[] numerosUsados = new boolean[19];

        System.out.println("Matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                int numeroAleatorio;
                do {
                    numeroAleatorio = (int) (Math.random() * 19) - 9;
                } while (numerosUsados[numeroAleatorio + 9]);
                numerosUsados[numeroAleatorio + 9] = true;
                matrizA[i][j] = numeroAleatorio;
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                int numeroAleatorio;
                do {
                    numeroAleatorio = (int) (Math.random() * 19) - 9;
                } while (numerosUsados[numeroAleatorio + 9]);
                numerosUsados[numeroAleatorio + 9] = true;
                matrizB[i][j] = numeroAleatorio;
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/
//EJECUCION DEL PROGRAMA*********************************************
/*
Ingrese las dimensiones de la primera matriz:
Número de filas de la primera matriz: 2
Número de columnas de la primera matriz: 2
Ingrese las dimensiones de la segunda matriz:
Número de filas de la segunda matriz: 2
Número de columnas de la segunda matriz: 2
Matriz A:
-3 9 
-4 -5 
Matriz B:
-7 -2 
1 6 
Matriz Resultante:
30 60 
23 -22 
*/
//PROBLEMA 6-----------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Suma de matrices");
            System.out.println("2. Resta de matrices");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese las dimensiones de la primera matriz:");
                    System.out.print("Número de filas: ");
                    int filasA = scanner.nextInt();
                    System.out.print("Número de columnas: ");
                    int columnasA = scanner.nextInt();

                    System.out.println("Ingrese las dimensiones de la segunda matriz:");
                    System.out.print("Número de filas: ");
                    int filasB = scanner.nextInt();
                    System.out.print("Número de columnas: ");
                    int columnasB = scanner.nextInt();

                    if ((filasA != filasB) || (columnasA != columnasB)) {
                        System.out.println("Error: Las matrices deben tener las mismas dimensiones para la suma");
                        break;
                    }

                    int[][] matrizA = new int[filasA][columnasA];
                    int[][] matrizB = new int[filasB][columnasB];

                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            matrizA[i][j] = (int) (Math.random() * 19) - 9;
                        }
                    }

                    for (int i = 0; i < filasB; i++) {
                        for (int j = 0; j < columnasB; j++) {
                            matrizB[i][j] = (int) (Math.random() * 19) - 9;
                        }
                    }

                    int[][] resultadoSuma = new int[filasA][columnasA];
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            resultadoSuma[i][j] = matrizA[i][j] + matrizB[i][j];
                        }
                    }

                    System.out.println("Matriz A:");
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            System.out.print(matrizA[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Matriz B:");
                    for (int i = 0; i < filasB; i++) {
                        for (int j = 0; j < columnasB; j++) {
                            System.out.print(matrizB[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Resultado de la suma:");
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            System.out.print(resultadoSuma[i][j] + " ");
                        }
                        System.out.println();
                    }

                    break;

                case 2:
                    System.out.println("Ingrese las dimensiones de la primera matriz:");
                    System.out.print("Número de filas: ");
                    filasA = scanner.nextInt();
                    System.out.print("Número de columnas: ");
                    columnasA = scanner.nextInt();
                    System.out.println("Ingrese las dimensiones de la segunda matriz:");
                    System.out.print("Número de filas: ");
                    filasB = scanner.nextInt();
                    System.out.print("Número de columnas: ");
                    columnasB = scanner.nextInt();
                    if ((filasA != filasB) || (columnasA != columnasB)) {
                        System.out.println("Error: Las matrices deben tener las mismas dimensiones para la resta");
                        break;
                    }
                    int[][] matrizAresta = new int[filasA][columnasA];
                    int[][] matrizBresta = new int[filasB][columnasB];
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            matrizAresta[i][j] = (int) (Math.random() * 19) - 9;
                        }
                    }
                    for (int i = 0; i < filasB; i++) {
                        for (int j = 0; j < columnasB; j++) {
                            matrizBresta[i][j] = (int) (Math.random() * 19) - 9;
                        }
                    }
                    int[][] resultadoResta = new int[filasA][columnasA];
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            resultadoResta[i][j] = matrizAresta[i][j] - matrizBresta[i][j];
                        }
                    }
                    System.out.println("Matriz A:");
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            System.out.print(matrizAresta[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Matriz B:");
                    for (int i = 0; i < filasB; i++) {
                        for (int j = 0; j < columnasB; j++) {
                            System.out.print(matrizBresta[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Resultado de la resta:");
                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasA; j++) {
                            System.out.print(resultadoResta[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }
}

*/
//EJECUCION DEL ***********************************************************
/*
Menú:
1. Suma de matrices
2. Resta de matrices
3. Salir
Seleccione una opción: 2
Ingrese las dimensiones de la primera matriz:
Número de filas: 2
Número de columnas: 2
Ingrese las dimensiones de la segunda matriz:
Número de filas: 2
Número de columnas: 2
Matriz A:
1 1 
7 -6 
Matriz B:
-3 -2 
0 -6 
Resultado de la resta:
4 3 
7 0 
Menú:
1. Suma de matrices
2. Resta de matrices
3. Salir
Seleccione una opción: 1
Ingrese las dimensiones de la primera matriz:
Número de filas: 2
Número de columnas: 2
Ingrese las dimensiones de la segunda matriz:
Número de filas: 2
Número de columnas: 2
Matriz A:
-1 4 
9 5 
Matriz B:
-4 0 
-3 -7 
Resultado de la suma:
-5 4 
6 -2 
Menú:
1. Suma de matrices
2. Resta de matrices
3. Salir
Seleccione una opción: 3
Saliendo del programa...
*/
//PROBLEMA 7--------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite para la matriz cuadrada: ");
        int limite = scanner.nextInt();
        int[][] matriz = new int[limite][limite];
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                matriz[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        System.out.println("Matriz completa:");
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nElementos de la diagonal secundaria:");
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                if (i + j == limite - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementos sobre la diagonal secundaria:");
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                if (i + j < limite - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementos bajo la diagonal secundaria:");
        for (int i = 0; i < limite; i++) {
            for (int j = 0; j < limite; j++) {
                if (i + j > limite - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
*/
//EJECUCION DEL PROGRAMA***************************************************
/*
Ingrese el límite para la matriz cuadrada: 4
Matriz completa:
5	6	-6	-8	
-7	6	-9	-1	
-7	-5	0	-6	
-3	-8	-4	2	

Elementos de la diagonal secundaria:
-8 -9 -5 -3 
Elementos sobre la diagonal secundaria:
5 6 -6 -7 6 -7 
Elementos bajo la diagonal secundaria:
-1 0 -6 -8 -4 2
*/
//PROBLEMA 8 -------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim;
        System.out.println("Ingrese el límite: ");
        lim = teclado.nextInt();
        int diagonal[][] = new int[lim][lim];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                diagonal[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        System.out.println("Matriz completa:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                System.out.print(diagonal[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j)
                    System.out.print(diagonal[i][j] + ", ");
            }
        }
        System.out.println("\nElementos por debajo de la diagonal:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i > j)
                    System.out.print(diagonal[i][j] + ", ");
            }
        }

        System.out.println("\nElementos por encima de la diagonal:");
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i < j)
                    System.out.print(diagonal[i][j] + ", ");
            }
        }
    }
}

*/
//EJECUCION DEL PROGRAMA****************************************************
/*
Ingrese el límite: 
4
Matriz completa:
-9	-5	5	-4	
-8	9	-3	-9	
-6	-4	1	-6	
2	3	7	7	
Elementos de la diagonal principal:
-9, 9, 1, 7, 
Elementos por debajo de la diagonal:
-8, -6, -4, 2, 3, 7, 
Elementos por encima de la diagonal:
*/
//PROBLEMA 9------------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class TALLER10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limPiramide;
        System.out.println("Ingresar el limite de la piramide: ");
        limPiramide = teclado.nextInt();
        for (int i = 0; i < limPiramide; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
        System.out.println("");
        }
    }
}
*/
//EJECUCION DEL PROGRAMA************************
/*
Ingresar el limite de la piramide: 
3
* 
* * 
* * * 
*/
//PROBLEMA 10------------------------------------------------------------------------------------------------------------------------------------
/*
import java.util.Scanner;

public class PRUEBA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        do {
            System.out.print("Ingrese el limite (un número impar mayor o igual a 3): ");
            altura = scanner.nextInt();
        } while (altura % 2 == 0 || altura < 3);

        for (int i = 1; i <= altura / 2 + 1; i++) {
            for (int j = 1; j <= altura / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = altura / 2; i >= 1; i--) {
            for (int j = 1; j <= altura / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
//EJECUCION DEL PROGRAMA*********************************
/*
Ingrese el limite (un número impar mayor o igual a 3): 10
Ingrese el limite (un número impar mayor o igual a 3): 11
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
*/