package streamapi;

public class Patient {

	public String name;
	public String disease;
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public Patient() {
		super();
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", disease=" + disease + ", age=" + age + ", amount=" + amount + "]";
	}

	public Patient(String name, String disease, int age, int amount) {
		super();
		this.name = name;
		this.disease = disease;
		this.age = age;
		this.amount = amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int amount;
}
