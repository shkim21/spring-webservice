package com.sehyeon.webservice.dto.posts;

import com.sehyeon.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter//Controller에서 @RequestBody로 외부에서 데이터를 받는 경우엔 기본생성자 + set메소드를 통해서만 값이 할당
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
