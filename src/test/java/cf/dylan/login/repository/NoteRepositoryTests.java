package cf.dylan.login.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class NoteRepositoryTests {

    @Autowired
    private NoteRepository noteRepository;

    @Transactional
    @Test
    public void testListByEmail() {
        String email ="user10@jonghyun.cf";
        noteRepository.getList(email).forEach(note -> System.out.println(note));
    }
}
