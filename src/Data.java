
public class Data {
	private int iid, ipin, ibal, acc, attempts, maxAttempts;
	private String sid, spin;
	private float fbal,min;
	
	public int getMaxAttempts() {
		return maxAttempts;
	}
	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
		if(acc == 1){
			setMin(500);
			setMaxAttempts(3);
		}
		else{
			setMin(0);
			setMaxAttempts(2);
		}

	}
	public void setMin(float min) {
		this.min = min;
	}
	public float getMin() {
		return min;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSpin() {
		return spin;
	}
	public void setSpin(String spin) {
		this.spin = spin;
	}
	public float getFbal() {
		return fbal;
	}
	public void setFbal(float fbal) {
		this.fbal = fbal;
	}
	
	
	
}
