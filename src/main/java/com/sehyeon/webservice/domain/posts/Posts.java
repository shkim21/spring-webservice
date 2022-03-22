package com.sehyeon.webservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)//기본 생성자 자동 추가, 접근권한 protected. 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는것은 허용
@Getter//클래스내 모든 필드의 Getter 메소드를 자동생성
@Entity//테이블과 링크될 클래스, 언더스코어 네이밍
public class Posts {//Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며 보통 Entity클래스

    //JPA에서 제공하는 어노테이션
    @Id//해당 테이블 PK필드
    @GeneratedValue//PK생성 규칙
    private Long id;

    @Column(length= 500, nullable = false)//기본값 외에 추가로 변경이 필요한 옵션이 있을경우 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//해당 클래스의 빌더패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
