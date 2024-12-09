package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //create vip customer

        Customers vipCustomers1 = new VipCustomers("Emin", "Eyvazov", 20);
        Customers vipCustomers2 = new VipCustomers("Eltac", "Eyvazov", 23);

        //create normal customer

        Customers normalCustomers1 = new NormalCustomers("Amin", "Eyvazov", 19);
        Customers normalCustomers2 = new NormalCustomers("Qedir", "Eyvazov", 19);


        //all user list

        List<Customers> customers = List.of(normalCustomers1, normalCustomers2, vipCustomers1, vipCustomers2);
        System.out.println(customers);

        //get all vip customer names

        VipCustomers vipCustomerInstance = new VipCustomers("Example", "VIP", 50);
        List<String> vipNames = vipCustomerInstance.getAllVipCustomersName(customers);
        System.out.println(vipNames);


        //get all normal customer names

        NormalCustomers normalCustomerInstance = new NormalCustomers("ExampleTwo", "Normal", 60);
        List<String> normalNames = normalCustomerInstance.getAllNormalCustomersName(customers);
        System.out.println(normalNames);
    }
}
