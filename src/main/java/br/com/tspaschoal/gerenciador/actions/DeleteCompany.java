package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

public class DeleteCompany implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        new EmpresaDAO().remove(Integer.parseInt(request.getParameter("id")));
        return "redirect:empresas";
    }

}
