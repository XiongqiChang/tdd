package com.twu;

/**
 * @Author: xqc
 * @Date: 2020/9/14 - 09 - 14 - 17:01
 * @Description: com.twu
 * @version: 1.0
 */
public class ModifyString {

    private static  final  String VOWELS = "aeiou";
    private static  final  String INSERT_STRING = "mommy";
    private static  final  Double VOWELS_PERCENT = 0.3;

    public String modifyString(String inputString) {
        if (shouldModifyString(inputString)){
            return addMommy(inputString);
        }else{
            return  inputString;
        }
    }

    private String addMommy(String inputString){
        String modifyString = "";
        for (Character character : inputString.toCharArray()){
            if (containVowel(character)){
                modifyString += character + INSERT_STRING;
            }else{
                modifyString += character;
            }
        }
        return  modifyString;
    }

    private boolean containVowel(Character character){
         Character character1 = Character.toLowerCase(character);
        return  VOWELS.contains(character1.toString());
    }

    private boolean shouldModifyString(String inputString){
        int vowelCount  = 0;
        char[] chars = inputString.toCharArray();
        for (Character character : chars){
            if (containVowel(character)){
                vowelCount++;
            }
        }
        return  ((double)vowelCount / (chars.length)) > VOWELS_PERCENT;
    }
}
