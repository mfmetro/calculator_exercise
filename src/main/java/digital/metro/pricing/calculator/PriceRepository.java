package digital.metro.pricing.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * A dummy implementation for testing purposes. In production, we would get real prices from a database.
 */
@Component
public class PriceRepository {

    private Map<String, BigDecimal> prices = new HashMap<>();
    private Random random = new Random();

    public BigDecimal getPriceByArticleId(String articleId) {
        return prices.computeIfAbsent(articleId,
                key -> BigDecimal.valueOf(0.5d + random.nextDouble() * 29.50d).setScale(2, RoundingMode.HALF_UP));
    }

    public BigDecimal getPriceByArticleIdAndCustomerId(String articleId, String customerId) {
        switch(customerId) {
            case "customer-1":
                return getPriceByArticleId(articleId).multiply(new BigDecimal("0.90")).setScale(2, RoundingMode.HALF_UP);
            case "customer-2":
                return getPriceByArticleId(articleId).multiply(new BigDecimal("0.85")).setScale(2, RoundingMode.HALF_UP);
        }

        return null;
    }
}
