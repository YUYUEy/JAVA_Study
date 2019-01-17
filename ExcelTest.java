package com.midea.isc.isale.wms.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.midea.isc.isale.wms.biz.StuBiz;
import com.midea.isc.isale.wms.model.Stu;
import com.midea.isc.isale.wms.param.StuParam;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcelTest {
	@Autowired
	private StuBiz stuBisz;
	@Test
	public void export() throws Exception{
		 StuParam param = new  StuParam();
		 //获取要导出到Excel的对象export-----本地创建D盘一个Excel空文件---"D:\\demo.xlsx"
		 List<Stu> export = stuBisz.export(param);
	     //ServletOutputStream outputStream = response.getOutputStream();
		 
		 OutputStream out = new FileOutputStream(new File("D:\\demo.xlsx"));
	     Workbook wb = new XSSFWorkbook();
	     Sheet sheet = wb.createSheet("sheet1");
	  // 设置表格默认列宽度为15个字节
	     sheet.setDefaultColumnWidth((short) 256);
	     sheet.setColumnWidth(0, 256*10);
	        sheet.setColumnWidth(1, 256*10);
	    	sheet.setColumnWidth(2, 256*10);
	    	sheet.setColumnWidth(3, 256*10);
	    	sheet.setColumnWidth(4, 256*15);
	    	sheet.setColumnWidth(5, 256*15);
	    	sheet.setColumnWidth(6, 256*20);
	    	sheet.setColumnWidth(7, 256*25);
	     
	     Row row1 = sheet.createRow(0);
	     Cell c0 = row1.createCell(0);
	     c0.setCellValue("sid");
	     Cell c1 = row1.createCell(1);
	     c1.setCellValue("sname");
	     Cell c2 = row1.createCell(2);
	     c2.setCellValue("age");
	     Cell c3 = row1.createCell(3);
	     c3.setCellValue("gander");
	     Cell c4 = row1.createCell(4);
	     c4.setCellValue("province");
	     Cell c5 = row1.createCell(5);
	     c5.setCellValue("tution");
	     Cell c6 = row1.createCell(6);
	     c6.setCellValue("createdBy");
	     Cell c7 = row1.createCell(7);
	     c7.setCellValue("creationDate");
	     
	     for(int i=0;i<export.size();i++){
	    	 Row rowX = sheet.createRow(i+1);
		     Cell cx0 = rowX.createCell(0);
		     cx0.setCellValue(export.get(i).getSid());
		     Cell cx1 = rowX.createCell(1);
		     cx1.setCellValue(export.get(i).getSname());
		     Cell cx2 = rowX.createCell(2);
		     cx2.setCellValue(export.get(i).getAge());
		     Cell cx3 = rowX.createCell(3);
		     cx3.setCellValue(export.get(i).getGander());
		     Cell cx4 = rowX.createCell(4);
		     cx4.setCellValue(export.get(i).getProvince());
		     Cell cx5 = rowX.createCell(5);
		     cx5.setCellValue(export.get(i).getTuition());
		     Cell cx6 = rowX.createCell(6);
		     cx6.setCellValue(export.get(i).getCreatedby());
		     Cell cx7 = rowX.createCell(7);
		     cx7.setCellValue(export.get(i).getCreationdate());
	     }
		wb.write(out);
		out.close();
	}
	
	@Test
	public void test2() throws Exception{
		FileInputStream fis = new FileInputStream(new File("D:\\demo.xlsx"));
		  Workbook wb = new XSSFWorkbook(fis);
		  Sheet sheetAt = wb.getSheetAt(0);
		  int rows = sheetAt.getPhysicalNumberOfRows();
		  System.out.println(rows);
	}
}
