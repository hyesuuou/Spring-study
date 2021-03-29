package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 인터페이스
    Member save(Member member); // 저장소에 회원 저장
    // 저장소의 회원 찾기
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // 저장소의 모든 회원 리스트
    List<Member> findAll();
}
