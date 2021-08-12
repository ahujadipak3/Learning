package com.dipak.spring.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponse {

	private Long postId;
	private String postName;
	private String description;
	private String subredditName;
	private String userName;
	private boolean upVote;
	private boolean downVote;
	private Integer voteCount;
	private Integer commentCount;
	private String duration;
	private String url;
}
