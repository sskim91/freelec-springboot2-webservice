package com.sskim91.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//Entity 클래스와 기본 Entity Repository는 함께 위치해야한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
