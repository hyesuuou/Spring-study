package com.example.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    // findAll By OrderBy ModifiedAt Desc();
    // 수정된 날짜 기준으로 정렬을 해달라. 내림차순으로
}
