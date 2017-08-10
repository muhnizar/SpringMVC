package com.example.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Muhammad.Nizar01 on 8/7/2017.
 */
public class HelloJob implements Job
{
    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);

        System.out.println(hour +":"+ minute+ " Hello Quartz!");

    }

}