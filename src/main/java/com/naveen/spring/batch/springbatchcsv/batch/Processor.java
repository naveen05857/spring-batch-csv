package com.naveen.spring.batch.springbatchcsv.batch;

import com.naveen.spring.batch.springbatchcsv.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operation");
        DEPT_NAMES.put("003", "Accounts");
    }

    @Override
    public User process(User user) {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        return user;
    }
}
