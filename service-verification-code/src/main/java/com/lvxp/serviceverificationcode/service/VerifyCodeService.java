package com.lvxp.serviceverificationcode.service;

import com.lvxp.internalcommon.dto.ResponseResult;
import com.lvxp.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;

public interface VerifyCodeService {

    public ResponseResult<VerifyCodeResponse> generate(int identify, String phoneNumber);
}
