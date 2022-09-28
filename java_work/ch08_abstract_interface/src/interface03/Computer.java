package interface03;

public class Computer implements Searchable{
	
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색 중~~~~");
	}
	
	@Override
	public String toString() {
		return "Computer";
	}

}
