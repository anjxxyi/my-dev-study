package com.tj.edu.practice1;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll 실행");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach 실행");
    }

    @Test
    public void test1() {
        System.out.println("@Test1 실행");
    }
    @Test
    public void test2() {
        System.out.println("@Test2 실행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll 실행");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach 실행");
    }
}
