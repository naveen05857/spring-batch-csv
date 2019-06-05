package com.naveen.spring.batch.springbatchcsv.batch;

import com.naveen.spring.batch.springbatchcsv.model.User;
import com.naveen.spring.batch.springbatchcsv.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        log.info("Data saved for users: {}", users );
        userRepository.saveAll(users);
    }
}
