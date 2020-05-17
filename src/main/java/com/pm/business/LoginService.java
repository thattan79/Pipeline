package com.pm.business;

public class LoginService {

    public boolean login(String val) {
        if ("dtp".equals(val)) {
            return true;
        }
        return false;
    }
}
