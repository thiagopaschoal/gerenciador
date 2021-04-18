package br.com.tspaschoal.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tspaschoal.gerenciador.repositories.EmpresaDAO;

@WebServlet(urlPatterns = "/deletarEmpresa")
public class DeletarEmpresa extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        new EmpresaDAO().remove(Integer.parseInt(req.getParameter("id")));
        resp.sendRedirect("empresas");
    }

}
