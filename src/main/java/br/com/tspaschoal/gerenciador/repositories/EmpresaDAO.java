package br.com.tspaschoal.gerenciador.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.tspaschoal.gerenciador.models.Empresa;

public class EmpresaDAO {

    private static List<Empresa> empresas = new ArrayList<>();

    private static int id = 0;

    static {
        new EmpresaDAO().save(new Empresa("Facebook", "Grande"));
        new EmpresaDAO().save(new Empresa("Google", "Grande"));
        new EmpresaDAO().save(new Empresa("Alura", "Media"));
    }

    public List<Empresa> findAll() {
        return EmpresaDAO.empresas;
    }

    public Empresa findById(int id) {
        var empresaOptional = EmpresaDAO.empresas.stream().filter(empresa -> empresa.getId() == id);
        return empresaOptional.findFirst().get();
    }

    public void update(int id, Empresa newEmpresa) {
        var empresa = findById(id);
        empresa.setNome(newEmpresa.getNome());
        empresa.setTamanho(newEmpresa.getTamanho());
    }

    public void remove(int id) {
        var empresa = findById(id);
        empresas.remove(empresa);
    }

    public void save(Empresa empresa) {
        empresa.setId(id++);
        EmpresaDAO.empresas.add(empresa);
    }

}
