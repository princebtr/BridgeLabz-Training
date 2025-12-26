//Problem Statement: Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
//Hint => 
//Write a method to generate a 6-digit OTP number using Math.random() 
//Create an array to save the OTP numbers generated 10 times
//Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false

public class OTP {
	public int[] otpGenerator() {
		int[] otps = new int[10];
		
		for (int i = 0; i < otps.length; i++) {
            otps[i] = 100000 + (int)(Math.random() * 900000);
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public boolean otpComparison(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
	
//	Main method
	public static void main(String[] args) {
		OTP otp = new OTP();
		
		int[] otps = otp.otpGenerator();
		boolean same = otp.otpComparison(otps);
		
		System.out.print("Generated OTPs are : ");
		for(int i=0; i<10; i++) {
			System.out.print(" , "+otps[i]);

		}
		System.out.println("\nAre gereated OTPs Same : "+same);

	}

}
