package toyproject.loobie.domain.user;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import toyproject.loobie.domain.news.News;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest @Transactional
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup(){

    }

    @Test
    public void 회원저장_이메일불러오기(){
        //given
        String name = "test";
        String email = "test@naver.com";

        User user = User.builder()
                .name(name)
                .email(email)
                .role(Role.USER)
                .build();

        userRepository.save(user);

        //when
        List<User> userList = userRepository.findByEmail(email);

        //then
        User getUser = userList.get(0);
        assertThat(getUser.getName()).isEqualTo(name);
        assertThat(getUser.getEmail()).isEqualTo(email);
    }

    @Test
    public void BaseTimeEntity_등록() throws Exception{
        //given
        String name = "test";
        String email = "test@naver.com";
        LocalDateTime now = LocalDateTime.of(2021,06,30,0,0,0);
        userRepository.save(User.builder()
                .name(name)
                .email(email)
                .role(Role.USER)
                .build());

        //when
        List<User> userList = userRepository.findAll();

        //then
        User users = userList.get(0);

        System.out.println(">>>>>> createdDate="+users.getCreatedDate()+", modifiedDate="+users.getModifiedDate());

        assertThat(users.getCreatedDate()).isAfter(now);
        assertThat(users.getModifiedDate()).isAfter(now);
    }



}