package cn.caizhaoke.kf.service.impl;

import cn.caizhaoke.kf.mapper.DbTestMapper;
import cn.caizhaoke.kf.entity.DbTest;
import cn.caizhaoke.kf.service.DbTestService;
import cn.caizhaoke.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/08.
 */
@Service
@Transactional
public class DbTestServiceImpl extends AbstractService<DbTest> implements DbTestService {
    @Resource
    private DbTestMapper dbTestMapper;

}
