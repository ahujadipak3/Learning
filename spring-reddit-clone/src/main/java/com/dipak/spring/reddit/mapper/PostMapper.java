package com.dipak.spring.reddit.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.dipak.spring.reddit.dto.PostRequest;
import com.dipak.spring.reddit.dto.PostResponse;
import com.dipak.spring.reddit.model.Post;
import com.dipak.spring.reddit.model.Subreddit;
import com.dipak.spring.reddit.model.User;
import com.dipak.spring.reddit.repository.CommentRepository;
import com.github.marlonlom.utilities.timeago.TimeAgo;

@Mapper(componentModel = "spring")

public abstract class PostMapper {

	@Autowired
	private CommentRepository commentRepository;
	// @Mapping(target = "")
	// public PostDto mapPostToDto(Post post);

	@Mapping(target = "description", source = "postRequest.description")
	@Mapping(target = "createdDate", expression  = "java(java.time.Instant.now())")
	@Mapping(target = "voteCount", constant = "0")
	@Mapping(target = "user", source = "user")
	@Mapping(target = "subreddit", source = "subreddit")
	public abstract Post mapRequestToPost(PostRequest postRequest, User user, Subreddit subreddit);

	@Mapping(target = "description", source = "post.description")
	@Mapping(target = "userName", source = "user.username")
	@Mapping(target = "subredditName", source = "subreddit.name")
	@Mapping(target = "commentCount", expression  ="java(getCommentCountForPost(post))")
	@Mapping(target = "duration", expression = "java(getPostDuration(post))")
	public abstract PostResponse mapPostToResponse(Post post);
	
	public int getCommentCountForPost(Post post) {
		return commentRepository.findByPost(post).size();
	}
	
	public String getPostDuration(Post post) {
		return TimeAgo.using(post.getCreatedDate().toEpochMilli());
	}
	
	
	//upVote
}
