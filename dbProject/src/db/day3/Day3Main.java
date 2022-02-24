package db.day3;

import java.util.List;

import db.vo.Custom;
import db.vo.Product;

public class Day3Main {

	public static void main(String[] args) {
		
		Custom momo = CustomDao.selectOne("twice");
		System.out.println(momo);
//		
//		SingletonObj obj = SingletonObj.getInstance();
//		obj.print();
//		
//		SingletonObj obj2 = SingletonObj.getInstance();
//		System.out.println(obj == obj2);
		//SingletonObj 객체는 오직 1개입니다. 같은 객체를 참조합니다. -> 결과 "참"
		
//		ProductDao prodao = ProductDao.getInstance();
//		
//		List<Product> list = prodao.selectBySaleAll();
//		
//		for(Product vo : list)
//			System.out.println(vo);
		
	}
}
