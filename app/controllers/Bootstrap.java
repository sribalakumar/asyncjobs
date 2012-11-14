package controllers;

import play.jobs.*;
 
@OnApplicationStart
public class Bootstrap extends Job {
    public void doJob(){
    System.out.println("welcome start up screen");
    }
    
}