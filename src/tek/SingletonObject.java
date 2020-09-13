/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tek;

/**
 *
 * @author Asus
 */
public class SingletonObject {
    
    private static SingletonObject instance=null;
    
    private SingletonObject(){
        
    }
    private synchronized static void createInstance(){
        if(instance==null){
              instance=new SingletonObject();
        }
    }
    public static SingletonObject getInstance(){
        createInstance();
        
        return instance;
    }
   public void helloSingleton(){
       System.out.println("Hello");
  
   }

}
