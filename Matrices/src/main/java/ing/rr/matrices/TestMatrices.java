package ing.rr.matrices;

import java.util.Scanner;

public class TestMatrices {
    public static void main(String[] args) {
        String continuar = "n";
        int opcion = 0;
        int fila;
        int columna;
        double valor;
        Scanner sc = new Scanner(System.in);
        Matriz2x2 mA2x2 = new Matriz2x2();
        Matriz2x2 mB2x2 = new Matriz2x2();
        Matriz3x3 mA3x3 = new Matriz3x3();
        Matriz3x3 mB3x3 = new Matriz3x3();
        do{
            switch(opcion){
                default:
                    System.out.println("Matrices disponibles:");
                    System.out.println("Matriz A 2x2");
                    mA2x2.mostrarMatriz();
                    System.out.println("Matriz B 2x2");
                    mB2x2.mostrarMatriz();
                    System.out.println("Matriz A 3x3");
                    mA3x3.mostrarMatriz();
                    System.out.println("Matriz B 3x3");
                    mB3x3.mostrarMatriz();
                    System.out.println();
                    
                    System.out.println("1. Modificar matriz A 2x2\n"
                            + "2. Modificar matriz B 2x2\n"
                            + "3. Modificar matriz A 3x3\n"
                            + "4. Modificar matriz B 3x3\n"
                            + "5. Modificar un valor de la matriz A 2x2\n"
                            + "6. Modificar un valor de la matriz B 2x2\n"
                            + "7. Modificar un valor de la matriz A 3x3\n"
                            + "8. Modificar un valor de la matriz B 3x3\n"
                            + "9. Obtener un valor de la matriz A 2x2\n"
                            + "10. Obtener un valor de la matriz B 2x2\n"
                            + "11. Obtener un valor de la matriz A 3x3\n"
                            + "12. Obtener un valor de la matriz B 3x3\n"
                            + "13. Multiplicar la matriz A 2x2 por un escalar\n"
                            + "14. Multiplicar la matriz B 2x2 por un escalar\n"
                            + "15. Multiplicar la matriz A 3x3 por un escalar\n"
                            + "16. Multiplicar la matriz B 3x3 por un escalar\n"
                            + "17. Transponer la matriz A 2x2\n"
                            + "18. Transponer la matriz B 2x2\n"
                            + "19. Transponer la matriz A 3x3\n"
                            + "20. Transponer la matriz B 3x3\n"
                            + "21. Suma de matrices 2x2\n"
                            + "22. Suma de matrices 3x3\n"
                            + "23. Resta MA-MB 2x2\n"
                            + "24. Resta MB-MA 2x2\n"
                            + "25. Resta MA-MB 3x3\n"
                            + "26. Resta MB-MA 3x3\n"
                            + "27. Terminar\n"
                            + "Ingresar opción: ");
                    opcion = Integer.parseInt(sc.nextLine());
                    break;
                case 1:
                    System.out.println("Modificando matriz A 2x2");
                    mA2x2.llenarMatriz();
                    opcion = 27;                        
                    break;
                case 2:
                    System.out.println("Modificando matriz B 2x2");
                    mB2x2.llenarMatriz();
                    opcion = 27;
                    break;
                case 3:
                    System.out.println("Modificando matriz A 3x3");
                    mA3x3.llenarMatriz();
                    opcion = 27;
                    break;
                case 4:
                    System.out.println("Modificando matriz B 3x3");
                    mB3x3.llenarMatriz();
                    opcion = 27;
                    break;
                case 5:                    
                    System.out.println("Modificando un elemento en la matriz A 2x2");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    System.out.println("Nuevo valor:");
                    valor = Double.parseDouble(sc.nextLine());
                    try{
                        mA2x2.setElemento(fila, columna, valor);
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }                    
                    opcion = 27;
                    break;
                case 6:
                    System.out.println("Modificando un elemento en la matriz B 2x2");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    System.out.println("Nuevo valor:");
                    valor = Double.parseDouble(sc.nextLine());
                    try{
                        mB2x2.setElemento(fila, columna, valor);
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }  
                    opcion = 27;
                    break;
                case 7:
                    System.out.println("Modificando un elemento en la matriz A 3x3");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    System.out.println("Nuevo valor:");
                    valor = Double.parseDouble(sc.nextLine());
                    try{
                        mA3x3.setElemento(fila, columna, valor);
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }  
                    opcion = 27;
                    break;
                case 8:
                    System.out.println("Modificando un elemento en la matriz B 3x3");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    System.out.println("Nuevo valor:");
                    valor = Double.parseDouble(sc.nextLine());
                    try{
                        mB3x3.setElemento(fila, columna, valor);
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }  
                    opcion = 27;
                    break;
                case 9:
                    System.out.println("Obteniendo un valor de la matriz A2x2");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    try{
                        System.out.println(mA2x2.getElemento(fila, columna));
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    } 
                    opcion = 27;
                    break;
                case 10:
                    System.out.println("Obteniendo un valor de la matriz B2x2");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    try{
                        System.out.println(mB2x2.getElemento(fila, columna));
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    } 
                    opcion = 27;
                    break;
                case 11:
                    System.out.println("Obteniendo un valor de la matriz A3x3");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    try{
                        System.out.println(mA3x3.getElemento(fila, columna));
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }
                    opcion = 27;
                    break;
                case 12:
                    System.out.println("Obteniendo un valor de la matriz B3x3");
                    System.out.println("Introduce la fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce la columna:");
                    columna = Integer.parseInt(sc.nextLine());
                    try{
                        System.out.println(mB3x3.getElemento(fila, columna));
                    }catch(Exception e){
                        System.out.println("Elemento inválido");
                    }
                    opcion = 27;
                    break;
                case 13:
                    System.out.println("Introduce un escalar para multiplicar a la matriz A2x2");
                    valor = Double.parseDouble(sc.nextLine());
                    mA2x2.multiplicarEscalar(valor);
                    opcion = 27;
                    break;
                case 14:
                    System.out.println("Introduce un escalar para multiplicar a la matriz B2x2");
                    valor = Double.parseDouble(sc.nextLine());
                    mB2x2.multiplicarEscalar(valor);
                    opcion = 27;
                    break;
                case 15:
                    System.out.println("Introduce un escalar para multiplicar a la matriz A3x3");
                    valor = Double.parseDouble(sc.nextLine());
                    mA3x3.multiplicarEscalar(valor);
                    opcion = 27;
                    break;
                case 16:
                    System.out.println("Introduce un escalar para multiplicar a la matriz B3x3");
                    valor = Double.parseDouble(sc.nextLine());
                    mB3x3.multiplicarEscalar(valor);
                    opcion = 27;
                    break;
                case 17:
                    System.out.println("Transpuesta de la matriz A2x2");
                    mA2x2 = mA2x2.transpuesta();
                    opcion = 27;
                    break;
                case 18:
                    System.out.println("Transpuesta de la matriz B2x2");
                    mB2x2 = mB2x2.transpuesta();
                    opcion = 27;
                    break;
                case 19:
                    System.out.println("Transpuesta de la matriz A3x3");
                    mA3x3 = mA3x3.transpuesta();
                    opcion = 27;
                    break;
                case 20:
                    System.out.println("Transpuesta de la matriz B3x3");
                    mB3x3 = mB3x3.transpuesta();
                    opcion = 27;
                    break;
                case 21:
                    System.out.println("La suma de matrices 2x2 es:");
                    mA2x2.SumaMatrices(mA2x2, mB2x2);
                    opcion = 27;
                    break;
                case 22:
                    System.out.println("La suma de matrices 3x3 es:");
                    mA3x3.SumaMatrices(mA3x3, mB3x3);
                    opcion = 27;
                    break;
                case 23:
                    System.out.println("La resta de MA2x2 - MB2x2 = ");
                    mA2x2.RestaMatrices(mA2x2, mB2x2);
                    opcion = 27;
                    break;
                case 24:
                    System.out.println("La resta de MB2x2 - MA2x2 = ");
                    mA2x2.RestaMatrices(mB2x2, mA2x2);
                    opcion = 27;
                    break;
                case 25:
                    System.out.println("La resta de MA3x3 - MB3x3 = ");
                    mA3x3.RestaMatrices(mA3x3, mB3x3);
                    opcion = 27;
                    break;
                case 26:
                    System.out.println("La resta de MB3x3 - MA3x3 = ");
                    mA3x3.RestaMatrices(mB3x3, mA3x3);
                    opcion = 27;
                    break;
                case 27:
                    System.out.println("¿Quiere salir? (s/n)");
                    continuar = sc.nextLine();
                    if(!"s".equals(continuar))
                        opcion = 0;
                    break;
            }
        }while(!"s".equals(continuar.toLowerCase()));
    }
}
