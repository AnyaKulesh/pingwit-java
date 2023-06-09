package org.example.homework.lesson14.task1;

public class LegoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("type", -1, "");
        LegoAnnotationService[] services = new LegoAnnotationService[] {
                new NotEmptyValidationService(),
                new SizeValidationService()
        };

        for (LegoAnnotationService service : services) {
            ValidationResult result = service.validate(lego);
            System.out.println(result);
        }
    }
}
