interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        switch (order) {
            case "pizza":
                return new Pizza();
            case "cake":
                return new Cake();
            default:
                return null;
        }
    }//End of getFood method

}//End of factory class

//Problem: https://www.hackerrank.com/challenges/java-factory
public class JavaFactoryPattern {

    public static void main(String args[]) {
        //creating the
        FoodFactory foodFactory = new FoodFactory();
        //factory instantiates an object
        Food food = foodFactory.getFood("cake");
        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }

}