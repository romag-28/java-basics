package Selenium;

public class DDT_Class2 {

	public static void main(String[] args) throws EncryptedDocumentException , IOException{
		
		FileInputStream f1=new FileInputStream ("\xls");
		
		Workbook w1 = WorkbookFactory.create(f1);
		
		String username=w1.getSHeet("Login").getRow(1).getCell(0).getStringCellValue();
		NumberToTextConvertor.toText(w1.getSHeet("Login"))
		// TODO Auto-generated method stub

	}

}
