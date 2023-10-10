package codegym.nkd.nguyenkhanhduy_c0623k1.service;

import codegym.nkd.nguyenkhanhduy_c0623k1.dao.DepartmentDAO;
import codegym.nkd.nguyenkhanhduy_c0623k1.model.Department;

import java.util.List;

public class DepartmentService {
    DepartmentDAO departmentDAO = new DepartmentDAO();

    public List<Department> findAll() {
        return departmentDAO.findAll();
    }
}
