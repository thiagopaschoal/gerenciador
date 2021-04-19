package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "forward:login.jsp";
    }

}
