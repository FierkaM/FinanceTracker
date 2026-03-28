import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Expense tracker;

    public UI(){
        scanner = new Scanner(System.in);
        tracker = new Expense();
    }
    public void uIStart(){
        while(true) {
            listOfOperations();
            int operationNumber = Integer.valueOf(scanner.nextLine());
            if(operationNumber == -1){
                break;
            }
            if(operationNumber == 0){
                addExpense();
            }
            if(operationNumber == 1){
                getCategories();
            }
            if(operationNumber == 2){
                expenseInCategory();
            }
            if(operationNumber == 3){
                all();
            }

        }
    }
    public void listOfOperations(){
        System.out.println("List of operation:");
        System.out.println("Add new expense - 0");
        System.out.println("List of categories - 1");
        System.out.println("Expense in specific category - 2");
        System.out.println("All expenses - 3");
        System.out.println("Exit - -1");
    }
    public void addExpense(){
        System.out.println("Category of expense: ");
        String category = scanner.nextLine();
        System.out.println("Name of expense: ");
        String name = scanner.nextLine();
        System.out.println("Price of expense");
        Double price = Double.valueOf(scanner.nextLine());
        System.out.println("Day: ");
        int day = Integer.valueOf(scanner.nextLine());
        System.out.println("Month: ");
        int month = Integer.valueOf(scanner.nextLine());
        System.out.println("Year: ");
        int year = Integer.valueOf(scanner.nextLine());

        SimpleData date = new SimpleData(day, month, year);
        Purchase purchase = new Purchase(name, price, date);
        tracker.add(category, purchase);
    }
    public void getCategories(){
        for(String category: tracker.categories()){
            System.out.println(category);
        }
    }

    public void expenseInCategory(){
        System.out.println("Which category: ");
        String category = scanner.nextLine();
        double price = tracker.sumInCategory(category);
        System.out.println("For "+category+"expenses was:"+ price);
    }

    public void all(){
        tracker.result();
    }


}
