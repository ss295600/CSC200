/* 
assignment info: Write an application that uses random-number generation to create sentences.
name: said ahmed
date: 23 june 2018
*/ 

import java.util.Random;
import java.util.Scanner;

public class Sentence{
   public static void main(String args[]){
       SentenceBuild sentenceObj;

       for(int i=1; i<=20; i++){
           sentenceObj = new SentenceBuild();
      
           System.out.println(sentenceObj.getSentence());
       } // end for 
   } // end main 
} // end class

class SentenceBuild{
   public Word x;
  
   public SentenceBuild(){
       x = new Word();
   } // end sentencebuild
  
   public String getSentence(){
       String str = x.Article() + " " + x.Noun() + " " + x.Verb() + " " + x.Preposition() + " " + x.Article() + " " + x.Noun();
      
       str = str.substring(0, 1).toUpperCase()+str.substring(1)+".";
      
       return str;
   } // end string
} // end class

class Word{
   public Random rand;
   public String[] a;
   public String[] b;
   public String[] c;
   public String[] d;

   public Word(){
       rand = new Random();
       a = new String[] {"a", "any", "one", "some", "the"};
       b = new String[] {"boy", "dog", "girl", "man", "woman"};
       c = new String[] {"ate", "drove", "jumped", "ran", "walked"};
       d = new String[] {"in", "on", "over", "to", "under"};     
   } // end word
  
   public String Noun(){
       int r = rand.nextInt(5);
       return b[r];
   } // end noun
  
   public String Article(){
       int r = rand.nextInt(5); 
       return a[r];
   } // end article
  
   public String Verb(){
       int r = rand.nextInt(5); 
       return c[r];
   } // end verb
  
   public String Preposition(){
       int r = rand.nextInt(5);     
       return d[r];
   } // end preposition
} // end class 

/* 

sample output: 
  ----jGRASP exec: java Sentence
 One man ate to the dog.
 A girl jumped to any girl.
 The woman ate in the girl.
 Some man drove over any woman.
 A woman jumped over some man.
 The woman jumped in any woman.
 Any dog ate on the boy.
 A dog ran over some dog.
 Some woman drove under one girl.
 The dog walked to a woman.
 Some boy walked under one boy.
 Any man drove under one dog.
 The woman ran under some woman.
 One boy walked over one boy.
 One woman walked under one man.
 Some dog ran under one woman.
 One boy ate over a woman.
 Some girl jumped over any woman.
 Any girl jumped in any boy.
 One man ate over a dog.
 
  ----jGRASP: operation complete.
*/ 