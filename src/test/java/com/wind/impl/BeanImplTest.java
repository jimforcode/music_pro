package com.wind.impl;

import junit.framework.TestCase;
import com.wind.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}