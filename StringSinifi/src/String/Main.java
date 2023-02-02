package String;

import java.io.StringReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String words ="Hello World";
        String wordx = new String("Hello World");
        String data = "Lorem bask index Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ";
        int number = 10;
        String stNumber = "10a";
        String java = "  Java Programing   ";

        int size = data.length();
        System.out.println("Size : "+ size);

        char[] arr = data.toCharArray();
        for (char item : arr) {
            if (Character.isDigit(item)) {
                System.out.println("isDigit : " + item);
            }
        }
        char[] arr2 = stNumber.toCharArray();
        boolean isDigit = true;
        for (char item2 : arr2) {
            if (!Character.isDigit(item2)) {
                System.out.println("isDigit2 : " + item2);
                isDigit =false;
                System.out.println("isDigit2 : " + item2);
            }
        }

        byte[] bytes = data.getBytes();
        System.out.println(bytes[0]);

        String lower = data.toLowerCase(new Locale("tr","TR"));
        System.out.println(lower);
        String upper = data.toUpperCase(new Locale("tr","TR"));
        System.out.println(upper);

        boolean status = data.contains("bask");
        System.out.println(status);

        String[] wordArr = data.split("\\.");
        System.out.println(wordArr.length);

        if ("Hello World".equalsIgnoreCase(words)) {
            System.out.println("equalsIgnoreCase True");
        } else {
            System.out.println("equalsIgnoreCase False");
        }

        int index = data.indexOf("index");
        System.out.println("index : " + index);

        String newString = data.replaceAll("Lorem", "Ali");
        System.out.println(newString);

        String subString = data.substring(index, index+"index".length() );
        System.out.println(subString);

        java = java.trim();
        java = java.replaceAll(" ", "");
        System.out.println(java.trim()); //Sağ ve Soldaki boşlukları siler
    }
}