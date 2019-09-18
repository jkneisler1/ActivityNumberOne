import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    private static int count = 0; // a protected static variable
    // private NumberFormat formatter;

    // Get and set accessors for the code, description, and price instance variables

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(getPrice());
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
