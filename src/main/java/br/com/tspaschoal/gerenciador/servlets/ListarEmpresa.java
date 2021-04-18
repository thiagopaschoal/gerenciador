package br.com.tspaschoal.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

@WebServlet(urlPatterns = "/empresas")
public class ListarEmpresa extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final var empresas = new EmpresaDAO().findAll();
        req.setAttribute("empresas", empresas);
        final var requestDispatcher = req.getRequestDispatcher("/listarEmpresa.jsp");
        requestDispatcher.forward(req, resp);
    }
}
