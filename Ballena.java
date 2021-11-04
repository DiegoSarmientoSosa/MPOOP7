/**
*@author Diego Sarmiento
*/
public class Ballena extends AnimalAcuatico{
  private int largo;

  public Ballena(){}
  public Ballena(String nombre, String lugar_origen, String color, int numeroAletas,int largo){
  super(nombre, lugar_origen,color,numeroAletas);
  this.largo=largo;    
  }

  public void pelearconPinocho(){
    System.out.println("Estoy Peleando con Pinocho");
  }
/**
*@return  Indica que la ballena esta peleando con Pinocho
*/

  public void setLargo(int largo){
    this.largo=largo;
  }
  public int getLargo(){
    return largo;
  }
  

  @Override
  public String toString(){
    return super.toString() + "Ballena{ largo: "+largo+"}" ;
  }
}