package controllers;

import play.jobs.Job;
import play.jobs.OnApplicationStop;

@OnApplicationStop
public class Shutdown extends Job {
 
    public void doJob() {
        System.out.println("Application is shutdown");
    }
}