package top.ottofans.assignment_3.entity;

import java.sql.Timestamp;

/**
 * @author ginga
 * @since 16/12/2022 下午3:19
 */
public class Employee {
    private int id;
    private String lastName;
    private String email;
    private Timestamp birth;
    private Timestamp createTime;
    private Integer departmentId;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public Timestamp getBirth () {
        return birth;
    }

    public void setBirth (Timestamp birth) {
        this.birth = birth;
    }

    public Timestamp getCreateTime () {
        return createTime;
    }

    public void setCreateTime (Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getDepartmentId () {
        return departmentId;
    }

    public void setDepartmentId (Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (email != null ? !email.equals(employee.email) : employee.email != null) return false;
        if (birth != null ? !birth.equals(employee.birth) : employee.birth != null) return false;
        if (createTime != null ? !createTime.equals(employee.createTime) : employee.createTime != null) return false;
        if (departmentId != null ? !departmentId.equals(employee.departmentId) : employee.departmentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = id;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
