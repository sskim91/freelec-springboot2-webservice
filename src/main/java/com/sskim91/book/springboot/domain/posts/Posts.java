package com.sskim91.book.springboot.domain.posts;

import com.sskim91.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //Entity 클래스에서는 절대! Setter 메소드를 만들지 않는다. 해당 클래스의 인스턴스 값들이 언제 어디서 변해야 하는지 코드상으로 구분할 수 없어 차후 기능 변경시 복잡해짐.
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
