package companygui;

import java.util.Calendar;
import java.util.Date;

public class HourlyEmployee extends Employee {

  private final double hourlyWage;
  private final double monthlyHours;

  public HourlyEmployee(HourlyEmployee other) {
    super(other);
    this.hourlyWage = other.hourlyWage;
    this.monthlyHours = other.monthlyHours;
  }

  public HourlyEmployee(String aName) {
    this(aName, new Date(), 20.00, 160.0);
  }

  /**
   * Constructs an HourlyEmployee with hourly wage of 20 and
   * monthly hours of 160.
   */
  public HourlyEmployee(String aname, Date ahiredate) {
    this(aname, ahiredate, 20.00, 160.0);
  }

  public HourlyEmployee(String aname, Date ahiredate,
                        double anhourlywage, double amonthlyhours) {
    super(aname, ahiredate);
    disallowZeroesAndNegatives(anhourlywage, amonthlyhours);
    hourlyWage = anhourlywage;
    monthlyHours = amonthlyhours;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public double getMonthlyHours() {
    return monthlyHours;
  }

  @Override
  public double monthlyPay(Calendar cal) {
    return hourlyWage * monthlyHours;
  }

  @Override
  public String toString() {
    return getName() + "; Hire Date: " + getHireDate() + "; Hourly Wage: "
            + hourlyWage + "; Monthly Hours: " + monthlyHours;
  }
}
