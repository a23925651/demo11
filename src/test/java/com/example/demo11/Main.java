package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        // �إ� PersonInfo ����ê�l�ƩҦ��ݩ�
        PersonInfo person = new PersonInfo("B001", "ABC Bank", "Main Branch", 30, "New York");

        // ���ҿ�X
        System.out.println("ID: " + person.id);
        System.out.println("Name: " + person.name);
        System.out.println("Branch: " + person.branchTitle);
        System.out.println("Age: " + person.age);
        System.out.println("City: " + person.city);
    }
}
