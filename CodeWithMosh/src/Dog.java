public class Dog {
  private String name;
  private String breed;

  public static int numberOfDogs;

  public Dog(String name, String breed) {
    setName(name);
    setBreed(breed);
    numberOfDogs++;
  }

  public Dog(String name) {
    this(name, "unknown");
  }

  public String getBreed() {
    return this.breed;
  }

  private void setBreed(String breed) {
    this.breed = breed;
  }

  public String getName() {
    return this.name;
  }

  private void setName(String name) {
    if (name.length() < 3)
      throw new IllegalArgumentException("Name must be longer than 3 characters");
    this.name = name;
  }

}