package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = readPeopleFromCSV("foreign_names.csv");
        // дальнейшие действия с полученным списком людей
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static List<Person> readPeopleFromCSV(String csvFilePath) {
        List<Person> people = new ArrayList<>();

        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = new CSVReader(new InputStreamReader(in, ";"))) {
            if (reader == null) {
                throw new IOException("file not found: " + csvFilePath);
            }

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String departmentName = nextLine[3];
                double salary = Double.parseDouble(nextLine[4]);
                String birthdate = nextLine[5];
                Department department = new Department(id, departmentName);

                Person person = new Person(id, name, gender, department, salary, birthdate);
                people.add(person);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        return people;
    }
}