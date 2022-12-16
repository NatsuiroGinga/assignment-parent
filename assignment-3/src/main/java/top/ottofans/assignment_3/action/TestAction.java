package top.ottofans.assignment_3.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ginga
 * @since 16/12/2022 下午1:26
 */
public class TestAction extends ActionSupport {

    @Setter
    private DepartmentService departmentService;

    @Getter
    private Department department;

    public String test () {
        department = departmentService.getDepartmentById(1);
        return SUCCESS;
    }

    public String getDepartmentById () {
        department = departmentService.getDepartmentById(2);
        return SUCCESS;
    }
}
