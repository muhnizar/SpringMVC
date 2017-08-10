package com.example.scheduler;

import com.example.job.HelloJob;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import static org.quartz.CronScheduleBuilder.cronSchedule;


/**
 * Created by Muhammad.Nizar01 on 8/7/2017.
 */
public class BatchThread implements ServletContextListener {

    final static Logger LOGGER = LogManager.getLogger(BatchThread.class.getName());

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Enter Batch thread");

        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .build();

        CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
//                .withSchedule(cronSchedule("0 * 14 * * ?"))
                .withSchedule(cronSchedule("0 0 14 * * ?"))
                .build();

        Scheduler scheduler = null;
        try {
            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(job, trigger);

        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
