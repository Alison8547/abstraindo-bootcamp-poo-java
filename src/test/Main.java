package test;

import domain.BootCamp;
import domain.Course;
import domain.Dev;
import domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setName("Course Java");
        course1.setDescription("description: poo java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setName("Course Mysql");
        course2.setDescription("description: database mysql fundamentals");
        course2.setWorkload(6);

        Mentoring mentoring = new Mentoring();
        mentoring.setName("Mentoring Java");
        mentoring.setDescription("Poo java ");
        mentoring.setDate(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("BootCamp Java Developer");
        bootCamp.setDescription("description BootCamp Java Developer ");
        bootCamp.getContents().add(course1);
        bootCamp.getContents().add(course2);

        Dev dev1 = new Dev();
        dev1.setName("Alison");
        dev1.subscriberBootCamp(bootCamp);
        System.out.println("Subscriber contents Alison: " + dev1.getSubscriberContent());
        dev1.progress();
        dev1.progress();
        System.out.println("--------");
        System.out.println("Finish: "+dev1.getFinishContent());

        System.out.println();

        Dev dev2 = new Dev();
        dev2.setName("Diego");
        dev2.subscriberBootCamp(bootCamp);
        System.out.println("Subscriber contents Diego: " + dev2.getSubscriberContent());
        dev2.progress();
        System.out.println("--------");
        System.out.println("Finish: "+ dev2.getFinishContent());

        System.out.println("XP Alison: "+dev1.calcTotalXp());
        System.out.println("XP Diego: "+dev2.calcTotalXp());
    }
}
