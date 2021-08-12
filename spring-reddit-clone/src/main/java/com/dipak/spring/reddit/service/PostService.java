package com.dipak.spring.reddit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dipak.spring.reddit.dto.PostRequest;
import com.dipak.spring.reddit.dto.PostResponse;
import com.dipak.spring.reddit.exception.SpringRedditException;
import com.dipak.spring.reddit.mapper.PostMapper;
import com.dipak.spring.reddit.model.Post;
import com.dipak.spring.reddit.repository.PostRepository;
import com.dipak.spring.reddit.repository.SubredditRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;
	private final PostMapper postMapper;
	private final AuthService authService;
	private final SubredditRepository subredditRepository;

	public List<PostResponse> getAllPosts() {
		List<Post> postList = postRepository.findAll();
		return postList.stream().map(postMapper::mapPostToResponse).collect(Collectors.toList());
	}

	public PostResponse getPostById(Long id) {
		return postMapper.mapPostToResponse(postRepository.findById(id)
				.orElseThrow(() -> new SpringRedditException("Post cannot be found for id " + id)));
	}

	public void createPost(PostRequest postRequest) {
		Post post = postMapper.mapRequestToPost(postRequest, authService.getCurrentUser(),
				subredditRepository.findByName(postRequest.getSubredditName())
						.orElseThrow(() -> new SpringRedditException(
								"No Subreddit exists with name " + postRequest.getSubredditName())));
		postRepository.save(post);
	}

}
