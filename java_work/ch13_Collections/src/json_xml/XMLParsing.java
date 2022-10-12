package json_xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParsing {
    
    public static void main(String[] args) {
        
        int page = 1;
        while(true) {
         // parsing할 url 지정(API 키 포함해서)
            String url = "http://finlife.fss.or.kr/finlifeapi/annuitySavingProductsSearch.xml?auth=1db6e257b5ad61c5241a1bc1c9bc863b&topFinGrpNo=050000&pageNo="
                    + page;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(url);
//                System.out.println(document);
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                
             // 파싱할 tag
                NodeList nList = doc.getElementsByTagName("baseinfo");
                
                for(int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    
                    if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        System.out.println("금융사  : " + getTagValue("kor_co_nm", eElement));
                        System.out.println("상품 코드  : " + getTagValue("fin_prdt_cd", eElement));
                        System.out.println("상품명 : " + getTagValue("fin_prdt_nm", eElement));
                        System.out.println("연평균 수익률  : " + getTagValue("avg_prft_rate", eElement));
                        System.out.println("공시 이율  : " + getTagValue("dcls_rate", eElement));
                        System.out.println("-----------------------------------------------");
                    }
                }
                
                page++;
                System.out.println("page: " + page);
                if(page > 10) {
                    break;
                }
                
            } catch (ParserConfigurationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SAXException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
 // tag값의 정보를 가져오는 메소드
    private static String getTagValue(String tag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue == null)
            return null;
        return nValue.getNodeValue();
    }
}
