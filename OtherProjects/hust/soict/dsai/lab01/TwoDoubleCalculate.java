package OtherProjects.hust.soict.dsai.lab01;
// Exercise 2.2.6: TwoDoubleCalculate.java
import javax.swing.JOptionPane;
public class TwoDoubleCalculate {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Le Hoang Long - 20215279 - Please input the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Le Hoang Long - 20215279 - Please input the second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        //Convert string to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        String strSum = num1 + "+" + num2 + "=" + (num1+num2);
        String strDiff = num1 + "-" + num2 + "=" + (num1-num2);
        String strProd = num1 + "*" + num2 + "=" + (num1*num2);
        String strQuot = num1 + "/" + num2 + "=" + (num1/num2);
        JOptionPane.showMessageDialog(null, strSum, "Show sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strDiff, "Show difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strProd, "Show product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strQuot, "Show quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
