package dominio.usuario;

import dominio.personaje.Personaje;

import java.util.List;

public class Usuario {

  private final String user;
  private final String password;
  private List<Personaje> personajes;

  public Usuario(String user, String password) {
    this.user = user;
    this.password = password;
  }


}
