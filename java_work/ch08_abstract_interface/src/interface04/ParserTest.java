package interface04;

interface Parseable{
	void parse(String fileName);
}

//type에 따라서 알맞는 해석기(Parseable)를 제공해주는 클래스
class ParserManager{
	static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else if(type.equals("JSON")) {
			return new JSONParser();
		}else {
			return null;
		}
	}
}

class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - XML 해석 완료!!!");
	}
}

class JSONParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - JSON 해석 완료!!!");
	}
}

public class ParserTest {
	public static void main(String[] args) {
		Parseable ps = ParserManager.getParser("XML");
		System.out.println(ps);
		
		ps = ParserManager.getParser("JSON");
		System.out.println(ps);
	}
}
