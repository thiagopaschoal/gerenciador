package br.com.tspaschoal.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

@WebServlet(urlPatterns = "/empresa")
public class DetalheEmpresa extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final var id = Integer.parseInt(req.getParameter("id"));
        final var empresa = new EmpresaDAO().findById(id);
        req.setAttribute("empresa", empresa);
        final var dispatch = req.getRequestDispatcher("/detalheEmpresa.jsp");
        dispatch.forward(req, resp);
    }

}
