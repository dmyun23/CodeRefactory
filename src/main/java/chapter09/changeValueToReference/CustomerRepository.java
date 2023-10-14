package chapter09.changeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
    static Map<Long, Customer> repository = new HashMap<>();

    public static Customer registerCustomer(long id){
        if(!repository.containsKey(id)) repository.put(id, new Customer(id));
        return findCustomer(id);
    }

    private static Customer findCustomer(long id) {
        return repository.get(id);
    }
}
