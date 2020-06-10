import java.util.Scanner;

public class Triqui {
  //Marcas de los jugadores en el Tablero
  static final char MARCA_O = 'O';
  static final char MARCA_X = 'X';
  static final char MARCA_VACIO = ' ';

  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    char T[][] = new char [3][3];
    boolean hayGanador = false;
    int jugadas = 0;
    int i,j;
    limpiarTablero(T);
    System.out.println("---TRIQUI GAME---");
    System.out.println(" ---BY: GHXST---");
    while (hayGanador == false){
      //Jugador O.
      System.out.println("Jugada de O");
      System.out.print("Fila = ");
      i = teclado.nextInt();
      System.out.print("Columna = ");
      j = teclado.nextInt();
      T[i-1][j-1] = MARCA_O;
      mostrarTablero(T);
      if (esGanador(T,MARCA_O)){
        System.out.println("¡¡¡GANA EL JUGADOR O!!!");
        hayGanador = true;
        break;
      }
      jugadas ++;
      if (jugadas == 9){
        break;
      }
      //Jugador X.
      System.out.println("Jugada de X");
      System.out.print("Fila = ");
      i = teclado.nextInt();
      System.out.print("Columna = ");
      j = teclado.nextInt();
      T[i-1][j-1] = MARCA_X;
      mostrarTablero(T);
      if (esGanador(T,MARCA_X)){
        System.out.println("¡¡¡GANA EL JUGADOR X!!!");
        hayGanador = true;
        break;
      }
      jugadas ++;
    }//Fin While
    if (hayGanador == false){
      System.out.print("¡¡¡HUBO UN EMPATE!!!");
    }
  }//Fin main
  //Función para determinar si el jugador con marca MJ ha ganado o no.
  private static boolean esGanador (char[][] t, char MJ){
    boolean sw = false;
    //verificar las tres filas.
    if(t[0][0] == MJ && t[0][1] == MJ && t[0][2] == MJ){
      sw = true;
    }
    else if (t[1][0] == MJ && t[1][1] == MJ && t[1][2] == MJ){
      sw = true;
    }
    else if (t[2][0] == MJ && t[2][1] == MJ && t[2][2] == MJ){
      sw = true;
    }
    //verificar las tres columnas.
    else if (t[0][0] == MJ && t[1][0] == MJ && t[2][0] == MJ){
      sw = true;
    }
    else if (t[0][1] == MJ && t[1][1] == MJ && t[2][1] == MJ){
      sw = true;
    }
    else if (t[0][2] == MJ && t[1][2] == MJ && t[2][2] == MJ){
      sw = true;
    }
    //verificar diagonales.
    else if (t[0][0] == MJ && t[1][1] == MJ && t[2][2] == MJ){
      sw = true;
    }
    else if (t[2][0] == MJ && t[1][1] == MJ && t[0][2] == MJ){
      sw = true;
    }
    return sw;
  }

  private static void mostrarTablero(char t[][]) {
    int i,j;
    for (i=0; i<3; i++){
      for (j=0; j<3; j++){
        System.out.print("|"+t[i][j]);
      }
      System.out.println("|");
    }
  }

  private static void limpiarTablero (char[] [] t){
    int i,j;
    for (i=0; i<3; i++){
      for (j=0; j<3; j++){
        t[i][j] = MARCA_VACIO;
      }
    }
  }//Fin metodo limpiarTablero

}//fin de la clase