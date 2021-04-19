package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.UserDAO;

public class LoginCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var userFromRequest = request.getParameter("login");
        final var passwordFromRequest = request.getParameter("password");
        final var userAutheticated = new UserDAO().hasUserWithCredentilas(userFromRequest, passwordFromRequest);

        if (userAutheticated != null) {
            final var session = request.getSession();
            session.setAttribute("userLogged", userAutheticated.getLogin());
            return "redirect:company?action=list";
        }
        return "redirect:company?action=loginForm";
    }

}
