package toyproject.loobie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import toyproject.loobie.domain.News;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    NewsRepository newsRepository;

    @Test
    @Transactional
//    @Rollback(false)
    public void testMember() throws Exception {
        //given
//        News news = new News();
//        news.setName("memberA");

        //when
//        Long saveId = newsRepository.save(news);
//        news findMember = newsRepository.find(saveId);

        //then
//        assertEquals(findMember.getId(), member.getId());
//        assertEquals(findMember.getName(), member.getName());
    }
}