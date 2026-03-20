package shop;

import java.math.BigDecimal;

public interface CanBeSold {
    BigDecimal calculateProductionPrice();

    BigDecimal calculateSalePrice();
}
