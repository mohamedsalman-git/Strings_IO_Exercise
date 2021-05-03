import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a character to be found: ");
        String e= sc.nextLine();
        System.out.print("Enter a file name or path to be searched in: ");
        String path= sc.nextLine();


        try(FileInputStream fin=new FileInputStream(path);
            BufferedInputStream bin=new BufferedInputStream(fin); ){
            int i;
            int count=0;
            while((i=bin.read())!=-1){
                if ((char)i==e.charAt(0)){ count++; }
            }
            System.out.print("The char:'"+e.charAt(0)+"' have been found in the mentioned file for "+count+" times");
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}

