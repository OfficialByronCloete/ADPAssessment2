package cput.ac.za;

import org.junit.*;

import static org.junit.Assert.*;

public class NewClassTest {

    private NewClass calc;

    @Before
    public void setUp() throws Exception {
        calc = new NewClass();
    }

    //Question 1
    @Test
    public void testEquality(){
        NewClass n = new NewClass();
        NewClass p = new NewCLass();
        NewClass b = n;

        Assert.assertEquals(n, b);
    }

    //Question 2
    @Test
    public void testIdentity(){
        int res = calc.addNum(2, 2);
        assertSame(4, res);
    }

    //Question 3
    @Test
    public void testFail(){
        fail("Failed Test");
    }

    //Question 4
    @Test (timeout = 100)
    public void timeOut(){
        int res = calc.addNum(2,2);
        assertSame(4, res);
    }


    //Question 5
    @Ignore
    @Test
    public void testDisable(){
        int res = calc.addNum(2,2);
        assertSame(4, res);
    }

    @After
    public void tearDown() throws Exception {
    }
}