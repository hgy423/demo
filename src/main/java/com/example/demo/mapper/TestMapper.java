package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.TestDto;

@Mapper
public interface TestMapper {

	List<TestDto> getUserList();
}
