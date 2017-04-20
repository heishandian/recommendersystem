package com.huangkai.dao;

import java.util.List;

import com.huangkai.model.Movie_genres;

public interface Movie_genresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Movie_genres record);

    int insertSelective(Movie_genres record);

    List<Movie_genres> getAllMovie_genres();
    
    Movie_genres selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Movie_genres record);

    int updateByPrimaryKey(Movie_genres record);
}