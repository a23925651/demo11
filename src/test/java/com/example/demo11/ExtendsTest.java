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
//		son.setName("��l");
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
//		// ���M���^�ӬO�����O�A��new�X����ҬO�l���O�A�]���|����l���O����@�A���S�w�q�b�����O������k�L�k�I�s
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
//		// ���s�w�qflying()����k
//		// �إ߷s����Үɪ����[�W�j�A���õ����s����@���e�A�s����@���e�u����o�@��
//		Bird bird2 = new Bird() {
//			@Override
//			public void flying() {
//				System.out.println("�³��C��");
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
