package com.avikdigidev.config;

import com.avikdigidev.pojo.entity.ActivityTracker;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActivityTrackerProcessor implements ItemProcessor<ActivityTracker, ActivityTracker> {

    @Value("${base.module.target.activities}")
    private List<String> activityNames ;

    @Override
    public ActivityTracker process(ActivityTracker activityTracker) throws Exception {
        return (activityNames.contains(activityTracker.getName()))? activityTracker:null;

    }
}
