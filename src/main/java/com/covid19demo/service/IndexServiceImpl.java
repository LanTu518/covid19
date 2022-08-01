package com.covid19demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.covid19demo.dao.IndexMapper;
import com.covid19demo.entity.NocvData;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, NocvData> implements IndexService {
}
