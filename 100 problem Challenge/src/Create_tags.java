//question 71:
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//
//Input Format
//
//Single Line of Input. Input strings are space separated. First string should be considered as tag string and second string will be the word inside the tags.
//
//Constraints
//
//First input string in the output must be in Lowercase. The string can be written in uppercase or lowercase.
//
//Output Format
//
//Print the output string containing tags and word.

import java.util.*;

public class Create_tags {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String tag = sc.next();
        String word = sc.next();
        System.out.println("<"+tag.toLowerCase()+">"+word+"</"+tag.toLowerCase()+">");
    }
}
