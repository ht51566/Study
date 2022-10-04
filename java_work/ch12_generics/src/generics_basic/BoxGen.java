package generics_basic;

public class BoxGen<T> {
	
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	
}
