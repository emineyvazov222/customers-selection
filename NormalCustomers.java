package org.example;

import java.util.ArrayList;
import java.util.List;

public class NormalCustomers extends Customers {

    public NormalCustomers(String name, String surname, int age) {
        super(name, surname, age);
    }

    public List<String> getAllNormalCustomersName(List<Customers> customers) {
        List<String> normalNames = new ArrayList<>();
        for (Customers customer : customers) {
            if (customer instanceof NormalCustomers) {
                normalNames.add(customer.getName() + " (NORMAL)");
            }
        }
        return normalNames;
    }

}
