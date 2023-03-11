package com.pawelbugiel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunesList;
	private Random random = new Random();
	
//	@Override
//	public String getFortune() {
//		int listSize = getListFormFile().size();
//		int tempRandom = random.nextInt(listSize);
//		return getListFormFile().get(tempRandom);
//	}

//	private List<String> getListFormFile() {
//		List<String> tempList = new ArrayList<>();
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("D:\\jp\\jp23\\mmarch_23\\maven_demo_annotation\\src\\main\\resources\\fortune.file"));
//			try {
//				String tempLine;
//				while((tempLine = br.readLine()) != null) {
//				tempList.add(tempLine);
//				}
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return tempList;
//	}
	
	@Override
	public String getFortune() {
		int listSize = this.fortunesList.size();
		int tempRandom = random.nextInt(listSize);
		return this.fortunesList.get(tempRandom);
	}

	
	@PostConstruct
	private void passFortunesFromFileToClassCollectionField() {
		System.out.println("FileFortuneService PostConstruct method called .oO");
		this.fortunesList = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\jp\\jp23\\mmarch_23\\maven_demo_annotation\\src\\main\\resources\\fortune.file"));
			try {
				String tempLine;
				while((tempLine = br.readLine()) != null) {
					this.fortunesList.add(tempLine);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
