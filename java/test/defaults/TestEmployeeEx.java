package defaults;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeEx {
  public static void main(String... strings) {
    List<Employee> employees =
            Arrays.asList(new DefaultEmployeeEx("100", "Mike", "IT",
                            new BigDecimal(5322), new BigDecimal(5)),
                    new DefaultEmployeeEx("200", "Jane", "Admin",
                            new BigDecimal(6754), new BigDecimal(12)));

    System.out.println(Employee.getEmployeeInfo(employees));
  }
}
