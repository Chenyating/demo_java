package com.cyt.democyt.controller;

import com.cyt.democyt.bean.People;
import com.cyt.democyt.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;

@Controller
@Api(value = "测试",description = "测试")
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "增", notes = "增")
    @RequestMapping(value = "/add", method = { RequestMethod.POST }, produces = { "application/json; charset=utf-8" })
    @ResponseBody
    public Integer add(@RequestBody People people){
        return testService.add(people);
    }


    @ApiOperation(value = "删", notes = "删")
    @RequestMapping(value = "/delete", method = { RequestMethod.POST }, produces = { "application/json; charset=utf-8" })
    @ResponseBody
    public Integer delete(@RequestParam Integer id){
        return testService.delete(id);
    }

    @ApiOperation(value = "改", notes = "改")
    @RequestMapping(value = "/update", method = { RequestMethod.POST }, produces = { "application/json; charset=utf-8" })
    @ResponseBody
    public Integer update(@RequestBody People people){
        return testService.update(people);
    }

    @ApiOperation(value = "查", notes = "查")
    @RequestMapping(value = "/select", method = { RequestMethod.GET }, produces = { "application/json; charset=utf-8" })
    @ResponseBody
    public People select(@RequestParam Integer id){
        return testService.select(id);
    }


    @ApiOperation(value = "查询全部", notes = "查询全部")
    @RequestMapping(value = "/selectAll", method = { RequestMethod.GET }, produces = { "application/json; charset=utf-8" })
    @ResponseBody
    public List<People> selectAll(){
        return testService.selectAll();
    }
}
