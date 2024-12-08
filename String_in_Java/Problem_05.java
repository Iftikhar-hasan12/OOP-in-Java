/* For string , various type problems here */

package love;
import java.util.Arrays;
public class Love {

    public static void main(String[] args) {
//----------------------------------------------------------------------------------
        // input :I love America
        //output :IloveAmerica
        String s = "I love America";
        String[] sr = s.split(" ");
        String s2 = String.join("", sr);
        System.out.println(s2);

        //----------------------------------------------------------------
        //Input string: "     Lots of leading and trailing spaces.     "
        //Output      :"Lots of leading and trailing spaces."
        String s1 = "  Lots of leading and trailing spaces.   ";
        int flag = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c != ' ') {
                flag = i;
                break;
            }

        }

        int dot = s1.indexOf('.');
        String sub = s1.substring(flag, dot + 1);
        System.out.println("Output:" + sub);

//---------------------------------------------------------------------------
//Remove I
//Input string: I love programming. I love Codeforwin.
//Output string:love programming. love Codeforwin.
        String s3 = "I love programming.and I love GUB.";
        String s4 = s3.replace("I", "");

        System.out.println(s4);

//--------------------------------------------------
//count "naam " string 
// Input : amar naam iftikhar, amr bou er naam Zafia but valobeshi daki zafu , ar amdr bacchar naam o fix but ekhane bolbo na cz amr shorom  kore, jaak kotha holo tmi je amr code run korteso to tmr naam ki ? tmi ki amr frnd ? tmr bou er naam ki ? jdi maiya hou then tmr jamai er naam ki ? ow tmi toh biya koro nai taile tmr bf er naam ki 
//Output : Total Naam : 7
        String f = "amar naam iftikhar , amr bou er naam Zafia but valobeshe daki zafu , ar amdr bacchar naam o fix but ekhane bolbo na cz amr shorom  kore, jaak kotha holo tmi je amr code run korteso to tmr naam ki ? tmi ki amr frnd ? tmr bou er naam ki ? jdi maiya hou then tmr jamai er naam ki ? ow tmi toh biya koro nai taile tmr bf er naam ki";
        String[] ar = f.split(" ");
        int count = 0;
        String item = "naam";
        for (int i = 0; i < ar.length; i++) {

            if (ar[i].equals(item)) {
                System.out.println(ar[i]);
                count++;
            }
        }
        System.out.println("Total Naam : " + count);

        //Now task is to replace all the "naam" with "name"
        String k = f.replace("naam", "name");
        
        System.out.println(k);

        String lap = k.replace("a","A");
        System.out.println(lap);
        //--------------------------------------------------------------------
      
//-----------------------------------------------------------------------------
        
    }

}
