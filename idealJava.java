
import java.io.*;
import java.util.*;
class idealJava {
    public static void main (String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ADD IN FILE.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ADD IN FILE.out")));
        
        //StringTokenizer st = new StringTokenizer(f.readLine()); 
        //Add only if a specific line in your input has spaces between what you want to input
        //int firstInt = Integer.parseInt(st.nextToken());
        //int secondInt = Integer.parseInt(st.nextToken());
        int i1 = Integer.parseInt(f.readLine());
        int[] someArray = new int[i1];
        
        for(int start = 0; start < i1; start++){
            someArray[start] = Integer.parseInt(f.readLine());
        }
        out.println();
        out.close();                                  // close the output file
    }
}
