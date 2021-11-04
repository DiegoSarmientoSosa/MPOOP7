/**
*@author Diego Sarmiento
*/
public class Gerente extends Empleado{
  private int presupuesto;

  public Gerente(){}
  
  public Gerente(String nombre,int num_empleado, int sueldo, int presupuesto){
    super(nombre, num_empleado, sueldo);
    this.presupuesto=presupuesto;
  }
/**
*@param nombre  Indica nombre del Gerente
*@param num_empleado  Numero de empleado a un Gerente
*@param sueldo  Sueldo del Gerente
*@param presupuesto  Indica el presupuesto que se le asigna aun Gerente
*/

  public int getPresupuesto(){
     return presupuesto;
  }

  public void setPresupuesto(int presupuesto){
    if(presupuesto>=0)
      this.presupuesto=presupuesto;
  }

 @Override

  public String getNombre(){
  return super.getNombre()+" Mucho gusto";
  }

  public String toString(){
    return super.toString() +"Gerente{ presupuesto= "+presupuesto+"}";
  }


}