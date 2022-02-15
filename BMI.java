import java.util.Scanner;

public class BMI {
    private double height;
    private double weight;
    private double bmi;
    private String bmiClass;
    private static final double POUND_TO_KG = 0.45359237;
    private static final double INCHES_TO_M = 0.0254;

    public BMI(double height, double weight) {
        this.height = height * INCHES_TO_M;
        this.weight = weight * POUND_TO_KG;
        this.bmi = calculateBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBmiClass() {
        return bmiClass;
    }

    public void setBmiClass(String bmiClass) {
        this.bmiClass = bmiClass;
    }

    public double calculateBMI() {
        if (bmi < 18.5)
            this.bmiClass = "Underweight";
        else if (bmi >= 18.5 && bmi < 25.0)
            this.bmiClass = "Normal";
        else if (bmi >= 25.0 && bmi < 30.0)
            this.bmiClass = "Overweight";
        else
            this.bmiClass = "Obese";
        return (this.weight/(this.height * this.height));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        BMI bmi = new BMI(height, weight);
        System.out.println("BMI is " + bmi.getBmi());
        System.out.println(bmi.getBmiClass());
    }
}
