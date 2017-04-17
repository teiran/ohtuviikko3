package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
    private int hours;
    private int week;
    private int tehtavienmaara;

    public String getStudent_number() {
        return student_number;
    }

    public int getHours() {
        return hours;
    }

    public void setTehtavienmaara(int tehtavienmaara) {
        this.tehtavienmaara = tehtavienmaara;
    }

    public int getWeek() {
        return week;
    }
    
    
    
    public int getTehtavat() {
        ArrayList<String> k = tehtavat();
        return k.size();
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    private ArrayList<String> tehtavat(){
        ArrayList<String> h = new ArrayList<>();
        if (a1) {
            h.add("1");
        }
        if (a2) {
            h.add("2");
        }
        if (a3) {
            h.add("3");
        }
        
        if (a4) {
            h.add("4");
        }
        if (a5) {
            h.add("5");
        }
        if (a6) {
            h.add("6");
        }
        
        if (a7) {
            h.add("7");
        }
        if (a8) {
            h.add("8");
        }
        if (a9) {
            h.add("9");
        }
        
        if (a10) {
            h.add("10");
        }
        if (a11) {
            h.add("11");
        }
        if (a12) {
            h.add("12");
        }
        
        if (a13) {
            h.add("13");
        }
        if (a14) {
            h.add("14");
        }
        if (a15) {
            h.add("15");
        }
        
        if (a16) {
            h.add("16");
        }
        if (a17) {
            h.add("17");
        }
        if (a18) {
            h.add("18");
        }
        
        if (a19) {
            h.add("19");
        }
        if (a20) {
            h.add("20");
        }
        if (a21) {
            h.add("21");
        }
        return h;
    }

    @Override
    public String toString() {
        ArrayList<String> k = tehtavat();
        String g = "";
        g += "viikko " + week +": ";
        g += "tehtyjä tehtäviä yhteensä: " + k.size() + " ";
        g += "(maksimi " + tehtavienmaara +")";
        g += ", aikaa kului " + hours + " tuntia, "; 
        g += "tehdyt tehtävät: ";
        for (String string : k) {
            g += " " + string;
        }
        return g;
    }
    
}