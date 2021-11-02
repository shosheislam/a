package com.Pdf;

import com.TestBase.Base;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenaratPdf extends Base {
    public static void main(String[] args) throws DocumentException, IOException {
        Chrome_launch();
        OpenUrl("https://demo.opencart.com/");
        CreatPdf("NewPagePdf");


    }
    public static void CreatPdf(String name) throws IOException, DocumentException {
        byte[] input=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Document doc=new Document();
        String Output="./src/main/PDF/"+name+".pdf";
        FileOutputStream fs=new FileOutputStream(Output);
        PdfWriter Writer=PdfWriter.getInstance(doc,fs);
       Writer.open();
       doc.open();
       Image img=Image.getInstance(input);
       img.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);
       doc.add(img);
       doc.add(new Paragraph(""));
       doc.close();
       Writer.close();
       System.out.println("Pdf");

    }
}
