package com.yingu.project.big.data.service;

import com.yingu.project.big.data.common.ResponseResult;

import java.util.Map;

/**
 * @author huangkunhao
 * @date 2018/11/20
 * @Description
 */
public interface InternetBankService {

    ResponseResult getDataByOrderNum(Map<String, Object> map);
}