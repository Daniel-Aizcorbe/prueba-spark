package server;

import spark.Spark;

public class Router {

  public static void configure() {

    Spark.get("/",(request, response) -> "Hola estoy andando");
  }
}
