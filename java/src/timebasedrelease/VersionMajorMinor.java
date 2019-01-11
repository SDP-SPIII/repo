package timebasedrelease;

public class VersionMajorMinor {
  public static void main(String[] args) {
    Runtime.Version version = Runtime.version();
    System.out.println(version.major());
    System.out.println(version.minor());
  }
}
