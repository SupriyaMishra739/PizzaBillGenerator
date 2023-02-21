public class Main {
    public static void main(String[] args) {
        //2 types of pizza
        //normal base and Deluxe pizza
        //normal base--veg (price 300)and non veg(price 400)
        //NORMAL BASE PIZZA
        //add extra cheese --100 rs extra
        //extra toppings--100rs
        //takeaway(20rs for backpack) and dining

        //DELUXE PIZZA
        //already extra cheese and toppings
        //veg non veg available
        //takeaway and  dining

//        Pizza basePizza=new Pizza(true);
//
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp=new DeluxPizza(false);
//        dp.addExtraCheese();dp.addExtraToppings();
        dp.takeAway();
        dp.getBill();



    }




}