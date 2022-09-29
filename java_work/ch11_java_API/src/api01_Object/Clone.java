package api01_Object;

import java.util.Arrays;

public class Clone implements Cloneable{
	
	String id;
	String name;
	
	int[] scores;

	public Clone(String id, String name, int[] scores) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
	}
	
	Clone getClone() {
		Clone cloned = null;
		try {
			cloned = (Clone) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
	//Object의 clone 메소드는 깊은 복제가 아니라 얕은 복제를 한다. 
	//따라서 id, name은 복제가 되었지만 배열은 주소가 복사되었다.
	//깊은 복제를 하기 위해선 clone 메소드 오버라이드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Clone cloned = (Clone) super.clone();
		//배열을 복제해서 복제된 객체의 필드로 넣어줌
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		return cloned;
	}

	@Override
	public String toString() {
		return "Clone [id=" + id + ", name=" + name + ", scores=" + Arrays.toString(scores) + "]";
	}
	
	
	
}
