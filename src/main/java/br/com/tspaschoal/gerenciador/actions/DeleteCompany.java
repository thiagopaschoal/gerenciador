package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.CompanyDAO;

public class DeleteCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        new CompanyDAO().remove(Integer.parseInt(request.getParameter("id")));
        return "redirect:company?action=list";
    }

}
