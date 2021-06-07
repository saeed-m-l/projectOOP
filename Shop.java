package model;

public enum Shop {
    SEWINGMACHINE(Product.CLOTH, Product.DRESS, 1, 6, 400),
    MILKSHOP(Product.MILK, Product.CARTONOFMILK, 1, 6, 400),
    ICECREAMSHOP(Product.CARTONOFMILK, Product.ICECREAM, 1, 7, 550),
    FLOURSHOP(Product.EGG, Product.FLOUR, 1, 4, 150),
    CLOTHSHOP(Product.FEATHER, Product.CLOTH, 1, 5, 250);

    int buyPrice;
    int timeToFinish;
    Product input;
    Product output;
    int level;
    int numOfProducts;
    boolean isWorking = false;
    int upgradeCost;
    boolean isAvailable = false;

    Shop(Product input, Product output, int level, int timeToFinish , int buyPrice){
        this.input = input ;
        this.output = output ;
        this.level =level ;
        this.timeToFinish = timeToFinish;
        this.buyPrice = buyPrice;
    }

    public void buy () {
        totalMoney-=buyPrice;
        isAvailable=true;
    }
    public void upgrade(int level){
        totalMoney-=upgradeCost;
        level++;
        numOfProducts++;
    }
    public void startWorking(){
        if (isWorking==false) {
            isWorking = true;
        }
    }

}
