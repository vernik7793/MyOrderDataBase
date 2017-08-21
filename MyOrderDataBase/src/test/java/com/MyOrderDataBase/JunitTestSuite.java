package com.MyOrderDataBase;

import com.MyOrderDataBase.repository.ListOrderRepositoryTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.MyOrderDataBase.repository.OrderRepositoryTest;
import com.MyOrderDataBase.entity.OrderTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ListOrderRepositoryTest.class,
        OrderRepositoryTest.class,
        OrderTest.class

})
public class JunitTestSuite {}