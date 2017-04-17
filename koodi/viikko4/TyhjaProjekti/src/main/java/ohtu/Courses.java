/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

/**
 *
 * @author tiera
 */
public class Courses {
    private String name;
    private String term;
    private int week1, week2, week3, week4, week5, week6;

    public Courses() {
    }

    public String getName() {
        return name;
    }

    public String getTerm() {
        return term;
    }

    public int getWeek(int t) {
        switch (t) {
            case 1:
                return week1;
            case 2:
                return week2;
            case 3:
                return week3;
            case 4:
                return week4;
            case 5:
                return week5;
            default:
                return week6;
        }
    }
    
    
}
