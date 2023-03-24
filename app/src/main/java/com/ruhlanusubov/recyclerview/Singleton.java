package com.ruhlanusubov.recyclerview;

public class Singleton {
    private landmark sentlandmark;
    private static Singleton singleton;
   private Singleton(){

   }
   public landmark getSentlandmark(){
       return sentlandmark;
   }
   public void setSentlandmark(landmark sentlandmark){
       this.sentlandmark=sentlandmark;
   }
    public static  Singleton getInstance(){
       if(singleton==null){
           singleton=new Singleton();
       }
       return singleton;
    }
}
