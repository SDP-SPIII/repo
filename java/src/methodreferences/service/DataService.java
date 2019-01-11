package methodreferences.service;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DataService {
  private static final DataFactory dataFactory = new DataFactory();
  private Object userIds;


  public List<String> getAllUserNames() {
    //method ref on object
    return createItems(10, dataFactory::getName);

  }

  public List<String> getAllUserIds() {
    //method ref on object
    return createItems(10, 3, dataFactory::getNumberText);
  }

  public String getUserNameById(String id) {
    //just ignore id it's only test data
    return dataFactory.getName();
  }

  public String getUserAddressById(String id) {
    //just ignore id it's only test data
    return dataFactory.getAddress() + ", " + dataFactory.getCity();
  }

  public List<UserInfo> getAllUserInfoList() {
    List<UserInfo> userInfoList = new ArrayList<>();
    getAllUserIds().forEach(id -> userInfoList.add(createUserInfo(id)));

    return userInfoList;
  }

  private UserInfo createUserInfo(String id) {
    return UserInfo.createUserInfo(id, getUserNameById(id), getUserAddressById(id), dataFactory.getBirthDate());
  }


  //this is a util method to construct lists bases on DataFactory using method ref.
  // I saves us from a lot of biloerplate code.
  private static <T, V> List<T> createItems(int numberOfItems, V argValues,
                                            Function<V, T> itemProvider) {

    List<T> items = new ArrayList<>();

    for (int i = 0; i < numberOfItems; i++) {
      items.add(itemProvider.apply(argValues));
    }

    return items;
  }

  private static <T> List<T> createItems(int numberOfItems,
                                         Supplier<T> itemProvider) {
    List<T> items = new ArrayList<>();

    for (int i = 0; i < numberOfItems; i++) {
      items.add(itemProvider.get());
    }

    return items;
  }
}
