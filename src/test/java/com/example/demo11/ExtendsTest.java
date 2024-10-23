package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {

    @Test
    public void testObjectCreation() {
    	
    	Submarine submarine=new Submarine();
    	
    	submarine.diving();
    	submarine.move();
    	
    }
}
    
//    public void testObjectCreation() {
//        Car car = new Car();
//        car.run();  // Car[model=Default Model]
//
//        Person person = new Person();
//        person.run();  // Person[name=John Doe]
//
//        Human human = new Human();
//        human.run(); // Human[name=Person[name=John Doe], age=30]
//    }
//}




//	public void fsTest() {
//		Son son = new Son();
//		son.setName("兒子");
//		son.playball();
//		son.walk();
//	}

//	public void animalTest() {
//		Animal ani= new Animal();
//		ani.setName("Ani");
//		ani.eat();
//		ani.sleep();
//	}
//	public void birdTest() {
//		Bird bird = new Bird();
//		bird.setName("Bird");
//		bird.eat();
//		bird.sleep();
//		bird.flying();
//	}
//
//	public void birdTest2() {
//		// 雖然接回來是父類別，但new出的實例是子類別，因此會執行子類別的實作，但沒定義在父類別中的方法無法呼叫
//		Animal bird = new Bird();
//		bird.eat();
//		bird.sleep();
//		// bird.flying()
//	}
//
//	@Test
//	public void bird4() {
//		Bird bird = new Bird();
//
//		bird.flying();
//		// 重新定義flying()的方法
//		// 建立新的實例時直接加上大括號並給予新的實作內容，新的實作內容只執行這一次
//		Bird bird2 = new Bird() {
//			@Override
//			public void flying() {
//				System.out.println("笨鳥慢飛");
//			}
//		};
//		bird2.flying();
//
//	}
//
//}
////	
//	
//	
//	
//}
