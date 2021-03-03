package lesson7;

public class TestsClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(priority = 5)
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 6)
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(priority = 7)
    public void test5() {
        System.out.println("Test 5");
    }

    @Test(priority = 8)
    public void test6() {
        System.out.println("Test 6");
    }

    @Test(priority = 9)
    public void test7() {
        System.out.println("Test 7");
    }

    @Test(priority = 3)
    public void test8() {
        System.out.println("Test 8");
    }

    @Test(priority = 4)
    public void test9() {
        System.out.println("Test 9");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }


}

