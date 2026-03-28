import java.util.ArrayList;
import java.util.HashMap;

public class Expense {
    private HashMap<String, ArrayList<Purchase>> expense;

    public Expense(){
        expense = new HashMap<>();
    }
    public void add(String category, Purchase purchase){
        expense.putIfAbsent(category, new ArrayList<>());

        expense.get(category).add(purchase);
    }
    public ArrayList<String> categories(){
        ArrayList<String> listOfCategories = new ArrayList<>();
        for(String category: expense.keySet()){
            listOfCategories.add(category);
        }
        return listOfCategories;
    }
    public double sumInCategory(String category){
        if(!expense.containsKey(category)){
            System.out.println(category+" don't exist");
            return 0;
        }
        double sum = 0;
        for(Purchase price:expense.get(category)){
            sum+=price.getPrice();
        }
        return sum;

    }

    public void result(){
        ArrayList<String> list = categories();
        for(String categories:list){
            System.out.println(categories+":");
            for(Purchase price: expense.get(categories)){
                System.out.println(price);
            }
            System.out.println("Sum in this category was: "+sumInCategory(categories));
        }
    }

}
