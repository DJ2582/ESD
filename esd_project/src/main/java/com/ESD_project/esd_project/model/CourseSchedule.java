package com.ESD_project.esd_project.model;

import com.ESD_project.esd_project.model.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table
public class CourseSchedule {

    @Id
    @SequenceGenerator(name = "course_sequence",sequenceName = "course_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_sequence")
    private Integer courseScheduleID;

    @ManyToOne
    @JoinColumn(name = "coursecourseCode",nullable = false)
    private Course course;
    @Column(nullable = false,unique = true)
    private Integer courseCode;
    @Column(nullable = false)
    private LocalTime time;
    @Column(nullable = false)
    private DayOfWeek day;
    @Column(nullable = false)
    private String Room;
    private String Building;

    public Integer getCourseScheduleID() {
        return courseScheduleID;
    }

    public void setCourseScheduleID(Integer courseScheduleID) {
        this.courseScheduleID = courseScheduleID;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public CourseSchedule(Integer courseScheduleID, Course course, Integer courseCode, LocalTime time, DayOfWeek day, String room, String building) {
        this.courseScheduleID = courseScheduleID;
        this.course = course;
        this.courseCode = courseCode;
        this.time = time;
        this.day = day;
        Room = room;
        Building = building;
    }

    public CourseSchedule(Course course, Integer courseCode, LocalTime time, DayOfWeek day, String room, String building) {
        this.course = course;
        this.courseCode = courseCode;
        this.time = time;
        this.day = day;
        Room = room;
        Building = building;
    }

    public CourseSchedule() {
    }
}
