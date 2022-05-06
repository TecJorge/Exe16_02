package payroll;

public class OrderNotFoundException extends Throwable {
    OrderNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
