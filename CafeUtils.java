import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtils {
    public int getStreakGoal(int numWeeks) {
        return numWeeks *(numWeeks - 1) / 2;
    }

    public double getOrderTotal(double[] prices) {

        double sum = 0;
        for (double price : prices ) 
            sum += price;
        

        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (String item : menuItems)
            System.out.println(item);
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello," + userName + "! There are " + (customers.size() - 1) + " people ahead of you.");
        System.out.println(Arrays.toString(customers.toArray()));
    }
}