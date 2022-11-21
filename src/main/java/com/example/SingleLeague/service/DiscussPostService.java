package com.example.SingleLeague.service;

import com.example.SingleLeague.entity.DiscussPost;

import java.util.List;

/**
 * @author Chris Yang
 * created 2022-08-21 15:46
 **/
public interface DiscussPostService {
    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}
