//importing the packages needed
import Decoder.Decoder;
import Encoder.Encoder;

import java.io.Console;//java console
import java.io.IOException;
import java.util.Scanner;


public class App{
    public static void main(String[] args) throws IOException {
        //enter desired shift key
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired shift key:");
        int key = scanner.nextInt();
        Console myConsole = System.console();
        System.out.println("What Message would you like to encode?");
        String inputMessage = myConsole.readLine();//get user's response here.
        //pass the input message to the encoder to be encoded.
        Encoder encryptMessage = new Encoder(inputMessage);
        String encodedStatement = encryptMessage.getEncodedString();//use getter method to get the encoded message

        //Return the statement to it's original state
        Decoder statementDecoder = new Decoder(encodedStatement);
        String decodedStatement = statementDecoder.getDecodedString();

        //Interact with the terminal
        /convert to uppercase/System.out.println("This is your statement in uppercase"+" "+"("+(inputMessage.toUpperCase())+"."+")");
        /encoded statement/ System.out.println("Look"+" "+(encodedStatement)+"is the encoded version of your statement");
       /original statement/ System.out.println("This is Your statement;"+" "+(decodedStatement)+ " The decoded version!!");
    }
}

public class NumberDigits {

    public static void main(String[] args) {

        int count = 0, num = 3452;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}