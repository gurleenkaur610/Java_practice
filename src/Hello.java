public class Hello {

    public static void main (String [] args) {
        System.out.println("Hello Tim!!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an ALien!");
            System.out.println("And I am scared of the Aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 75;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than top score ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either one or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar == true){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (!isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is " + ageText);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My Total Value = " + myTotalValue);
        double theReminder = myTotalValue % 40.00d;
        System.out.println("The Reminder = " + theReminder);
        boolean isNoReminder = (theReminder == 0) ? true : false;
        System.out.println("Is no reminder = " + isNoReminder);
        if (!isNoReminder){
            System.out.println("Got Some Reminder");
        }
    }
}
