package com.avikdigidev.config;

import com.avikdigidev.pojo.entity.ActivityTracker;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class ActivityTrackerProcessor implements ItemProcessor<ActivityTracker, ActivityTracker> {
    @Override
    public ActivityTracker process(ActivityTracker activityTracker) throws Exception {
        return activityTracker;
    }
}
