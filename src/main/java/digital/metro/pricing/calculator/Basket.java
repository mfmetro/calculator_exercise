package digital.metro.pricing.calculator;

import java.util.Set;

public class Basket {

    private String customerId;
    private Set<BasketEntry> entries;

    public Basket(String customerId, Set<BasketEntry> entries) {
        this.customerId = customerId;
        this.entries = entries;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Set<BasketEntry> getEntries() {
        return entries;
    }
}
