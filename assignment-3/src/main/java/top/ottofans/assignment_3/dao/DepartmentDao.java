package top.ottofans.assignment_3.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @author ginga
 * @since 16/12/2022 下午3:32
 */
public class DepartmentDao extends HibernateDaoSupport {

    public Department getDepartmentById (int id) {
        return this.getHibernateTemplate().get(Department.class, id);
    }

}
