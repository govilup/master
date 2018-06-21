package com.lombok.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import com.lombok.exception.NameNotFoundException;
import com.lombok.pojo.Age;
import com.lombok.pojo.Person;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		calculateAge(p);
		try {
			getFullName(p);
		} catch (NameNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		displyDetails(p);
	}

	private static void displyDetails(Person p) {
		System.out.println("Person Details :");
		System.out.println("________________");
		System.out.println();
		System.out.println("Name :\t"+p.getName());
		System.out.println("Age :\t"+p.getAge().toString());
		
	}

	private static void getFullName(Person p) throws NameNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name: ");
		String firstName = br.readLine();
		System.out.println("Enter Last Name: ");
		String lastName = br.readLine();
			String name = firstName +" "+ lastName;
			if(name.isEmpty()) {
				throw new NameNotFoundException(name);
			}
			p.setName(name);
		
	}

	private static void calculateAge(Person p1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Birth Day : ");
		int day = sc.nextInt();
		System.out.println("Enter Birth Month : ");
		int month = sc.nextInt();
		System.out.println("Enter Birth Year : ");
		int year = sc.nextInt();
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		
		Period p = Period.between(birthday, today);
		Age age = new Age(p.getDays(), p.getMonths(), p.getYears());
		p1.setAge(age);
		
	}

}
