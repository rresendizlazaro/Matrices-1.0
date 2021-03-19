package ing.rr.matrices;

import java.util.Scanner;

public class Matriz2x2 {
    //Declarando un atributo matriz de dos dimensiones
    private double[][] matriz2x2;
    
    //Constructor vacío que crea una matriz 2x2
    public Matriz2x2(){
        this.matriz2x2 = new double[2][2];
    }
    
    //Métodos
    //Método que recibe todos los valores para llenar una matriz (setMatriz)
    public void llenarMatriz(){
        double val;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < this.matriz2x2.length; i++){
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                System.out.println("Introduce el valor del elemento [" + i + "], [" + j + "]:");
                val = Double.parseDouble(input.nextLine());
                matriz2x2[i][j] = val;
            }
        }
    }
    
    //Método que muestra la matriz
    public void mostrarMatriz(){
        for (int i = 0; i < this.matriz2x2.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                System.out.print(this.matriz2x2[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    
    //Método get que retorna el valor de un elemento de la matriz, dado la fla y la columna
    public double getElemento(int fila, int columna){
        if (fila >= this.matriz2x2.length && columna >= this.matriz2x2[0].length || fila < 0 || columna < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return this.matriz2x2[fila][columna];
        }
    }
    
    //Reasigna o asigna el valor a un elemento de la matriz
    public void setElemento(int fila, int columna, double valor){
        if (fila >= this.matriz2x2.length && columna >= this.matriz2x2[0].length || fila < 0 || columna < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            this.matriz2x2[fila][columna] = valor;
        }
    }
    
    //Método que muestra el resultado de multiplicar una matriz por un escalar
    public void multiplicarEscalar(double escalar){
        for (int i = 0; i < this.matriz2x2.length; i++) {
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                matriz2x2[i][j] *= escalar;
            }
        }
    }
    
    //Método que hace la transpuesta de una matriz
    public Matriz2x2 transpuesta(){
        Matriz2x2 mTemporal = new Matriz2x2();
        for (int i = 0; i < this.matriz2x2.length; i++) {
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                mTemporal.setElemento(i, j, this.matriz2x2[j][i]);
            }
        }
        return mTemporal;
    }
    
    //Método que realiza la suma de dos matrices
    public void SumaMatrices(Matriz2x2 a, Matriz2x2 b){
        Matriz2x2 suma = new Matriz2x2();
        for (int i = 0; i < this.matriz2x2.length; i++) {
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                suma.setElemento(i, j, a.getElemento(i, j) + b.getElemento(i, j));
            }
        }
        suma.mostrarMatriz();
    }
    
    //Método que realiza la resta de dos matrices
    public void RestaMatrices(Matriz2x2 a, Matriz2x2 b){
        Matriz2x2 suma = new Matriz2x2();
        for (int i = 0; i < this.matriz2x2.length; i++) {
            for (int j = 0; j < this.matriz2x2[0].length; j++) {
                suma.setElemento(i, j, a.getElemento(i, j) - b.getElemento(i, j));
            }
        }
        suma.mostrarMatriz();
    }
}
