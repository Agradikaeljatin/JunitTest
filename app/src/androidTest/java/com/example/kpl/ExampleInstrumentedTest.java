package com.example.kpl;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    /*
       Test case 1:
       Memeriksa apakah aplikasi berjalan dalam konteks yang benar.
       Expected Output: Nama package sesuai dengan "com.example.simpleapp"
    */
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.kpl", appContext.getPackageName());
    }

    /*
       Test case 2:
       Memeriksa apakah objek Calculator dapat dibuat dalam konteks Android.
       Expected Output: Tidak terjadi error saat instansiasi
    */
    @Test
    public void calculator_canBeInstantiated() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }
}