import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    static StringBuilder sb;
    static int N;
    static Deque<String> q;
    static double[] array;
    static Deque<Character> dq;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String str = br.readLine();
        int[] array = new int[str.length()];
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            array[i] = (int)ch[i]; 
        }
        Arrays.sort(array);
        for(int i=0; i<str.length()-1;i++){
            if(array[i]==array[i+1]){

            }
            else{
                
            }
        }
    }
    
    
}