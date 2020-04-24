package com.sean.mapper;

import com.sean.entity.Honor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HonorMapper {

    Honor findHonorByType(@Param("honorName") String honorName);
}
