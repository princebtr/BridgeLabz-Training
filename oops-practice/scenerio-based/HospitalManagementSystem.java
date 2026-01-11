//Problem Statement: Hospital Patient Management System (CRUD)
//● Concepts: Patient, Doctor, Bill classes.
//● OOP: Encapsulation (Properties), Abstraction (Interface IPayable), Inheritance
//(InPatient, OutPatient : Patient), Polymorphism (DisplayInfo).

import java.util.*;
public interface HospitalManagementSystem {
	void iPayable();
}

class Patient {
	static List<String> patients = new ArrayList<>();

	int patientID;
	String patientName;
	int age;
	String gender;
	String disease;

	Patient(int patientId, String patientName, int age, String gender, String disease) {
		this.patientID = patientId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
	}

	void displayInfo() {
		String temp = "Patient ID : " + patientID +" | Name : " + patientName +" | Age : " + age +" | Gender : " + gender +" | Disease : " + disease;

		patients.add(temp);
		System.out.println(temp);
		System.out.println("Patient Registered Successfully!");
	}

	static void displayPatients() {
		if (patients.isEmpty()) {
			System.out.println("No Patient Available");
		} else {
			for (String p : patients) {
				System.out.println(p);
			}
		}
	}
}

class InPatient extends Patient implements HospitalManagementSystem {
	int roomNumber;
	int daysAdmitted;
	int dailyCharge = 1000;

	InPatient(int patientId, String patientName, int age, String gender,
			  String disease, int roomNumber, int daysAdmitted) {
		super(patientId, patientName, age, gender, disease);
		this.roomNumber = roomNumber;
		this.daysAdmitted = daysAdmitted;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Room No : " + roomNumber);
		System.out.println("Days Admitted : " + daysAdmitted);
		iPayable();
	}

	@Override
	public void iPayable() {
		int total = daysAdmitted * dailyCharge;
		System.out.println("Total InPatient Bill : ₹" + total);
	}
}

class OutPatient extends Patient implements HospitalManagementSystem {
	int fee;

	OutPatient(int patientId, String patientName, int age, String gender,
			   String disease, int fee) {
		super(patientId, patientName, age, gender, disease);
		this.fee = fee;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		iPayable();
	}

	@Override
	public void iPayable() {
		System.out.println("Consultation Fee : ₹" + fee);
	}
}

class Doctor {
	static List<String> doctors = new ArrayList<>();

	int doctorID;
	String doctorName;
	String specialization;
	String gender;
	int experience;
	int fee;

	Doctor(int doctorID, String doctorName, String specialization, String gender, int experience,int fee) {
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.gender = gender;
		this.experience = experience;
		this.fee = fee;
	}

	void displayInfo() {
		String temp ="Doctor ID : " + doctorID +" | Name : " + doctorName +" | Specialization : " + specialization +" | Gender : " + gender +" | Experience : " + experience + " years";

		doctors.add(temp);
		System.out.println(temp);
		System.out.println("Doctor Added Successfully!");
	}

	static void displayDoctors() {
		if (doctors.isEmpty()) {
			System.out.println("No Doctor Available");
		} else {
			for (String d : doctors) {
				System.out.println(d);
			}
		}
	}
}

class HospitalApp {
	public static void main(String[] args) {
		Doctor d1 = new Doctor(1,"Ragav","Orthology","Male",5,5000);
		Doctor d2 = new Doctor(2,"Sara","Cardiology","female",2,8000);
		
		Patient p1 = new Patient(101, "Amit", 30, "Male", "Fever");
		p1.displayInfo();

		System.out.println();

		InPatient ip = new InPatient(102, "Riya", 25, "Female",
				"Fracture", 201, 5);
		ip.displayInfo();

		System.out.println();

		OutPatient op = new OutPatient(103, "Rahul", 40, "Male",
				"Diabetes", 500);
		op.displayInfo();

		Patient.displayPatients();
	}
}
