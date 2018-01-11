package com.github.eric.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

	/*循环遍历中不能移除元素*/
	@Test
	public void contextLoads() {
		List<String> a = new ArrayList<>();
		a.add("1");
		a.add("2");

		Iterator<String> iterator = a.iterator();

/*		for (String temp : a){
			if("2".equals(temp)){
				a.remove(temp);
			}
		}*/

		while (iterator.hasNext()) {
			String temp = iterator.next();
			if ("2".equals(temp)) {
				iterator.remove();
			}
		}
	}
}
