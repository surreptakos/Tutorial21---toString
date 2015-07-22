class Frog {
	private String name;
	private int id;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString()
				*/
		
		
		return String.format("%-4d: %s", id, name);
	}
	
}


public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
