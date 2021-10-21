package com.lvxp.serviceverificationcode.service.impl;

import com.lvxp.internalcommon.dto.ResponseResult;
import com.lvxp.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;
import com.lvxp.serviceverificationcode.service.VerifyCodeService;
import org.springframework.stereotype.Service;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {
    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identify, String phoneNumber) {
        return null;
    }
}
