package com.dipak.spring.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostRequest {
	private Long postId;
    private String postName;
    private String url;
    private String description;
    private String subredditName;
}
