/*Parity Number Check*/

package ftp;

import java.util.Scanner;

interface Even {

    void EvenCheck();

}

interface Odd {

    void OddCheck();

}

class ParityNumber implements Even, Odd {

    int cnt = 0;
    char[] c = new char[8];

    ParityNumber(char[] a) {
        c = a;

        for (int i = 0; i < 8; i++) {
            if (c[i] == '1') {
                cnt++;
            }

        }

    }

    @Override
    public void EvenCheck() {
        System.out.println("EvenParity");

    }

    @Override
    public void OddCheck() {
        System.out.println("OddParity");
    }

    void parityCheck() {

        if (cnt % 2 == 0) {
            OddCheck();
        } else {
            EvenCheck();
        }

    }

}

public class FTP {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = new String();
        char[] ch = new char[8];

        System.out.println("Enter the Number : ");
        s = scan.nextLine();
        ch = s.toCharArray();
        int flag = 0;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != '0' && ch[i] != '1') {
                flag = 1;
                break;
            }
        }

        try {
            if (flag == 1) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Flag : " + flag);
            System.out.println("Enter Binary digit only !! ");
        }
        
        ParityNumber a = new ParityNumber(ch);
        a.parityCheck();
        

    }
}
