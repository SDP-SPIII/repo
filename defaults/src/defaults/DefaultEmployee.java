package defaults;

import java.math.BigDecimal;

public class DefaultEmployee extends DomainObject implements Employee {
  private final String name;
  private final String dept;
  private final BigDecimal salary;

  public DefaultEmployee(String id, String name, String dept,
                  BigDecimal salary) {
    super(id);
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDept() {
    return dept;
  }

  @Override
  public BigDecimal getSalary() {
    return salary;
  }
}

