package reflection;

/*
 * Another example class for use with reflection
 */

import lombok.Data;

@Data
public class PersonRedux {
  private String name;
  private String userid;

  public PersonRedux() {
    this("Fred", "xyz123");
  }

  /**
   * @param name
   * @param userid
   */
  public PersonRedux(String name, String userid) {
    this.name = name;
    this.userid = userid;
  }

}