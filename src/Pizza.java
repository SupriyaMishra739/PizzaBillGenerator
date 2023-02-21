public class Pizza {
    private Integer price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int backPack=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeaway=false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;

        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void getPizzaPrice(){
        System.out.println(this.price);
    }

    public void addExtraCheese(){

        this.price+=extraCheesePrice;
        isExtraCheeseAdded=true;

    }
    public void addExtraToppings(){

        this.price+=extraToppingsPrice;
        isExtraToppingsAdded=true;

    }
    public void takeAway(){

        this.price+=backPack;
        isExtraToppingsAdded=true;
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza"+basePizzaPrice);
        System.out.println(this.price);
        if(isExtraCheeseAdded){
           bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra toppings added:"+extraToppingsPrice+"\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }


}
