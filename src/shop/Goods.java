package shop;

import java.math.BigDecimal;

public abstract class Goods implements CanBeSold {
    private BigDecimal markup;

    protected Goods(BigDecimal markup) {
        setMarkup(markup);
    }

    public BigDecimal getMarkup() {
        return markup;
    }

    public void setMarkup(BigDecimal markup) {
        if (markup == null || markup.compareTo(BigDecimal.ZERO) < 0) {
            this.markup = BigDecimal.ZERO;
            return;
        }
        this.markup = markup;
    }

    @Override
    public BigDecimal calculateSalePrice() {
        return calculateProductionPrice().add(markup);
    }
}
