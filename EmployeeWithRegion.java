/**
 * This Employee class keeps track of Basic Employee information for an employee
 * with region
 * 
 * @author Alec M. Milligan
 * 
 *
 */
public class EmployeeWithRegion extends Employee {
	private int region;

	/**
	 * @param int id
	 */

	// "super"(compared to "this"), calls the corresponding constructor in the
	// superclass
	public EmployeeWithRegion(int id) {
		super(id);

	}

	/**
	 * @param id
	 * @param region
	 */
	public EmployeeWithRegion(int id, int region) {
		super(id);
		this.region = region;
	}

	public EmployeeWithRegion(int id, String dateOfBirth, int region) {
		super(id, dateOfBirth);
		this.region = region;
	}

	/**
	 * EmployeeWithRegion constructor
	 * 
	 * @param id            int holds employee identification number.
	 * @param dateOfBirth   String holds employee date of birth
	 * @param firstName     String holds employee First name
	 * @param middleInitial String
	 * @param lastName      String holds employees last name
	 * @param salary        double holds employees value salary information
	 */

	public EmployeeWithRegion(int id, String dateOfBirth, String firstName, char middleInitial, String lastName,
			double salary, int region) {
		super(id, dateOfBirth, firstName, middleInitial, lastName, salary);
		this.region = region;
		setId(id);
	}

	/**
	 * @return the region
	 */
	public int getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(int region) {

		this.region = region;

	}

	@Override
	public String toString() {
		return super.toString() + String.format("\n region = %d", region);

	}

	@Override
	/**
	 * @param id
	 */
	public void setId(int id) {

		if (id < 0) {

			super.setId(0);

			System.out.println(id);

		}

	}
}
