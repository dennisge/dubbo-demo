/*
 * Copyright 2008-2015 GuanAiHui inc. 
 */
package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.HeroojService;

/**
 * HeroojServiceImpl:
 *
 * @author DennisGe
 */
@Service(version="1.0.0")
public class HeroojServiceImpl implements HeroojService {

	@Override
	public String batalado(String inovkerParameter) {

		return " Hello there " + inovkerParameter;
	}

}
