package methodreferences.ref;

import methodreferences.service.DataService;

import java.util.List;
import java.util.function.Function;

public class ObjectRefExample {
  DataService dataService = new DataService();

  public static void main(String[] args) {

    ObjectRefExample example = new ObjectRefExample();
    example.showUsersInfo();
  }

  private void showUsersInfo() {
    List<String> userIds = dataService.getAllUserIds();
    //method ref on instance, using this
    userIds.forEach(this::displayUserInfo);
  }

  private void displayUserInfo(String id) {
    System.out.println("User Info for id :" + id);
    //method ref on dataService instance
    display(id, dataService::getUserNameById);
    display(id, dataService::getUserAddressById);
    System.out.println("------------------------");
  }

  private void display(String id, Function<String, ?> theConsumer) {
    System.out.println(theConsumer.apply(id));
  }
}
