package org.example;

import java.util.*;

public class PhoneManagerUsingMap {
    private Map<Integer, Phone> phoneMap;

    public PhoneManagerUsingMap() {
        phoneMap = new HashMap<>();
    }

  public void addPhone(Phone phone){
        phoneMap.put(phone.getId(),phone);
  }
  public Phone getPhoneById(int id){
        return phoneMap.get(id);
  }
    public boolean removePhoneById(int id){
        return phoneMap.remove(id) != null;
    }
    public Map<Integer, Phone> getPhones() {
        return phoneMap;
    }
    // Implement sorting methods as needed, similar to PhoneManager but using the values from the map
   List<Phone> phoneList = new ArrayList<>(phoneMap.values());

    public void sortByName(){
        Collections.sort(phoneList,new Comparator<Phone>(){
            @Override
            public int compare(Phone a,Phone b){
                return a.getName().compareTo(b.getName());
            }
        });
    }

}
