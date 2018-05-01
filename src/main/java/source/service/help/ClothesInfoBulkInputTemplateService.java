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
public class ClothesInfoBulkInputTemplateService {
	
	@Autowired
	private HttpServletResponse response;
	
	/**
	 * ダウンロード処理実行.
	 * @return 処理の結果を返す(正常：0、異常：-1)
	 */
	public int csvDownload() {

		// ccsidの取得
		String ccsid;
		if(PlatformUtils.isLinux() ||
				PlatformUtils.isMac() ||
				PlatformUtils.isSunOS()) {
			ccsid = "UTF-8";
		} else if(PlatformUtils.isWindows()) {
			ccsid = "Shift_JIS";
		} else {
			// 利用のOSはダウンロードに対応していません。
			return -1;
		}
		
		String outputString = "";
		
		outputString += "No.,"; 
		outputString += "ブランド名　※必須,"; 
		outputString += "ジャンルCD　※必須,"; 
		outputString += "店CD ※必須,"; 
		outputString += "金額,"; 
		outputString += "購入日,"; 
		outputString += "詳細,"; 
		outputString += "\r\n"; 
		
		// 文字コードと出力するCSVファイル名を設定
		response.setContentType(MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE + ";charset=" + ccsid);
		response.setHeader("Content-Disposition", "attachment; "
				+ "filename=\"clothesInfoBulkInput.csv\"");
		
		try (PrintWriter pw = response.getWriter()) {
			pw.print(outputString);
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	
		return 0;
	}
	
}
