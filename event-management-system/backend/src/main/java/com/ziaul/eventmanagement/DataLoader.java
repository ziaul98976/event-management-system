package com.ziaul.eventmanagement;

import com.ziaul.eventmanagement.user.User;
import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.repository.UserRepository;
import com.ziaul.eventmanagement.repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepo;
    private final EventRepository eventRepo;

    public DataLoader(UserRepository userRepo, EventRepository eventRepo){
        this.userRepo = userRepo; this.eventRepo = eventRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if(userRepo.findByUsername("admin").isEmpty()){
            User admin = new User("admin","admin123","ADMIN");
            userRepo.save(admin);
        }
        // sample events
        if(eventRepo.count() == 0){
            eventRepo.save(new Event("Tech Talk","Latest in AI", LocalDate.now().plusDays(7), "Auditorium A"));
            eventRepo.save(new Event("Career Fair","Meet companies", LocalDate.now().plusDays(14), "Hall 1"));
            eventRepo.save(new Event("Music Night","College band performance", LocalDate.now().plusDays(21), "Open Ground"));
        }
    }
}
