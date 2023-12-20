package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int paperBagPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeawayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (this.isVeg) {
            this.basePrice = 300;
            this.extraToppingPrice = 70;
        } else {
            this.basePrice = 400;
            this.extraToppingPrice = 120;
        }

        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.price = this.basePrice;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!this.isExtraCheeseAdded) {
            this.price += this.extraCheesePrice;
            this.isExtraCheeseAdded = true;
        }

    }

    public void addExtraToppings() {
        if (!this.isExtraToppingsAdded) {
            this.price += this.extraToppingPrice;
            this.isExtraToppingsAdded = true;
        }

    }

    public void addTakeaway() {
        if (!this.isTakeawayAdded) {
            this.price += this.paperBagPrice;
            this.isTakeawayAdded = true;
        }

    }

    public String getBill() {
        if (!this.isBillGenerated) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
            if (this.isExtraCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }

            if (this.isExtraToppingsAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }

            if (this.isTakeawayAdded) {
                this.bill = this.bill + "Paperbag Added: " + this.paperBagPrice + "\n";
            }

            this.bill = this.bill + "Total Price: " + this.price +"\n";
            this.isBillGenerated = true;
        }

        return this.bill;
    }
}

