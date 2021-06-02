public abstract class Shop {
    int buyPrice;
    int timeToFinish;
    Product input;
    Product output;
    int level;
    int numberofProducts;
    boolean isWorking = false;
    int upgradeCost;
    boolean isAvailable = false;

    public Shop(Product input, Product output, int level, int timeToFinish , int buyPrice){
        this.input = input ;
        this.output = output ;
        this.level =level ;
        this.timeToFinish = timeToFinish;
        this.buyPrice = buyPrice;
    }

    public void buy (){
        totalMoney-=buyPrice;
        isAvailable=true;
    }
    public void upgrade(int level){
        totalMoney-=upgradeCost;
        level++;
        numberofProducts++;
    }
    public void startWorking(){
        if (isWorking==false) {
            isWorking = true;
        }
    }

}
