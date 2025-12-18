package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionsSupplierNonList.get());
        System.out.println(getDBConnectionsSupplier.get());
    }

    static String getDBConnection() {
        return "jdbc://localhost:5432/users";
    }

    private static Supplier<String> getDBConnectionsSupplierNonList = () -> "jdbc://localhost:5432/users";
    private static Supplier<List<String>> getDBConnectionsSupplier = () -> List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/customers");

}
