package com.aman.joblisting.repository;

import com.aman.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
