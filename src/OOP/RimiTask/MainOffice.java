package OOP.RimiTask;

import java.math.BigDecimal;

public class MainOffice {
    private BigDecimal price;
    private Integer amountOfProduct;
    private String priceLabel;
    private String descriptionOfProduct;
    private BigDecimal discount;
    private BigDecimal irregular;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(Integer amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public String getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(String priceLabel) {
        this.priceLabel = priceLabel;
    }

    public String getDescriptionOfProduct() {
        return descriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getIrregular() {
        return irregular;
    }

    public void setIrregular(BigDecimal irregular) {
        this.irregular = irregular;
    }
}

