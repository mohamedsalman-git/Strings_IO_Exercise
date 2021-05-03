import java.util.*;

public class StringInitials {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a name: ");
        String name= sc.nextLine();

        String[] words = name.split(" ");
        StringBuilder initials= new StringBuilder();

        for (int i = 0; i< words.length; i++){
            initials.append(words[i].charAt(0));
        }
        System.out.print("The initials of the name you entered are: ");
        System.out.println(initials);
    }
}
