package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; // 키 값을 생성해줌.

    @Override
    public Member save(Member member) {
        member.setId(++sequence); // id를 정해줌
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
        // 맵에서 돌다가 하나 찾으면 그대로 반환하게 된다.
    }

    @Override
    public List<Member> findAll() {
        // store.values() -> Member들!!
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear(); // 싹 비운다.
    }
}
