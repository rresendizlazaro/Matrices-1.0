package ing.rr.matrices;

import java.util.Scanner;

public class Matriz3x3 {
    //Declarando un atributo matriz de dos dimensiones
    private double[][] matriz3x3;
    
    //Constructor vacío que crea una matriz 2x2
    public Matriz3x3(){
        this.matriz3x3 = new double[3][3];
    }
    
    //Métodos
    //Método que recibe todos los valores para llenar una matriz (setMatriz)
    public void llenarMatriz(){
        double val;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < this.matriz3x3.length; i++){
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                System.out.println("Introduce el valor del elemento [" + i + "], [" + j + "]:");
                val = Double.parseDouble(input.nextLine());
                matriz3x3[i][j] = val;
            }
        }
    }
    
    //Método que muestra la matriz
    public void mostrarMatriz(){
        for (int i = 0; i < this.matriz3x3.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                System.out.print(this.matriz3x3[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    
    //Método get que retorna el valor de un elemento de la matriz, dado la fla y la columna
    public double getElemento(int fila, int columna){
        return this.matriz3x3[fila][columna];
    }
    
    //Reasigna o asigna el valor a un elemento de la matriz
    public void setElemento(int fila, int columna, double valor){
        this.matriz3x3[fila][columna] = valor;
    }
    
    //Método que muestra el resultado de multiplicar una matriz por un escalar
    public void multiplicarEscalar(double escalar){
        for (int i = 0; i < this.matriz3x3.length; i++) {
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                matriz3x3[i][j] *= escalar;
            }
        }
    }
    
    //Método que hace la transpuesta de una matriz
    public Matriz3x3 transpuesta(){
        Matriz3x3 mTemporal = new Matriz3x3();
        for (int i = 0; i < this.matriz3x3.length; i++) {
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                mTemporal.setElemento(i, j, this.matriz3x3[j][i]);
            }
        }
        return mTemporal;
    }
    
    //Método que realiza la suma de dos matrices
    public void SumaMatrices(Matriz3x3 a, Matriz3x3 b){
        Matriz3x3 suma = new Matriz3x3();
        for (int i = 0; i < this.matriz3x3.length; i++) {
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                suma.setElemento(i, j, a.getElemento(i, j) + b.getElemento(i, j));
            }
        }
        suma.mostrarMatriz();
    }
    
    //Método que realiza la resta de dos matrices
    public void RestaMatrices(Matriz3x3 a, Matriz3x3 b){
        Matriz3x3 suma = new Matriz3x3();
        for (int i = 0; i < this.matriz3x3.length; i++) {
            for (int j = 0; j < this.matriz3x3[0].length; j++) {
                suma.setElemento(i, j, a.getElemento(i, j) - b.getElemento(i, j));
            }
        }
        suma.mostrarMatriz();
    }
}
