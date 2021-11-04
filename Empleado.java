/**
*@author Diego Sarmiento
*/
public class Empleado{
  private String nombre;
  private int num_empleado;
  private int sueldo;
  
  public Empleado(){}
  public Empleado(String nombre, int num_empleado, int sueldo){
    this.nombre=nombre;
    this.num_empleado=num_empleado;
    this.sueldo=sueldo; 
  }
/**
*@param nombre  Indica nombre del empleado
*@param num_empleado  Numero de empleado a un empleado
*@param sueldo  Sueldo del empleado
*/
  public void aumentarSueldo(int porcentaje){
    sueldo+=(sueldo*porcentaje/100);
  }
/**
*@param porcentaje  Indica el porcentaje de aumento al sueldo
*/
 public void setNombre (String nombre){
    this.nombre=nombre;
  }
  public String getNombre() {
    return nombre;
    }
  
  public void setNumEmp(int num_empleado){
    this.num_empleado=num_empleado;
  }

  public int getNumEmp(){
    return num_empleado;
  }

  public void setSueldo(int sueldo){
    if (sueldo>=0)
    this.sueldo=sueldo;
    else
    this.sueldo=0;
  }

  public int getSueldo(){
    return sueldo;
  }

@Override
  
  public String toString(){
    return "Empleado [ nombre: "+nombre+" num_empleado: "+num_empleado+" sueldo: "+sueldo+"}";
  }
}