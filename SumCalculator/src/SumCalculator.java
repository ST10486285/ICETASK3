import javax.swing.JOptionPane;

public class SumCalculator {
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog("Enter first number:");
        String secondInput = JOptionPane.showInputDialog("Enter second number:");
        
        double num1 = Double.parseDouble(firstInput);
        double num2 = Double.parseDouble(secondInput);
        double sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
}