package ke.co.safaricom.services;

public class DecryptTest {
    public static String encrypt(String plainText, int shift){
    if(shift>26){
        shift =shift%26;
    }
    else if (shift<0){
        shift =(shift%26)+26;
    }
    String cipherText ="";
    int length = plainText.length();
    for(int i=0; i<length; i++){
       char Alphabet = plainText.charAt(i);
       if (Character.isLetter(Alphabet)){

            if(Character.isLowerCase(Alphabet)){
               char Letter = (char)(Alphabet+shift);
               if(Letter>'z'){
                   cipherText +=(char)(Alphabet-(26-shift));
               }
               else cipherText +=Letter;
           }
           else if(Character.isUpperCase(Alphabet)){
               char Letter = (char)(Alphabet+shift);
               if(Letter>'Z'){
                   cipherText +=(char)(Alphabet-(26-shift));
               }
               else cipherText +=Letter;
           }
           }
        else  cipherText += Alphabet;
       }
        return cipherText;
    }
    public static void main(String[]args){
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipher =encrypt(text,23);
        System.out.println(cipher);
    }
    }



