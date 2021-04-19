package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.models.Company;
import br.com.tspaschoal.gerenciador.repositories.CompanyDAO;

public class UpdateCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var empresa = new Company(request.getParameter("nome"), request.getParameter("cmbTamanhoEmpresa"));
        new CompanyDAO().update(Integer.parseInt(request.getParameter("id")), empresa);
        return "redirect:empresas";
    }
}
