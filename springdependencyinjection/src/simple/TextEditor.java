package simple;

public class TextEditor {
  private SpellChecker spellChecker;

  // a getter method to return spellChecker
  public SpellChecker getSpellChecker() {
    return spellChecker;
  }

  // a setter method to inject the dependency.
  public void setSpellChecker(SpellChecker spellChecker) {
    System.out.println("Inside setSpellChecker.");
    this.spellChecker = spellChecker;
  }

  public void spellCheck() {
    System.out.println("Doing spell check");
    spellChecker.checkSpelling();
  }
}