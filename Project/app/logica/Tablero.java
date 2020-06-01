package app.logica

public class Tablero{
  private Ficha tableroJuego[][] = new Ficha [3][3];

  public void llenar (){
    for (int j=0; j<3; j++){
      for(int i=0; i<3; i++){
        tableroJuego[j][i] = new Ficha ();
      }
    }
  }
}