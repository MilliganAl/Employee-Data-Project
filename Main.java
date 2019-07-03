
public class Main {

	public static void main(String[] args) {
		//employees list 
		Employee johnSnow = new Employee( 1 , "09/11/1998" , "Megan" , 'A' , "McKinney", 5.0 );
		Employee cersei = new Employee( 2 , "9/3/19" , "Searcy", 'D' , "Searceman" , 6.0 );
		Employee tyrion = new Employee( 3 , "9/3/21" ,"Tyrion",'M' ,"James", 2.234 );
		EmployeeWithRegion alec = new EmployeeWithRegion( 4,"9/32/42" , "Alec" , 'M' , "Milligan" , 2.343 , 1 );
		
		System.out.println(johnSnow.toString());
		System.out.println(cersei.toString());
		System.out.println(alec.toString());
		System.out.println(tyrion.toString());
		
	}

}
