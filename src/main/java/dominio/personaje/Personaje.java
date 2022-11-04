package dominio.personaje;

public class Personaje {

  private final String nombre;
  private final Inventario inventario;
  private int nivel;
  private double experiencia;
  //TODO PENSAR COMO MODELAR LOS OBJETOS EQUIPADOS


  public Personaje(String nombre,
                   Inventario inventario,
                   int nivel,
                   double experiencia)
  {
    this.nombre = nombre;
    this.inventario = inventario;
    this.nivel = nivel;
    this.experiencia = experiencia;
  }


}
