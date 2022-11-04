package dominio.personaje;

import dominio.personaje.items.*;

import java.util.List;

public class Inventario {

  private final List<Arma> armas;
  private final List<Armadura> armaduras;
  private final List<Accesorio> accesorios;
  private final List<Consumible> consumibles;
  private final List<Varios> objetosVarios;

  public Inventario(List<Arma> armas,
                    List<Armadura> armaduras,
                    List<Accesorio> accesorios,
                    List<Consumible> consumibles,
                    List<Varios> objetosVarios)
  {
    this.armas = armas;
    this.armaduras = armaduras;
    this.accesorios = accesorios;
    this.consumibles = consumibles;
    this.objetosVarios = objetosVarios;
  }
}