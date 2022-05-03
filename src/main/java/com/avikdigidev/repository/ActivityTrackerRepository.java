
package com.avikdigidev.repository;

import com.avikdigidev.pojo.entity.ActivityTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTrackerRepository extends JpaRepository<ActivityTracker, Integer> {

}
