package codegym.nkd.nguyenkhanhduy_c0623k1.service;

import codegym.nkd.nguyenkhanhduy_c0623k1.model.Employees;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeesService {

    public void add(Employees employees);

    public boolean delete(int id);

    public boolean update(Employees employees);

    public List<Employees> findAll();

    public Employees findById(int id);

    List<Employees> findAllToSearch(String searchEmployees);
}
