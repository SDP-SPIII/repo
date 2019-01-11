package methodreferences.service;

public class UserRenderer {
  private UserInfo userInfo;

  public UserRenderer(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  public void renderUserInfo() {
    System.out.println(userInfo.getDisplayInfo());
  }
}
