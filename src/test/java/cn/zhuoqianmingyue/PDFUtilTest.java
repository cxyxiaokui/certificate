package cn.zhuoqianmingyue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

import org.junit.Test;

import com.itextpdf.text.DocumentException;

public class PDFUtilTest {
	
	@Test
	public void generatingPdfCertificate () throws MalformedURLException, FileNotFoundException, DocumentException, IOException {
		long currentDateTime = new Date().getTime();
		String imagePath = PDFUtil.class.getClassLoader().getResource("certificate.png").getPath();
		String pdfFilePath = "d:/pdf/" +currentDateTime+ ".pdf";
		PDFUtil pdfUtil = new PDFUtil();
		pdfUtil.openDocumnet(pdfFilePath)
				.addImage(imagePath, 0, 400)
				.addDateContent(330,462,null)
				.addContent("张三",85,655,null)
				.close();
	}
}
