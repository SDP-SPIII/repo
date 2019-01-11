package defaults;

import java.math.BigDecimal;
import java.util.List;

public interface Employee {
  String getName();

  String getDept();

  BigDecimal getSalary();

  default BigDecimal getBonus() {
    return getSalary().multiply(new BigDecimal(0.10)).
            setScale(2, BigDecimal.ROUND_HALF_UP);
  }

  default String getEmployeeInfo() {
    return "Name: " + getName() +
            ", Dept: " + getDept() +
            ", Salary " + getSalary() +
            ", Bonus " + getBonus();
  }

  static String getEmployeeInfo(List<Employee> employeeList) {
    String info = "";
    for (Employee employee : employeeList) {
      info += employee.getEmployeeInfo() + "\n";
    }
    return info;
  }
}
