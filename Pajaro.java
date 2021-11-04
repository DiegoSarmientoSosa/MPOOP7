/**
*@author Diego Sarmiento
*/
public class Pajaro extends AnimalAereo{
  private String tipoPico;

  public Pajaro(){}
  public Pajaro(String nombre, String lugar_origen, String color, int numeroAlas,String tipoPico){
  super(nombre, lugar_origen,color,numeroAlas);
  this.tipoPico=tipoPico;    
  }

  public void recolectarRamas(){
    System.out.println("Estoy en un arbol");
  }
/**
*@return  Indica que el pajaro esta en un arbol
*/

  public void setTipoPico(String tipoPico){
    this.tipoPico=tipoPico;
  }
  public String getTipoPico(){
    return tipoPico;
  }
  

  @Override
  public String toString(){
    return super.toString() + "Pajaro{ tipoPico: "+tipoPico+"}" ;
  }
}