package com.imoc.sm.service;

import com.imoc.sm.entity.Staff;

public interface SelfService {
    Staff login(String account,String password);
    void changePassword(Integer id,String password);
}
