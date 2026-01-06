//Problem Statement: Hospital Patient Management
//Description: Design a system to manage patients in a hospital:
//Create an abstract class Patient with fields like patientId, name, and age.
//Add an abstract method calculateBill() and a concrete method getPatientDetails().
//Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
//Implement an interface MedicalRecord with methods addRecord() and viewRecords().
//Use encapsulation to protect sensitive patient data like diagnosis and medical history.
//Use polymorphism to handle different patient types and display their billing details dynamically.

import java.util.*;

interface MedicalRecord {
	void addRecord(String record);
	void viewRecords();
}

abstract class Patient{
	private int patientId;
	private String name;
	private int age;
//	Constructor
	Patient(int patientId, String name, int age){
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
//	Setter Methods
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	Getter Methods
	public int getPatientId() {
		return patientId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
//	Concrete Method
	void getPatientDetails() {
		System.out.println("Patient Id : "+patientId);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
//	Abstract Method
	abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord{
	private String diagnosis;
	ArrayList<String> records = new ArrayList<>();
	double roomChargePerDay = 2000;
	int daysAdmitted;
	InPatient(int patientId, String name, int age, int daysAdmitted){
		super(patientId,name,age);
		this.daysAdmitted = daysAdmitted;
	}
	@Override
	double calculateBill() {
		return roomChargePerDay * daysAdmitted;
	}
	@Override
	public void addRecord(String record) {
		records.add(record);
	}
	@Override
	public void viewRecords() {
		System.out.println("In-Patient Medical Records : "+records);
	}
}

class OutPatient extends Patient implements MedicalRecord{
	private String diagnosis;
	ArrayList<String> records = new ArrayList<>();
	double consultationFee = 500;
	OutPatient(int patientId, String name, int age){
		super(patientId,name,age);
	}
	@Override
	double calculateBill() {
		return consultationFee;
	}
	@Override
	public void addRecord(String record) {
		records.add(record);
	}
	@Override
	public void viewRecords() {
		System.out.println("Out-Patient Medical Records : "+records);
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<>();
		
		Patient p1 = new InPatient(101,"Rohit",45,5);
		Patient p2 = new OutPatient(102,"Anjali",30);
		
		patients.add(p1);
		patients.add(p2);
		
		for(Patient p : patients) {
			p.getPatientDetails();
			double bill = p.calculateBill();
			System.out.println("Total Bill : "+bill);
			
			if(p instanceof MedicalRecord) {
				MedicalRecord m = (MedicalRecord) p;
				m.addRecord("Initial Diagnosis Done");
				m.addRecord("Treatment Ongoing");
				m.viewRecords();
			}
		}
	}
}
