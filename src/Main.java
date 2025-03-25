import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Cat object
            Cat simon = new Cat("Simon", 9, "Tabby", 11.0);

            // Display initial info
            simon.displayInfo();

            // 1. List all fields
            System.out.println("\nFields:");
            Field[] fields = Cat.class.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
            }

            // 2. List all methods
            System.out.println("\nMethods:");
            Method[] methods = Cat.class.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }

            // 3. Change private field access and modify ALL values
            System.out.println("\nModifying private fields:");
            for (Field field : fields) {
                field.setAccessible(true); // Allow access to private fields
                if (field.getName().equals("name")) {
                    field.set(simon, "Whiskers"); // Change name
                } else if (field.getName().equals("age")) {
                    field.set(simon, 5); // Change age
                } else if (field.getName().equals("breed")) {
                    field.set(simon, "Siamese"); // Change breed
                } else if (field.getName().equals("weight")) {
                    field.set(simon, 8.0); // Change weight
                }
            }

            // Display updated info
            System.out.println("\nUpdated Info:");
            simon.displayInfo();

            // 4. Change private method access and invoke ALL methods
            System.out.println("\nInvoking private methods:");
            for (Method method : methods) {
                method.setAccessible(true); // Allow access to private methods
                if (method.getName().equals("purr")) {
                    method.invoke(simon); // Invoke purr
                } else if (method.getName().equals("sleep")) {
                    method.invoke(simon); // Invoke sleep
                }
            }

        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
