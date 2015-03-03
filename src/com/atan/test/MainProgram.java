package com.atan.test;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class MainProgram {

	public static void main(String [] args){
		File imageFile = new File("D:/Works/TA/OCR-java/Tess4J/eurotext.pdf");
		Tesseract instance = Tesseract.getInstance();
//		instance.setDatapath(arg0);
//		instance.setLanguage("eng");
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);

		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}
}
