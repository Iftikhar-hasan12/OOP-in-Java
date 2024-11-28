/*Create a user authentication system that throws a custom exception
if a user exceeds a maximum number of invalid login attempts. 
The system should lock the user account after a specified number of attempts.*/

package ftp;

import java.util.Scanner;

/**/
class CustomException extends Exception {

    CustomException(String s) {

        super(s);
    }
}

class Login_page {

    int pass = 123;
    int count = 0;

    int check(int p) throws CustomException {

        if (count == 3) {
            throw new CustomException("Wrong password entered lots time , you are banned now");
        }
        count++;
        if (p == pass) {
            return 1;

        } else {
            return 0;
        }

    }

}

public class FTP {

    public static void main(String[] args) throws Exception {
        Login_page a = new Login_page();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Pass : ");
            int n = scan.nextInt();

            try {

                int k = a.check(n);
                if (k == 1) {
                    System.out.println("Access granted ");
                    return;
                } else {
                    System.out.println("Access Deny");
                }
            } catch (CustomException e) {
                System.out.println("Error caught : " + e.getMessage());
                return;
            }

        }

    }

}
