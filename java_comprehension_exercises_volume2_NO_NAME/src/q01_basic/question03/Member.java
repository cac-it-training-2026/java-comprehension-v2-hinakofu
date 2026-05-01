package q01_basic.question03;

class Member {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {
	}

	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public void showMember() {
		if (name == null) {
			System.out.println("---SHOW DATA(NULL)---");
		} else {
			System.out.println("---SHOW DATA(Miura)--- ");
		}

		System.out.println("***MEMBER DATA*** ");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("***************** ");

	}
}
