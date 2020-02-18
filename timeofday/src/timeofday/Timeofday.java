package timeofday;

/**
 * instances of this class store a time of day
 * 
 * @invar The hours are between0 and 23
 * 	|0<= gethours() && gethours() <= 23
 * @invar The minutes are in between 0 and 59
 * 	|0<= getminutes() && getminutes() <= 59
 * 
 *
 */

public class Timeofday {
	/**
	 * @invar minutessincemidnight is between 0 and 24*60(exclusive)
	 * 	| 0 <= minutessincemidnight && minutessincemidnight < 24*60
	 */
	private int minutessincemidnight;
	
	public int gethours() {
		return minutessincemidnight / 60;
		}
	public int getminutes() {
		return minutessincemidnight % 60;
		}
	/**
	 * Set this object's hours
	 * @pre the given hours are between 0 and 23
	 * 	|0<= hours && hours <= 23
	 * @post this object's hours equals the given hours
	 * 	| gethours() == hours
	 * @post This object's minutes have remained unchanged
	 * 	| getminutes() == old(getminutes()
	 */
	public void sethours(int hours) {
		
		this.minutessincemidnight = getminutes() + 60*hours;
		}
	/**
	 * sets this object's minutes
	 * @pre the given minutes are between 0 and 259
	 * 	|0<= hours && hours <= 59
	 * @post this object's minutes equals the given minutes
	 * 	| getminutes() == minutes
	 * @post This object's hours have remained unchanged
	 * 	| gethours() == old(gethours()
	 */
	public void setminutes( int minutes) {
		
		this.minutessincemidnight = gethours()*60 + minutes;
		}

	

}
