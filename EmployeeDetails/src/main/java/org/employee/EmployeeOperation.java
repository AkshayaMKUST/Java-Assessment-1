
package org.employee;
import java.util.*;
public class EmployeeOperation {
    public void employeeAddressMap() {
        Map<Employee, Address> employeeAddressMap = new HashMap<>();
        employeeAddressMap.put(new Employee(1, "Akshaya"), new Address(101, "MS Street", "Los angeles", 695013));
        employeeAddressMap.put(new Employee(2, "Abhi"), new Address(103, "Neo Street", "Chicago", 632421));
        employeeAddressMap.put(new Employee(3, "Sree"), new Address(203, "Elm St", "New York", 60601));
        getAddress(employeeAddressMap, new Employee(3, "Sree"));
        Set<String> distinctCities = new TreeSet<>();
        for (Address address : employeeAddressMap.values()) {
            distinctCities.add(address.getCity());
        }
        System.out.println("Distinct cities in ascending order: " + distinctCities);
    }
    public void getAddress(Map<Employee, Address> employeeAddressMap, Employee employee) {
        Address address = employeeAddressMap.get(employee);
        if (address != null) {
            System.out.println(address.getHouseNumber() + "," + address.getStreetName() + "," + address.getCity() + "," + address.getPinCode());
        }
    }
}