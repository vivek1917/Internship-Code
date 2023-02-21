package com.vivek.coding;

import java.util.Scanner;

public class CaesarCipher 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("::__________Caesar Cipher__________::");
        System.out.print("Message: ");
        String msg = scanner.nextLine();
        System.out.print("Position: ");
        int position = scanner.nextInt();
        
        scanner.close();
        
        String encryptedMsg = Encrypt(msg, position);
        System.out.println("Encrypted Message: " + encryptedMsg);
        System.out.println("Decrypted Message: " + Decrypt(encryptedMsg, position));
    }
    
    public static String Encrypt(String textToEncrypt, int positions)
    {
        String toEncrypt = "", 
               result = "";
        
        for(int i=0; i< textToEncrypt.length(); i++)
        {
            //ignoring space
            if(textToEncrypt.charAt(i) == ' ' || textToEncrypt.charAt(i) == '.')
            {
                continue;
            }
            else
            {
                if(Character.isLowerCase(textToEncrypt.charAt(i)))
                {
                    toEncrypt += Character.toUpperCase(textToEncrypt.charAt(i));
                }
                else
                {
                   toEncrypt += textToEncrypt.charAt(i);
                }
            }
        }
        
        for(int i=0; i<toEncrypt.length(); i++)
        {
            char shiftedLetter = (char) (toEncrypt.charAt(i)+positions);
            if(shiftedLetter>'Z')
            {
                shiftedLetter = (char) (shiftedLetter - 'Z' + 'A' - 1);
            }
            result += shiftedLetter;
        }
        return result;
    }
    
    public static String Decrypt(String textToDecrypt, int positions)
    {
        String result = "";
        
        for(int i=0; i< textToDecrypt.length(); i++)
        {
            char shiftedLetter = (char) (textToDecrypt.charAt(i)-positions);
            if(shiftedLetter<'A')
            {
                shiftedLetter = (char) (shiftedLetter + 'Z' - 'A' + 1);
            }
            result += shiftedLetter;
        }
        return result;
    }
}
