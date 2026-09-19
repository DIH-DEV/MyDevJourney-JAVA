package PracticeFile;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RunApp {
    public static void main(String[] args) {
        Employees hr = new Employees();
        hr.setEmployeeId(UUID.randomUUID().toString());
        hr.setEmployeeFirstName("Femi");
        hr.setEmployeeLastName("Goke");
        hr.setGender('M');

        Employees product = new Employees();
        product.setEmployeeId(UUID.randomUUID().toString());
        product.setEmployeeFirstName("Tracy");
        product.setEmployeeLastName("Margret");
        product.setGender('F');

        Map <String, Employees> check = new HashMap<>();
        check.put(hr.getEmployeeFirstName(), hr);
        check.put(product.getEmployeeFirstName(), product);

        Employees humanResource = check.get("Femi");


        System.out.println("Employees: " + humanResource);

    }


}
