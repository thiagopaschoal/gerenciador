package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.models.Company;
import br.com.tspaschoal.gerenciador.repositories.CompanyDAO;

public class NewCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var empresa = new Company(request.getParameter("nome"), request.getParameter("cmbTamanhoEmpresa"));
        new CompanyDAO().save(empresa);
        return "redirect:empresas";
    }
}