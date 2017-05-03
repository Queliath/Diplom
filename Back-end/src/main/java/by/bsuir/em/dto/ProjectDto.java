package by.bsuir.em.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectDto extends Dto<Long> {
    private static final long serialVersionUID = -1093073555735822044L;

    private String name;
    private Long employeeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Long employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectDto that = (ProjectDto) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(employeeCount != null ? !employeeCount.equals(that.employeeCount) : that.employeeCount != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (employeeCount != null ? employeeCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
