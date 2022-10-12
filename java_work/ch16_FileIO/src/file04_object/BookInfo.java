package file04_object;

import java.io.Serializable;

public class BookInfo extends GoodInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String author;
	private String page;

	public BookInfo() {
	}

	public BookInfo(String code, int price, String name, String author, String page) {
		super(code, price, name);
		this.author = author;
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookInfo [author=" + author + ", page=" + page + ", code=" + getCode() + ", price=" + getPrice() + ", name="
				+ getName() + "]";
	}

	// 부모 클래스가 Serializable을 구현하지 않고 자식이 했을 경우에
	// 부모의 필드까지 입출력하려면 다음 두 메소드를 오버라이딩해서 직접 처리해준다.
	// 유의점: 접근 제한자는 private이어야 함
//	private void writeObject(ObjectOutputStream oos) throws IOException {
//		oos.writeUTF(name);
//		oos.writeInt(price);
//		oos.defaultWriteObject();
//	}
//
//	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//		name = ois.readUTF();
//		price = ois.readInt();
//		ois.defaultReadObject();
//	}

}
