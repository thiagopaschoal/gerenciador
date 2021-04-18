package br.com.tspaschoal.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.models.Empresa;
import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final var empresa = new Empresa(req.getParameter("nome"), req.getParameter("cmbTamanhoEmpresa"));
        new EmpresaDAO().save(empresa);
        resp.sendRedirect("empresas");
    }
}