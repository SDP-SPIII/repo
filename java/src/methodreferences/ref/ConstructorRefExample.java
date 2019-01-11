package methodreferences.ref;

import methodreferences.service.DataService;
import methodreferences.service.UserInfo;
import methodreferences.service.UserRenderer;

import java.util.List;
import java.util.function.Function;

public class ConstructorRefExample {
  public static void main(String[] args) {
    DataService dataService = new DataService();
    List<UserInfo> userInfoList = dataService.getAllUserInfoList();
    //using constructor ref
    displayUser(userInfoList, UserRenderer::new);
  }

  private static void displayUser(List<UserInfo> userInfoList, Function<UserInfo, UserRenderer> rendererFunction) {
    userInfoList.forEach(u -> rendererFunction.apply(u).renderUserInfo());

  }
}
