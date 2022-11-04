package server;

import controllers.HomeController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.debug.DebugScreen.enableDebugScreen;

public class Router {

  public static void configure() {

    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
    HomeController home = new HomeController();
    Spark.staticFiles.location("static");

    enableDebugScreen();
    Spark.get("/",home::getHome, engine);
  }
}
