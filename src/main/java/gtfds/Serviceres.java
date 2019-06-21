package gtfds;

public class Serviceres<T> {
	private String tatus;
	private T dat;
	
	public Serviceres(String tatus, T dat) {
		super();
		this.tatus = tatus;
		this.dat = dat;
	}
	public String getStatus() {
		return tatus;
	}
	public void setStatus(String tatus) {
		this.tatus = tatus;
	}
	public T getData() {
		return dat;
	}
	public void setData(T dat) {
		this.dat = dat;
	}
	public Serviceres() {
		super();
	
	}

}
