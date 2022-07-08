package App;

import javax.swing.JOptionPane;

import java.util.Scanner; // I use scanner because it's command line.


public class Gui {

        public static void main(String[] a) {
            String Username;
            String Username2;
            String Password;
            String Password2;


            Password = "123";
            Username = "admin";
            Username2 = "user";
            Password2 = "1";




            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();


            if (username.equals(Username2) && password.equals(Password2)) {

                String[] choices1 = { "new reimbursement claim", "personal car mileage"," Daily allowance ","Total amount of the reimbursement" };
                String input  = (String) JOptionPane.showInputDialog(null, "Action",
                        "Business trip", JOptionPane.QUESTION_MESSAGE, null, // Use
                        // default
                        // icon
                        choices1, // Array of choices
                        choices1[1]); // Initial choice

                if (input =="new reimbursement claim")
                {
                    String[] choices = { "taxi", "hotel", "air ticket", "train", "food" };
                    String input3 = (String) JOptionPane.showInputDialog(null, "Receipts",
                            "Reimbursement claim", JOptionPane.QUESTION_MESSAGE, null, // Use
                            // default
                            // icon
                            choices, // Array of choices
                            choices[1]); // Initial choice
                }
                if (input =="Daily allowance")
                {

                }

            }
            if (username.equals(Username)
                    && password.equals(Password)) {
                    // admin
                String[] adminchoice = { "Change rates for daily allowance", "Change rates for daily mileage"," edit the list of available receipts  ","define reimbursement limits " };
                String input  = (String) JOptionPane.showInputDialog(null, "Action",
                        "Admin console", JOptionPane.QUESTION_MESSAGE, null, // Use
                        // default
                        // icon
                        adminchoice, // Array of choices
                        adminchoice[1]); // Initial choice

            }

            /*else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            }
            */
            else {

                System.out.println("Invalid Username & Password!");
            }


    }
}
