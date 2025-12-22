package assignment;
import java.util.HashSet;
import java.util.Set;
public class EmployeesHashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> Team_A = new HashSet<>();
		Set<String> Team_B = new HashSet<>();
		Set<String> Team_Unique = new HashSet<>(Team_A);
		Set<String> Team_Common = new HashSet<>(Team_A);
		Team_A.add("Suri");
		Team_A.add("Poori");
		Team_A.add("Kisshor");
		Team_A.add("Rajan");
		Team_A.add("Logan");
		System.out.println("Employees from team A are : " + Team_A);
		Team_B.add("Suri");
		Team_B.add("Ganesan");
		Team_B.add("Balan");
		Team_B.add("Rolan");
		Team_B.add("Kisshor");
		System.out.println("Employees from team B are : " + Team_B);
		for(String i : Team_A) {
			for(String j : Team_B) {
				if(i.equals(j)) {
						Team_Common.add(i);
				}}}
		System.out.println("Common employees"
				+ " from both the teams are :" + Team_Common);
		Team_Unique.addAll(Team_B);
		Team_Unique.addAll(Team_A);
		Team_Unique.removeAll(Team_Common);
		System.out.println("Unique employees "
				+ "from both the teams are :" + Team_Unique);
		
		
	}

}
