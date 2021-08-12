package com.dipak.spring.reddit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dipak.spring.reddit.dto.SubredditDto;
import com.dipak.spring.reddit.exception.SpringRedditException;
import com.dipak.spring.reddit.mapper.SubredditMapper;
import com.dipak.spring.reddit.model.Subreddit;
import com.dipak.spring.reddit.repository.SubredditRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubredditService {

	private final AuthService authService;
	private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;
	
	public List<SubredditDto> getAllSubreddits() {
		return subredditRepository.findAll().stream().map(subredditMapper::mapSubredditToDto).collect(Collectors.toList());
	}
	
	public SubredditDto getSubredditById(Long id) {
		Subreddit subreddit = subredditRepository.findById(id).orElseThrow(() -> new SpringRedditException("Subreddit not found for id: {}"+ id));
		return subredditMapper.mapSubredditToDto(subreddit);
	}
	
	/*
	 * private SubredditDto mapToDTO(Subreddit subreddit) { return
	 * SubredditDto.builder().name(subreddit.getName())
	 * .createDate(subreddit.getCreatedDate())
	 * .description(subreddit.getDescription())
	 * .postCount(subreddit.getPosts().size()) .build(); }
	 */
	
	public void createSubreddit(SubredditDto subredditDto) {
		//Subreddit subreddit = mapToDomain(subredditDto);
		Subreddit subreddit = subredditMapper.mapDtoToSubreddit(subredditDto);
		subreddit.setUser(authService.getCurrentUser());
		subredditRepository.save(subreddit);
	}

	/*
	 * private Subreddit mapToDomain(SubredditDto subredditDto) { return
	 * Subreddit.builder() .name("/r/"+subredditDto.getName())
	 * .description(subredditDto.getDescription()) .createdDate(Instant.now())
	 * .user(authService.getCurrentUser()) .build(); }
	 */
}
