package com.covid19demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.covid19demo.entity.NocvData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper extends BaseMapper<NocvData> {
}
