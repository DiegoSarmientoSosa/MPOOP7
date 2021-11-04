/**
*@author Diego Sarmiento
*/
public class AnimalTerrestre extends Animal{
  private int numeroPatas;

public AnimalTerrestre (){}
public AnimalTerrestre (String nombre, String lugar_origen, String color,int numeroPatas){
    super(nombre,lugar_origen,color);
    this.numeroPatas=numeroPatas;
  } 
/**
*@param nombre  Nombre del animal
*@param lugar_origen  Lugar de origen del animal
*@param color Color del animal
*@param numeroPatas Numero de patas del animal terreste
*/

  public void correr(){
    System.out.println("Estoy corriendo");
  }
/**
*@return  Indica que el animal terrestre esta corriendo
*/
  public void comer(){
   System.out.println("Estoy comiendo"); 
  }  
/**
*@return  Indica que el animal terrestre esta comiendo
*/
  public void setNumPatas(int numeroPatas){
    this.numeroPatas=numeroPatas;
  }
  public int getNumPatas(){
    return numeroPatas;
  }
  

  @Override
  public String toString(){
    return super.toString() + "AnimalTerrestre{ numeroPatas: "+numeroPatas+"}" ;
  }
  
}