package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

public class ListCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final var empresas = new EmpresaDAO().findAll();
        request.setAttribute("empresas", empresas);
        return "forward:listarEmpresa.jsp";
    }

}
