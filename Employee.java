/**
 * This Employee class keeps track
 * of Basic Employee information
 *  @author Alec M. Milligan 
 * 
 *
 */
public class Employee extends Object {
	
	private int id;
	private String dateOfBirth;
	private String firstName;
	private char middleInital;
	private String lastName;
	private double salary;
	private static int employeeCount;
	
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id=id;
		//	if(this.id<0) {
		//		id=0;
		//	}
			
			employeeCount++;
			
			
				
		

			
}
		/**
		 * @return the dateOfBirth
		 */
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		/**
		 * @param dateOfBirth the dateOfBirth to set
		 */
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @return the middleInital
		 */
		public char getMiddleInital() {
			return middleInital;
		}
		/**
		 * @param middleInital the middleInital to set
		 */
		public void setMiddleInital(char middleInital) {
			this.middleInital = middleInital;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	
	/**
	 * 
	 * @param id
	 */
		public  Employee (int id) {
			this.id=id;
			employeeCount++;
		}
		/**
		 * 
		 * @param id
		 * @param dateOfBirth
		 */
		public  Employee (int id, String dateOfBirth) {
			this(id);
			this.dateOfBirth=dateOfBirth; 
			
		}
		/**
		 * Employee constructor 
		 * @param id int holds employee identification number.
		 * @param dateOfBirth String holds employee date of birth
		 * @param firstName String holds employee First name
		 * @param middleInitial String
		 * @param lastName String holds employees last name
		 * @param salary double holds employees value salary information
		 */
		public Employee (int id, String dateOfBirth, String firstName, char middleInitial, String lastName, double salary) {
			
			this(id,dateOfBirth);
			if(id<0) {
				this.id=0;
			}
			
			this.firstName = firstName;
			this.middleInital = middleInitial;
			this.lastName = lastName;
			this.salary = salary;
		
		}
		/**
		 * converts the content of t he employee class to a string in a meaningful way
		 * @return a <code> String </code> representation of this employee object 
		 */
		@Override
		public String toString () {
			
			return String.format( "%n %n id= %d %n Date of Birth = %s %n First Name = %s %n Middle Inital = %c %n Last Name = %s %n Salary = %f " , id, dateOfBirth, firstName, middleInital , lastName , salary );
		}
		
}
 	

