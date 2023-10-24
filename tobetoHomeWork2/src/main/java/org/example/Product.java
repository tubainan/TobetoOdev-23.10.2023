package org.example;

public class Product {
        private String name;
        private double unitPrice;
        private double discount;
    private String ImageUrl;
    private int unitsInStock;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public String getImageUrl() {
            return ImageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.ImageUrl = imageUrl;
        }

        public int getUnitsInStock() {
            return unitsInStock;
        }

        public void setUnitsInStock(int unitsInStock) {
            this.unitsInStock = unitsInStock;
        }
}
