import java.awt.*;
import java.util.*;

public class Form {
    private String firstName;
    private String lastName;
    private static int age;
    private String favouriteColor;

    public Form(String firstName, String lastName, int age, String favouriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        Form.age = age;
        this.favouriteColor = favouriteColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Form.age = age;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public void ageCheck() {
        if(age <= 18){
            System.out.println(" You are too young");
        } else {
            System.out.println(" You are old");
//            return;
        }
    }
}

