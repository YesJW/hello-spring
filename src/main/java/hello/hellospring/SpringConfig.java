package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*private DataSource dataSource; //Jdbc 사용하기 위해

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    //private EntityManager em; //JPA 사용하기 위해

    /*@Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }*/
    @Autowired
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }


    /*@Bean
    public MemberRepository memberRepository(){
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);

    }*/
}
