/**
*@author Diego Sarmiento
*/
public class Perro extends AnimalTerrestre{
  private String colorCollar;

  public Perro(){}
  public Perro(String nombre, String lugar_origen, String color, int numeroPatas,String colorCollar){
  super(nombre, lugar_origen, color, numeroPatas);
  this.colorCollar=colorCollar;    
  }

  public void hacerTruco(){
    System.out.println("Estoy haciendo el muertito");
  }
/**
*@return  Indica que el perro esta haciendoce el muertito
*/

  public void setColorCollar(String colorCollar){
    this.colorCollar=colorCollar;
  }
  public String getColorCollar(){
    return colorCollar;
  }
  

  @Override
  public String toString(){
    return super.toString() + "Perro{ colorCollar: "+colorCollar+"}" ;
  }
}