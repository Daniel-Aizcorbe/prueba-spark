package server;

import controllers.HomeController;
import controllers.LoginController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.staticFiles;
import static spark.debug.DebugScreen.enableDebugScreen;

public class Router {

  public static void configure() {

    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
    HomeController home = new HomeController();
    LoginController login = new LoginController();
    staticFiles.location("static");

    enableDebugScreen();
    Spark.get("/",home::getHome, engine);
    Spark.get("/home",home::getHomeLogged,engine);
    Spark.get("/login",login::getLogin, engine);
    Spark.post("/login",login::postLogin, engine);
  }
}
