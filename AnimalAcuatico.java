/**
*@author Diego Sarmiento
*/
public class AnimalAcuatico extends Animal{
  private int numeroAletas;

  public AnimalAcuatico(){}
  public AnimalAcuatico(String nombre, String lugar_origen, String color, int numeroAletas){
    super(nombre,lugar_origen,color);
    this.numeroAletas=numeroAletas;
  }  
/**
*@param nombre  Nombre del animal
*@param lugar_origen  Lugar de origen del animal
*@param color Color del animal
*@param numeroAletas Numero de aletas del animal acuatico
*/

  public void nadar(){
    System.out.println("Estoy nadando");
  }
/**
*@return  Indica que el animal acuatico esta nadando
*/
  public void comer(){
   System.out.println("Estoy comiendo"); 
  }  
 /**
*@return  Indica que el animal acuatico esta comiendo
*/
  public void setNumAletas(int numeroAletas){
    this.numeroAletas=numeroAletas;
  }
  public int getNumAletas(){
    return numeroAletas;
  }
  

  @Override
  public String toString(){
    return super.toString() + "AnimalAcuatico{ numeroAletas: "+numeroAletas+"}" ;
  }
  
}