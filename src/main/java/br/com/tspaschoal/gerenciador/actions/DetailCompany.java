package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.CompanyDAO;

public class DetailCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var id = Integer.parseInt(request.getParameter("id"));
        final var empresa = new CompanyDAO().findById(id);
        request.setAttribute("empresa", empresa);
        return "forward:detalheEmpresa.jsp";
    }

}
