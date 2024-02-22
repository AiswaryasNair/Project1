//3.Write a program to check whether the given number is Armstrong or not

class ArmstrongNumber {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]); 
        int originalNumber = number;
        int result = 0;
        int power = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, power);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
