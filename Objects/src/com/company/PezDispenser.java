package com.company;

public class PezDispenser {

     public static final int MAX_PEZ = 12;
     private int pezCount;
     private final String characterName;
     private final String characterColor;

     public PezDispenser(String characterName, String characterColor) {
          this.characterName = characterName;
          this.characterColor = characterColor;
          pezCount = 0;
     }

     public void fill(){
          fill(MAX_PEZ);
     }

     public void fill(int pezAmount){
          pezCount += pezAmount;
     }

     public boolean isEmpty(){
          return pezCount == 0;
     }

     public String getCharacterName() {
          return characterName;
     }

     public String getCharacterColor() {
          return characterColor;
     }

     public int getPezCount() {
          return pezCount;
     }

     public boolean dispense(){
          boolean wasDispensed = false;
          if (!isEmpty()){
               pezCount--;
               wasDispensed = true;
          }
          return wasDispensed;
     }
}
