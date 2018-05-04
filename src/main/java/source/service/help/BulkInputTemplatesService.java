package source.service.help;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import source.common.PlatformUtils;

/**
 * 服情報一括取り込みテンプレートのダウンロードを行うサービスクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Service
public class BulkInputTemplatesService {
	
	@Autowired
	private HttpServletResponse response;
	
	/**
	 * 使用しているPCの文字コードをチェックする.
	 * @return 使用しているPCでの文字コード
	 */
	public String checkCcsid() {
		// ccsidのチェック
		if(PlatformUtils.isLinux() ||
				PlatformUtils.isMac() ||
				PlatformUtils.isSunOS()) {
			return "UTF-8";
		} else if(PlatformUtils.isWindows()) {
			return "Shift_JIS";
		} else {
			// 利用のOSはダウンロードに対応していません。
			return null;
		}
	}
	
	/**
	 * 服情報一括取り込み用テンプレートのダウンロード処理実行.
	 * @return 正常：0、異常：-1
	 */
	public int clothesInfoCsvDownload() {

		// ccsidの取得
		String ccsid = this.checkCcsid();
		// 異常が検出されたら、処理を終了する
		if(ccsid == null) {
			return -1;
		}
		
		// 出力するCSVファイルのヘッダを設定
		String outputString = "";
		
		outputString += "No.,"; 
		outputString += "ブランド名　※必須,"; 
		outputString += "ジャンルCD　※必須,"; 
		outputString += "店CD ※必須,"; 
		outputString += "画像CD ※必須,"; 
		outputString += "金額,"; 
		outputString += "購入日,"; 
		outputString += "詳細,"; 
		outputString += "\r\n"; 
		
		// CSVファイルを出力する
		return this.bulkInputOutPut(ccsid, "clothesInfoBulkInput.csv", outputString);
	
	}
	
	/**
	 * お店情報一括取り込み用テンプレートのダウンロード処理実行.
	 * @return 正常：0、異常：-1
	 */
	public int shopInfoCsvDownload() {
		
		// ccsidの取得
		String ccsid = this.checkCcsid();
		// 異常が検出されたら、処理を終了する
		if(ccsid == null) {
			return -1;
		}
		
		// 出力するCSVファイルのヘッダを設定
		String outputString = "";
		
		outputString += "No.,"; 
		outputString += "お店名　※必須,"; 
		outputString += "お店CD　※必須,"; 
		outputString += "郵便番号,"; 
		outputString += "住所,"; 
		outputString += "お店URL,"; 
		outputString += "\r\n"; 
		
		// CSVファイルを出力する
		return this.bulkInputOutPut(ccsid, "shopInfoBulkInput.csv", outputString);
		
	}
	
	/**
	 * 画像情報一括取り込み用テンプレートのダウンロード処理実行.
	 * @return 正常：0、異常：-1
	 */
	public int imageInfoCsvDownload() {
		
		// ccsidの取得
		String ccsid = this.checkCcsid();
		// 異常が検出されたら、処理を終了する
		if(ccsid == null) {
			return -1;
		}
		
		// 出力するCSVファイルのヘッダを設定
		String outputString = "";
		
		outputString += "No.,"; 
		outputString += "画像CD,"; 
		outputString += "画像パス,"; 
		outputString += "\r\n"; 
		
		// CSVファイルを出力する
		return this.bulkInputOutPut(ccsid, "imageInfoBulkInput.csv", outputString);
		
	}
	
	/**
	 * CSVファイルを出力する.
	 * @param ccsid 使用しているPCでの文字コード
	 * @param outputString ヘッダ項目
	 * @return 正常：0,異常：-1
	 */
	public int bulkInputOutPut(String ccsid, String fileName, String outputString) {
		// 文字コードと出力するCSVファイル名を設定
		response.setContentType(MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE + ";charset=" + ccsid);
		response.setHeader("Content-Disposition", "attachment; "
				+ "filename=\"" + fileName + "\"");
		
		try (PrintWriter pw = response.getWriter()) {
			pw.print(outputString);
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
}
