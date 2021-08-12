package com.dipak.spring.reddit.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dipak.spring.reddit.dto.SubredditDto;
import com.dipak.spring.reddit.model.Post;
import com.dipak.spring.reddit.model.Subreddit;

@Mapper(componentModel = "spring")
public interface SubredditMapper {

	@Mapping(target = "postCount", expression = "java(getPostsCount(subreddit.getPosts()))")
	SubredditDto mapSubredditToDto(Subreddit subreddit);

	default Integer getPostsCount(List<Post> posts) {
		return posts.size();
	}
	
    //@InheritInverseConfiguration
	@Mapping(target = "posts", ignore = true)
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
	Subreddit mapDtoToSubreddit(SubredditDto subredditDto);
}
