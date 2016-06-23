package com.jriley;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AsynchronyEmployeeTest {

    @Test
    public void getDevHours() throws Exception {

        AsynchronyEmployee dev = new AsynchronyEmployee(AsynchronyEmployee.Role.DEV, false);

        assertEquals(40, dev.getHours());
    }

    @Test
    public void getQAHours() throws Exception {
        AsynchronyEmployee qa = new AsynchronyEmployee(AsynchronyEmployee.Role.QA, false);

        assertEquals(45, qa.getHours());
    }

    @Test
    public void getAdminHoursWithOverTime() throws Exception {
        AsynchronyEmployee admin = new AsynchronyEmployee(AsynchronyEmployee.Role.ADMIN, true);

        assertEquals(65, admin.getHours());
    }

    @Test
    public void getAdminHoursNoOverTime() throws Exception {
        AsynchronyEmployee admin = new AsynchronyEmployee(AsynchronyEmployee.Role.ADMIN, false);

        assertEquals(40, admin.getHours());
    }

    @Test
    public void getPoHours() throws Exception {
        AsynchronyEmployee po = new AsynchronyEmployee(AsynchronyEmployee.Role.PO, false);

        assertEquals(1600, po.getHours());
    }
}