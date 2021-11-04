/**
*@author Diego Sarmiento
*/
public class AnimalAereo extends Animal{
  private int numeroAlas;

  public AnimalAereo(){}
  public AnimalAereo(String nombre, String lugar_origen, String color, int numeroAlas){
    super(nombre,lugar_origen,color);
    this.numeroAlas=numeroAlas;
  }  
/**
*@param nombre  Nombre del animal
*@param lugar_origen  Lugar de origen del animal
*@param color Color del animal
*@param numeroAlas Numero de alas del animal aereo
*/

  public void volar(){
    System.out.println("Estoy volando");
  }
/**
*@return  Indica que el animal aereo esta volando
*/
  public void comer(){
   System.out.println("Estoy comiendo"); 
  }  
/**
*@return  Indica que el animal aereo esta comiendo
*/
  public void setNumAlas(int numeroAlas){
    this.numeroAlas=numeroAlas;
  }
  public int getNumAlas(){
    return numeroAlas;
  }
  

  @Override
  public String toString(){
    return super.toString() + "AnimalAereo{ numeroAlas: "+numeroAlas+"}" ;
  }
  
}