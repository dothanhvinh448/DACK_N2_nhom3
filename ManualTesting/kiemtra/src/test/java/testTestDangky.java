import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testTestDangky {
    @Test
    public void tentruoc    () {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tentruoc("");
//        assertFalse(result);
        System.out.println("khong dc de trong");
        assertFalse(result);

    }
    @Test
    public void tentruoc2() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tentruoc("@");
//        assertFalse(result);
        System.out.println("khong dc co ky tu dac biet");
        assertFalse(result);

    }
    @Test
    public void testentruoc3() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tentruoc("123");
        assertFalse(result);
        System.out.println("khong duoc phep nhap so ");

    }
    @Test
    public void testtentruoc4() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tentruoc("do");
        assertTrue(result);


    }
    @Test
    public void testtensau1() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tensau("");
        System.out.println("ten khong dc de trong");
        assertFalse(result);


    }
    @Test
    public void testtensau2() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tensau("@");
        System.out.println("ten khong duoc co ky tu dac biet");
        assertFalse(result);


    }
    @Test
    public void testtensau3() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tensau("123");
        System.out.println("ten sau khong duoc phep so");
        assertFalse(result);
    }
    @Test
    public void testtensau4() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.tensau("vinh");
        assertTrue(result);
    }
    @Test
    public void testemail1() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.email("");
        assertFalse(result);
        System.out.println("email khong duoc de trong");
    }
    @Test
    public void testemail() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.email("vinh");
        assertTrue(result);
    }
    @Test
    public void testpassword() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.password("");
        assertFalse(result);
        System.out.println("mat khau khong duoc de trong");

    }
    @Test
    public void testpassword1() {
        testDangky demo1 = new testDangky();
        boolean result = demo1.email("vinh");
        assertTrue(result);
    }




}