package org.example;

import java.util.ArrayList;
import java.util.List;

public class VipCustomers extends Customers {

    public VipCustomers(String name, String surname, int age) {
        super(name, surname, age);
    }

    List<String> getAllVipCustomersName(List<Customers> customers) {
        List<String> vipNames = new ArrayList<>();
        for (Customers customer : customers) {
            if (customer instanceof VipCustomers) {
                vipNames.add(customer.getName() + " (VIP)");
            }
        }
        return vipNames;
    }

}
