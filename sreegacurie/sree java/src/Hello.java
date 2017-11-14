
public class Hello {

	void show() {
		System.out.println("print");
	}

	static void getGreeting(String user) {
		System.out.println("welcome");
		System.out.println(user);
	}

	static double calculateSalary(double basicSalary, float travelAllowance, float dAllowance,
			float houseRentAllowance) {
		double netSalary;
		netSalary = basicSalary + ((travelAllowance / 100) * (basicSalary)) + ((dAllowance / 100) * (basicSalary))
				+ ((houseRentAllowance / 100) * (basicSalary));

		return netSalary;

	}

	public static void main(String[] args) {
		int accountNumber = 1029;
		// long num = 63672652870L;
		// boolean statue = true;
		// int white = 0xfff;
		double num;

		double basicSalary = 1000.0d;
		double travelAllowance = 5.3d;
		float houseRentAllowance = 5.0f;
		double profidentFund = houseRentAllowance;
		float dAllowance = 10.0f;
		// short black = (short) ~white;
		getGreeting("vishahi");
		num = calculateSalary(basicSalary,(float) travelAllowance, dAllowance, houseRentAllowance);
		num = num - profidentFund;
		System.out.println(num);
	}

}
