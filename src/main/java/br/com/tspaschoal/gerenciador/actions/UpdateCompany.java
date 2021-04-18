package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.models.Empresa;
import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

public class UpdateCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var empresa = new Empresa(request.getParameter("nome"), request.getParameter("cmbTamanhoEmpresa"));
        new EmpresaDAO().update(Integer.parseInt(request.getParameter("id")), empresa);
        return "redirect:empresas";
    }
}
