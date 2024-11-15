package sg.edu.nus.iss.vttp5a_day1l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5a_day1l.model.Student;

@Controller
@RequestMapping("/students")

public class StudentController {
    
    public StudentController() {
        students = new ArrayList<>();
    }

    List<Student> students;

    @ResponseBody
    @RequestMapping(path = {"", "/allStudents"}, method=RequestMethod.GET)
    public List<Student> getStudentList() throws ParseException{

        // convert a date string to epoch
        String dob = "18 Dec 1975 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob =sdf.parse(dob);
        Long epochDob = dDob.getTime();

        Student s1 = new Student(1, "Damien", "Cumming", null, "damient@nus.edu.sg", "25 HMKT 119615");
        students.add(s1);

        Student s2 = new Student(2, "Jamie", "Barley", null, "jamie@nus.edu.sg", "25 HMKT 119615");
        students.add(s2);

        Student s3 = new Student(3, "Lemon", "Java", null, "lemonj@nus.edu.sg", "25 HMKT 119615");
        students.add(s3);

        // convert epoch Long to Date
        /* Long epochTime = 188103300000L;
        Date dTime = new Date(epochTime);
        String formattedDate = sdf.parse(dTime);
        System.out.println(formattedDate);
 */
        return students;
        
    }

}
