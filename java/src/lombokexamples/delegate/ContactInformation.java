package lombokexamples.delegate;

import lombok.Data;

@Data
public class ContactInformation implements HasContactInformation {

  private String email;

  private String firstName;
  private String lastName;

}