package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.core.AbstractMasterDetailListProcessor;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }


    @Test
    void 회원가입() {
        // given 주어진 것
        Member member = new Member();
        member.setName("hello");

        // when : ~ 을 실행했을 때
        Long saveId = memberService.join(member);

        // then : ~가 나와야 한다.
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외(){
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring"); // 중복된 이름 설정

        // when
        memberService.join(member1);
        // memberService.join(member2); // 여기서 예외가 생긴다.
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));// 뒤를 실행할 때 앞의 예외가 나와야 함.

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
       /* try {
            memberService.join(member2);
            fail();
        } catch(IllegalStateException e){
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/


        // then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}