package com.ques5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		FileInputStream myFileInputStream = new FileInputStream("studentdata.txt");
		try (ObjectInputStream myObjectInputStream = new ObjectInputStream(myFileInputStream)) {
			Object objectOnly = myObjectInputStream.readObject();

			List<Student> myStudentList = (List<Student>) objectOnly;

			System.out.println(myStudentList);

			// Deserialization

			myStudentList.add(
					new Student(14, "Wilson", "wilson@gmail.com", "12343554", new Address("MH", "Mumbai", "445501")));

			FileOutputStream myFileOutputStream = new FileOutputStream("studentdata.txt");

			ObjectOutputStream myObjectOutputStream = new ObjectOutputStream(myFileOutputStream);

			myObjectOutputStream.writeObject(myStudentList);
			myObjectOutputStream.flush();
			myObjectOutputStream.close();
		}

	}
}
