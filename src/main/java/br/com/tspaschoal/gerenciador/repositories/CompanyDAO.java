package br.com.tspaschoal.gerenciador.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.tspaschoal.gerenciador.models.Company;

public class CompanyDAO {

    private static List<Company> empresas = new ArrayList<>();

    private static int id = 0;

    static {
        new CompanyDAO().save(new Company("Facebook", "Grande"));
        new CompanyDAO().save(new Company("Google", "Grande"));
        new CompanyDAO().save(new Company("Alura", "Media"));
    }

    public List<Company> findAll() {
        return CompanyDAO.empresas;
    }

    public Company findById(int id) {
        var empresaOptional = CompanyDAO.empresas.stream().filter(empresa -> empresa.getId() == id);
        return empresaOptional.findFirst().get();
    }

    public void update(int id, Company newEmpresa) {
        var empresa = findById(id);
        empresa.setNome(newEmpresa.getNome());
        empresa.setTamanho(newEmpresa.getTamanho());
    }

    public void remove(int id) {
        var empresa = findById(id);
        empresas.remove(empresa);
    }

    public void save(Company empresa) {
        empresa.setId(id++);
        CompanyDAO.empresas.add(empresa);
    }

}
