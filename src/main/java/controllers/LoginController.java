package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class LoginController {

  public ModelAndView getLogin(Request request, Response response) {

    return new ModelAndView(null,"login.hbs");
  }
}
