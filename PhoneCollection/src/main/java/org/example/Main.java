package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneManager manager = new PhoneManager();

        manager.addPhone(new Phone(100, "iPhone 13", "Apple", 999.99, 12, "19-10-2005"));
        manager.addPhone(new Phone(200, "Galaxy S21", "Samsung", 799.99, 8, "25-12-2021"));
        manager.addPhone(new Phone(300, "Pixel 6", "Google", 699.99, 6, "12-11-2025"));

        System.out.println("All Phones:");
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " by " + p.getBrand() + " - $" + p.getPrice());
        }

        System.out.println("\nApple Phones:");
        for (Phone p : manager.getPhonesByBrand("Apple")) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }
        System.out.println("\nGet Phone by ID (2):");
        Phone phone = manager.getPhoneById(2);
        if (phone != null) {
            System.out.println(phone.getName() + " - $" + phone.getPrice());
        }

        System.out.println("\nSorted by Price:");
        manager.sortByPrice();
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }

        System.out.println("\nSorted by Name:");
        manager.sortByName();
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }

        System.out.println("\nRemoving Phone ID:2");
        manager.removePhoneById(2);
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " - $" + p.getPrice());
        }

        System.out.println("\nSorted by camera Mp:");
        manager.sortByCamMp();
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " - $" + p.getCameraMP());
        }

        System.out.println("\nSorted by release date:");
        manager.sortByReleaseDate();
        for (Phone p : manager.getPhones()) {
            System.out.println(p.getName() + " - $" + p.getReleaseDate());
        }

        // Now using the Map-based manager

        System.out.println("\nUsing Map:");
        PhoneManagerUsingMap mapManager = new PhoneManagerUsingMap();
        mapManager.addPhone(new Phone(100, "iPhone 13", "Apple", 999.99, 12, "19-10-2005"));
        mapManager.addPhone(new Phone(200, "Galaxy S21", "Samsung", 799.99, 8, "25-12-2021"));
        mapManager.addPhone(new Phone(300, "Pixel 6", "Google", 699.99, 6, "12-11-2025"));

        System.out.println("\nGet Phone by ID (200):");
        Phone mapPhone = mapManager.getPhoneById(200);
        if (mapPhone != null) {
            System.out.println(mapPhone.getName() + " - $" + mapPhone.getPrice());

        }
            System.out.println("\nSorted by Name (Map):");
            mapManager.sortByName();
            for (Phone p : mapManager.getPhones().values()) {
                System.out.println(p.getName() + " - $" + p.getPrice());
            }
    }
}
