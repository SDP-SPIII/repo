package generics.dogs;

/**
 * An abstract dog which provides basic implementation for a dog.
 *
 * @author
 */
public abstract class AbstractDog implements Dog {
  //keep these private so no one can change these values.
  private String name;
  private String breed;

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getBreed() {
    return this.breed;
  }

  protected void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public abstract void bark();

  @Override
  public String toString() {
    String s = "Breed: " + this.breed + " Name: " + this.name;
    return s;
  }
}
