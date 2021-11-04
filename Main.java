/**
*@author Diego Sarmiento
*/
class Main {
  public static void main(String[] args) {
   
    Gerente ger = new Gerente();
    System.out.println(ger);
    ger.setNombre("Romina Perez");
    ger.setNumEmp(51516);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);
    Gerente ger2 = new Gerente("Samuel Torres", 156418651, 40_000, 12_000);
    System.out.println(ger2);
  
  Ballena ballena= new Ballena("Popy","El mar", "Azul", 2, 150);
  System.out.println(ballena);
  }
}