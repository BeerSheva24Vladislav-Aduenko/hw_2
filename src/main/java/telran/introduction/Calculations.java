package telran.introduction;

public class Calculations {
public static int sum(int op1, int op2) {
    int res = op1 + op2;
    return res;
}
public static int multiply(int op1, int op2) {
    int res = op1 * op2;
    return res;
}

public static int divide(int op1, int op2) {
    int res = op1 / op2;
    return res;
}

public static int subtract(int op1, int op2) {
  int res = op1 - op2;
    return res;
}

public static int sumOfDigits(int number) {
    int sum = 0;
    while (number != 0) {
        sum += number % 10;  
        number /= 10;      
    }
    return sum;
}

public static int maxDigit(int number) {
int maxDigit = 0;
while (number !=0) {
    int currentDigit;
    currentDigit = number % 10;
    if (maxDigit < currentDigit) {
        maxDigit = currentDigit;
    }
    number /= 10;
}
    return maxDigit;
}

public static boolean isDividedOn(int number, int divider) {
    return number % divider == 0;
}

}
