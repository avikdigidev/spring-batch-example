package com.avikdigidev.pojo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "batch_activity_tracker")

@AllArgsConstructor
public class ActivityTracker {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name", length = 10, nullable = false)
    private String name;

    @Column(name = "time", nullable = false)
    private long time;

    @Column(name = "duration", nullable = false)
    private int duration;

}
