package tudelft.roman;

public class MyRomanNumeral {

    public int convert(String romanNumeral){
        int convertedNumber = 0;
        for (int i=0; i < romanNumeral.length(); i++){
            char c = romanNumeral.charAt(i);
            int number = covertChar(c);
            if(i + 1 < romanNumeral.length()){
                int nextNumber = covertChar(romanNumeral.charAt(i+1));
                if(number >= nextNumber)
                    convertedNumber += number;
                else
                    convertedNumber -= number;
            }else{
                convertedNumber += number;
            }
        }
        return convertedNumber;
    }

    public static int covertChar(char c){
        int number = 0;
        switch (c){
            case 'I':
                number = 1;
                break;
            case 'V':
                number = 5;
                break;
            case 'X':
                number = 10;
                break;
            case 'L':
                number = 50;
                break;
            case 'C':
                number = 100;
                break;
            case 'D':
                number = 500;
                break;
            case 'M':
                number = 1000;
        }
        return number;
    }
}
