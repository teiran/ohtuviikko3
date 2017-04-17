package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();
        System.out.println(bodyText);
        
        String url2 = "https://ohtustats2017.herokuapp.com/courses/1.json";
        
        String bodyText2 = Request.Get(url2).execute().returnContent().asString();
        System.out.println(bodyText2);

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        Courses course = mapper.fromJson(bodyText2, Courses.class);
        
        System.out.println("Kurssi: " + course.getName() + ", " + course.getTerm());
        System.out.println("");
        
        System.out.println("opiskelijanumero: " + studentNr);
        System.out.println("");
        
        int tunnit = 0;
        int tehtavat = 0;
        for (Submission submission : subs) {
            int t = submission.getWeek();
            int r = course.getWeek(t);
            submission.setTehtavienmaara(r);
            System.out.println(" " + submission);
            tehtavat += submission.getTehtavat();
            tunnit += submission.getHours();
        }
        System.out.println("");
        System.out.println("yhteensä: " + tehtavat + " tehtävää " + tunnit + " tuntia");

    }
}