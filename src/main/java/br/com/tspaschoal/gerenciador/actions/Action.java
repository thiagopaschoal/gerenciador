package br.com.tspaschoal.gerenciador.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

    String execute(HttpServletRequest request, HttpServletResponse response);

}
