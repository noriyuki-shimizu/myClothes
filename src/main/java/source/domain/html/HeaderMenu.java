package source.domain.html;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HeaderMenu {

	public static void hoge() {
		try {
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docbuilder = dbfactory.newDocumentBuilder(); // DocumentBuilderインスタンス
			Document document = docbuilder.newDocument(); // Documentの生成

			/*
			 * root要素として ul要素を生成
			 */
			Element root = document.createElement("ul");
			// classを振る
			root.setAttribute("class", "nav");

			// liの数
			int limit = 5;

			// li要素作成
			for (int i = 1; i <= limit; i++) {
				Element li = document.createElement("li");
				if (i % 2 == 0) {
					li.setAttribute("class", "even");
				} else {
					li.setAttribute("class", "odd");

				}
				// そんな、気持ちの何パーセントも練習が、足りないけど！
				li.setTextContent("きゃりーぱみゅぱみゅ可愛い");
				// 子要素に追加
				root.appendChild(li);
			}

			/*
			 * DOMオブジェクトを文字列として出力
			 */
			StringWriter sb = new StringWriter();
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer();
			// HTML形式で出力する（XMLのままだとXML宣言がつく）
			transformer.setOutputProperty(OutputKeys.METHOD, "html");
			// インデントオン、かつインデントのスペース数を決める
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			transformer.transform(new DOMSource(root), new StreamResult(sb));

			System.out.println(sb.toString());

		} catch (ParserConfigurationException e) {
			// 重大な構成エラー catch ブロック
			e.printStackTrace();
		} catch (TransformerException e) {
			// 変換処理中に発生した例外 catch ブロック
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		hoge();
	}

}
