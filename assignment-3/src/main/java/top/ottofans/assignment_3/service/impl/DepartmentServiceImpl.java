package top.ottofans.assignment_3.service.impl;

import lombok.Setter;
import top.ottofans.assignment_3.dao.DepartmentDao;
import top.ottofans.assignment_3.service.DepartmentService;

/**
 * @author ginga
 * @since 16/12/2022 下午3:38
 */
public class DepartmentServiceImpl implements DepartmentService {

    @Setter
    private DepartmentDao departmentDao;

    @Override
    public Department getDepartmentById (int id) {
        return departmentDao.getDepartmentById(id);
    }

}
