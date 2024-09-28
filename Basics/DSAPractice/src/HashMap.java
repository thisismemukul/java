public class HashMap {
    public void hashMapDemo(){
        java.util.HashMap<Integer,String> employees = new java.util.HashMap<>();
        employees.put(101, "Mukul");
        employees.put(102, "Happy");
        employees.put(103, "Iron Man");
        employees.put(104, "Captain");
        System.out.println("Initial HashMap: " + employees);

        employees.replace(104, "Captain America");
        System.out.println("After replacing Captain: " + employees);

        employees.replace(104, "Cap", "Captain Marvel");
        System.out.println("After trying to replace 'Cap' with Captain Marvel: " + employees);

        employees.replace(104, "Captain America", "Captain Marvel");
        System.out.println("After replacing Captain America with Captain Marvel: " + employees);

        employees.put(105, "Hulk");
        System.out.println("After adding Hulk: " + employees);

        employees.putIfAbsent(106, "Hulk1");
        System.out.println("After putting Hulk1 if absent: " + employees);

        employees.remove(106);
        System.out.println("After removing Hulk1: " + employees);

        Object clone = employees.clone();
        System.out.println(clone);

        java.util.HashMap<Integer, String> clonedEmployees = (java.util.HashMap<Integer, String>) employees.clone();
        System.out.println("Cloned HashMap: " + clonedEmployees);

        String employeeName = employees.get(101);
        System.out.println("Employee with ID 101: " + employeeName);

        boolean hasKey102 = employees.containsKey(102);
        System.out.println("Does ID 102 exist? " + hasKey102);

        boolean hasValueHulk = employees.containsValue("Hulk");
        System.out.println("Does the value 'Hulk' exist? " + hasValueHulk);

        int size = employees.size();
        System.out.println("Size of the HashMap: " + size);

        System.out.println("Iterating over the HashMap:");

        for (Integer Id : employees.keySet()) {
            String employee = employees.get(Id);
            System.out.println("Employee ID: " + Id + ", Name: " + employee + ", size: " + employees.size());
        }

        System.out.println("Iterating over the clonedEmployees HashMap using entrySet:");
        for (var entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("Cloned HashMap: " + clonedEmployees);
        clonedEmployees.remove(105);
        System.out.println("After removing Hulk from clonedEmployees: " + clonedEmployees);

        employees.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }

}
