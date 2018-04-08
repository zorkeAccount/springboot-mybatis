package cn.caizhaoke.kf.web;

import cn.caizhaoke.common.Result;
import cn.caizhaoke.common.ResultGenerator;
import cn.caizhaoke.common.framework.SystemTime;
import cn.caizhaoke.kf.entity.DbTest;
import cn.caizhaoke.kf.service.DbTestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
* Created by CodeGenerator on 2018/04/08.
*/
@RestController
@RequestMapping("/db/test")
public class DbTestController {
    @Autowired
    DbTestService dbTestService;

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public Result add(DbTest dbTest) {
        dbTest.setDbTestId(UUID.randomUUID().toString().replace("-", ""));
        dbTest.setDbTestText("This is the text!");
        dbTest.setStatus("1");
        dbTest.setCreateTime(SystemTime.asDate());

        dbTestService.save(dbTest);
        return ResultGenerator.genSuccessResult(dbTest);
    }

/*    @RequestMapping(value = "/isExist", method = {RequestMethod.POST})
    public Result isExist(@RequestParam String id) {
        boolean isExist = dbTestSecondQueryImpl.isExist(id);
        return ResultGenerator.genSuccessResult(isExist);
    }*/


    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    public Result delete(@RequestParam String id) {
        dbTestService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    public Result update(@RequestParam String id) {
        DbTest dbTest = dbTestService.findById(id);
        dbTest.setUpdateTime(SystemTime.asDate());

        dbTestService.update(dbTest);
        return ResultGenerator.genSuccessResult(dbTest);
    }

    @RequestMapping(value = "/detail", method = {RequestMethod.GET})
    public Result detail(@RequestParam String id) {
        DbTest dbTest = dbTestService.findById(id);
        return ResultGenerator.genSuccessResult(dbTest);
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DbTest> list = dbTestService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
