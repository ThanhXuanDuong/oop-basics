package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@Data
@AllArgsConstructor
public class StudentDB {
    private String[] name;
    private String[] id;

    public String[] getAllStudents(){
        String[] allStudents= new String[name.length];
        for (int i=0; i<name.length; i++){
            allStudents[i] = name[i] + " " + id[i];
        }
        return allStudents;
    }

    public String randomStudent(){
       int rand=  (int)( Math.random()*name.length);
       return name[rand] + " " + id[rand];
    }
    public void addStudent(String addedName,String addedId){
        name  = Arrays.copyOf(name, name.length + 1);
        name[name.length - 1] = addedName;

        id  = Arrays.copyOf(id, id.length + 1);
        id[name.length-1] = addedId;
    }

    public void removeStudent(){
        name  = Arrays.copyOf(name, name.length - 1);
        id  = Arrays.copyOf(id, id.length - 1);
    }



}
