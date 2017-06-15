package com.cfy.test.t02;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class TestMain {

	public static void main(String[] args) throws Exception {
		InputStream is = TestMain.class.getResourceAsStream("/Orange.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		HSSFSheet sheet = workbook.getSheetAt(0);
		Map<String, Orange> map = new HashMap<String, Orange>();
		for (Row row : sheet) {
			if (row.getRowNum() != 0) {
				Orange orange = new Orange();
				for (int i = 0; i < row.getRowNum(); i++) {
					orange.setCode(row.getCell(0).toString());
					if (row.getCell(1).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						double numericCellValue = row.getCell(1).getNumericCellValue();
						NumberFormat nf = NumberFormat.getInstance();
						nf.setGroupingUsed(false);
						orange.setCount(Integer.valueOf(nf.format(numericCellValue)));
					}
				}
				map.put(orange.getCode(), orange);
			}
		}
		Set<String> keySet = map.keySet();
		// 遍历map
		for (String string : keySet) {
			System.out.println(map.get(string));
		}

	}

}
