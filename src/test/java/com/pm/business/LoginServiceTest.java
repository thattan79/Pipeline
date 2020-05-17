package com.pm.business;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class LoginServiceTest {

    @InjectMocks
    private LoginService loginService;

    public void login() {
        assertTrue(loginService.login("dtp"));
    }

}
