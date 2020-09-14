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
    public String addMommy(String inputString) {
        String modifyString = "";
        for (Character character : inputString.toCharArray()){
            if (containVowel(character)){
                modifyString += character + INSERT_STRING;
            }else{
                modifyString += character;
            }
        }
        return modifyString;
    }

    private boolean containVowel(Character character){
        return  VOWELS.contains(character.toString());
    }
}
