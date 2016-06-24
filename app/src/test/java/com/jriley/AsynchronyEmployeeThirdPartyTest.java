package com.jriley;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class AsynchronyEmployeeThirdPartyTest {

    @Test
    public void thisTestRepresentsThirdPartyUsage() throws Exception {
        //you cannot change this test from this point on. it is used to represent backwards compatibility.

        try {
            Class<?> asynchronyEmployee = Class.forName("com.jriley.AsynchronyEmployee");
            Method getHours = asynchronyEmployee.getMethod("getHours");
            assertTrue(Modifier.isPublic(getHours.getModifiers()));
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            fail("you can not change the signature of this method for backwards compatibility.");
            e.printStackTrace();
        }
    }
}