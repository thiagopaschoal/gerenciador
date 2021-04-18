package br.com.tspaschoal.gerenciador.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import br.com.tspaschoal.gerenciador.actions.Action;

@WebServlet("/company")
public class CompanyController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var action = req.getParameter("action");
        action = StringUtils.capitalize(action);
        final var fullQualifiedName = "br.com.tspaschoal.gerenciador.actions." + action + "Company";

        try {
            final var klass = Class.forName(fullQualifiedName);
            final var instance = (Action) klass.getDeclaredConstructor().newInstance();
            final var page = instance.execute(req, resp);

            if (page != null && !page.isEmpty()) {
                final var pageSplit = page.split(":");
                final var redirectType = pageSplit[0];
                final var actionName = pageSplit[1];
                if (redirectType.equals("forward")) {
                    final var dispatcher = req.getRequestDispatcher("WEB-INF/content/" + actionName);
                    dispatcher.forward(req, resp);
                } else {
                    resp.sendRedirect(actionName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
