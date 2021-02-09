package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

public interface CodeBlogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save (Post post);
	Post deleteById(long id);

}
