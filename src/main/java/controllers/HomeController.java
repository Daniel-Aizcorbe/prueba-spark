package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HomeController {

  public ModelAndView getHome(Request request, Response response) {
    return new ModelAndView("233","home.hbs");
  }

  public ModelAndView getHomeLogged(Request request, Response response) {
    return new ModelAndView("233","home-logged.hbs");
  }
}
