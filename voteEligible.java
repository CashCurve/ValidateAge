public class voteEligible {
    public static void checkEligibility(int age) {
    if (age >= 18) {
        System.out.println("Eligible to vote.");
    } else {
        System.out.println("Not eligible to vote.");
    }
}

public static void main(String[] args) {
    int age = 20;  // You can change the age here
    checkEligibility(age);
}
}
