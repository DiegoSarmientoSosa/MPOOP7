/**
*@author Diego Sarmiento
*/
public class Animal{
  private String nombre;
  private String lugar_origen;
  private String color;

  public Animal(){}
/**
*@param nombre  Nombre del animal
*@param lugar_origen  Lugar de origen del animal
*@param color Color del animal
*/
  public Animal(String nombre, String lugar_origen, String color){
    this.nombre=nombre;
    this.lugar_origen=lugar_origen;
    this.color=color;
  }

  public void HacerSonido(String sonido){
    System.out.println("Estoy "+sonido);
  }
  /**
*@param sonido  Sonido del animal
*@return  El sonido del animal
*/
  public void Comer(){
    System.out.println("Estoy comiendo");
  }
/**
*@return  Indica que el animal esta comiendo
*/
  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public String getNombre() {
    return nombre;
    }
  public void setLugarOrigen(String lugar_origen){
    this.lugar_origen =lugar_origen;
  }

  public String getLugarOrigen() {
    return lugar_origen;
    }

  public void setColor(String color){
    this.color=color;
  }
  
  public String getColor() {
    return color;
    }
  
  
  @Override
  
  public String toString(){
    return "Animal [ nombre: "+nombre+" lugar_origen: "+lugar_origen+" color: "+color+"}";
  }
}