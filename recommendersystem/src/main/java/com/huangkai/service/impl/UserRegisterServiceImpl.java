package com.huangkai.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huangkai.dao.Movie_genresMapper;
import com.huangkai.model.Movie_genres;
import com.huangkai.service.IUserRegisterService;
@Service("IUserRegisterService")
public class UserRegisterServiceImpl implements IUserRegisterService {
	@Resource
 	Movie_genresMapper	movie_genresMapper;
	public List<Movie_genres> getAllMovie_genres() {
		return movie_genresMapper.getAllMovie_genres();
	}
}
