package com.ques5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(12, "Sanket", "sanket@gmail.com", "123454", new Address("MH", "Pune", "443301")));
		studentList
				.add(new Student(13, "Akash", "akash@gmail.com", "123432344", new Address("Bihar", "Patna", "442201")));
		studentList.add(new Student(14, "bachu", "bachu@gmail.com", "123454", new Address("MH", "Mumbai", "445501")));
		studentList.add(new Student(15, "Rushi", "rushi@gmail.com", "12535454", new Address("MH", "Nashik", "449901")));
		studentList.add(new Student(16, "xyz", "xyz@gmail.com", "12232354", new Address("MH", "Nagpur", "443561")));

		FileOutputStream myFileOutputStream = new FileOutputStream("studentdata.txt");

		ObjectOutputStream myObjectOutputStream = new ObjectOutputStream(myFileOutputStream);

		myObjectOutputStream.writeObject(studentList);
		myObjectOutputStream.flush();
		myObjectOutputStream.close();

		System.out.println("Serialization done");

	}

}
