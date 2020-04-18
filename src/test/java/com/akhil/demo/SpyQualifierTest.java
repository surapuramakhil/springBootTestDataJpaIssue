package com.akhil.demo;

import com.akhil.demo.controllers.DummyController;
import com.akhil.demo.data.repositories.PlayerRepository;
import okhttp3.OkHttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DummyController.class)
public class SpyQualifierTest {

    @Autowired
    DummyController dummyController;

    @MockBean
    PlayerRepository playerRepository;

    @SpyBean
    @Qualifier("okhttpBean")
    OkHttpClient okHttpClient;

    @Test
    public void test(){

    }


}
