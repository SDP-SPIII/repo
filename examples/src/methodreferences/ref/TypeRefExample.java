package methodreferences.ref;

import methodreferences.service.DataService;
import methodreferences.service.UserInfo;

import java.util.List;
import java.util.function.Function;

public class TypeRefExample {
  public static void main(String[] args) {
    DataService dataService = new DataService();
    List<UserInfo> userInfoList = dataService.getAllUserInfoList();
    //using Method reference on Class Type
    displayUserInfo(userInfoList, UserInfo::getDisplayInfo);
  }

  private static void displayUserInfo(List<UserInfo> userInfoList,
                                      Function<UserInfo, String> displayFunction) {
    for (UserInfo userInfo : userInfoList) {
      System.out.println(displayFunction.apply(userInfo));
      System.out.println("--------------------");
    }
  }
}
