package com.example.test.ServiceImpl;

import com.alibaba.druid.util.StringUtils;
import com.example.test.common.ServerResponse;
import com.example.test.mapper.ProductDOMapper;
import com.example.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductDOMapper productDOMapper;
    public ServerResponse<Integer> checkPriceByPname(String pName){
        if(StringUtils.isEmpty(pName)){
            return ServerResponse.createByErrorMessage("找不到该产品");
        }

        int price=productDOMapper.checkPriceByPname(pName);
        return ServerResponse.createBySuccess(price);


    }


}
