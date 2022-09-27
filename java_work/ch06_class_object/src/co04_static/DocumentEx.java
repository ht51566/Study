package co04_static;

class Document {
	// 클래스 변수
	static int count = 0;
	static int totalCount = 0;
	// 인스턴스 변수
	String title;

	public Document() {
		this("제목 없음 " + ++count);
		//System.out.println(++count);
	}

	public Document(String title) {
		totalCount++;
		this.title = title;
		System.out.println("문서 (" + this.title + " ) 생성 완료!");
	}

}

public class DocumentEx {
	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document("dream");
		Document doc3 = new Document("영웅");
		Document doc4 = new Document();
		Document doc5 = new Document();
		System.out.println("총 발간 부수: " + Document.totalCount);
		
	}
}
