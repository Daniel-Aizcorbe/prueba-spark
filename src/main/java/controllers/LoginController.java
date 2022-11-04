package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class LoginController {

  public ModelAndView getLogin(Request request, Response response) {

    return new ModelAndView(null,"login.hbs");
  }

  public ModelAndView postLogin(Request request, Response response) {
    if (this.esValidaLaContrasenia(request.attribute("user"),request.attribute("password"))) {
      return new ModelAndView(null,"home-logged.hbs");
    }
    return new ModelAndView(null,"NO ES VALIDA");
  }

  public boolean esValidaLaContrasenia(String user, String password) {
    return true;
  }

}
