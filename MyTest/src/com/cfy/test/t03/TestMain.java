package com.cfy.test.t03;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestMain extends TestCase {

	public void testXml() throws Exception {
		List<CustomerInfo> list = new ArrayList<CustomerInfo>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			CustomerInfo customerInfo = new CustomerInfo();
			customerInfo.setCustomerCode("code" + i);
			customerInfo.setCustomerName("name" + i); 
			customerInfo.setAppleOnHands(random.nextInt(50));
			customerInfo.setOrangeOnHands(random.nextInt(30));
			customerInfo.setTotalAmount(customerInfo.getAppleOnHands() + customerInfo.getOrangeOnHands());
			list.add(customerInfo);
		}

		Collections.sort(list, new Comparator<CustomerInfo>() {
			@Override
			public int compare(CustomerInfo o1, CustomerInfo o2) {

				return o1.getTotalAmount() - o2.getTotalAmount();
			}
		});

		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("customer");
		for (CustomerInfo customerInfo : list) {
			Element info = root.addElement("CustomerInfo");
			Element customerCode = info.addElement("CustomerCode");
			customerCode.setText(customerInfo.getCustomerCode());
			Element customerName = info.addElement("CustomerName");
			customerName.setText(customerInfo.getCustomerName());
			customerName.addAttribute("AppleOnHands", customerInfo.getAppleOnHands() + "");
			customerName.addAttribute("OrangeOnHands", customerInfo.getOrangeOnHands() + "");
			Element totalAmount = info.addElement("TotalAmount");
			totalAmount.setText(customerInfo.getTotalAmount() + "");
		}

		OutputFormat format = new OutputFormat("  ", true);
		format.setEncoding("utf-8");
		FileOutputStream fos = new FileOutputStream("D:\\result.xml");
		XMLWriter xmlWriter = new XMLWriter(fos, format);
		xmlWriter.write(document);
		xmlWriter.close();
		fos.close();
	}
	private void testException() {
		int s = 8/0 ;
		double d = Double.valueOf(s+"");
	}

	public static void main(String[] args) {

		TestRunner.run(TestMain.class);
	}
}
