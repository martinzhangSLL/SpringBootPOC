package com.rgs.pocproject.controller.TestConfig;

import com.rgs.core.exception.ServiceException;
import com.rgs.core.interaction.ServiceApiResult;
import com.rgs.pocproject.config.TestConfig;
import com.rgs.pocproject.entity.testconfig.TestBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags="Test Config", value="Config")
@RequestMapping("Config")
@Slf4j
public class TestController {

    @Autowired
    ApplicationContext context;


    @GetMapping("/Test1")
    @ApiOperation(value = "Test1")
    public ServiceApiResult<String> GetTest1(){

        ServiceApiResult<String> result=new ServiceApiResult();
        try{
            TestConfig testConfig=context.getBean(TestConfig.class);
            if(testConfig!=null){
                result.setData("Found test config");
            }else{
                result.setData("Not Found test config");
            }
            result.setSuccess(true);
        }
        catch(ServiceException ex){
            result=ServiceApiResult.error(ex.getMsg());
        }
        catch(Exception ex){
            result=ServiceApiResult.error(ex.getMessage());
        }
        return result;
    }

    @GetMapping("/Test2")
    @ApiOperation(value = "Test2")
    public ServiceApiResult<String> GetTest2(){

        ServiceApiResult<String> result=new ServiceApiResult();
        try{
            TestBean testBean=context.getBean(TestBean.class);
            if(testBean!=null){
                result.setData("Found test bean");
                log.info("[Test Bean]{}",testBean);
            }else{
                result.setData("Not Found test bean");
            }
            result.setSuccess(true);
        }
        catch(ServiceException ex){
            result=ServiceApiResult.error(ex.getMsg());
        }
        catch(Exception ex){
            result=ServiceApiResult.error(ex.getMessage());
        }
        return result;
    }

    /**
     * 测试@Configuration和@Component的差别
     * 尝试将TestConfig的@Configuration换成@Component试一下
     * @return
     */
    @GetMapping("/Test3")
    @ApiOperation(value = "Test3")
    public ServiceApiResult<String> GetTest3(){

        ServiceApiResult<String> result=new ServiceApiResult();
        try{
            TestConfig testConfig=context.getBean(TestConfig.class);
            TestBean testBean=testConfig.testBean();
            TestBean testBean1=context.getBean(TestBean.class);
            if(testBean!=testBean1){
                result.setData("Test bean is different");
                log.info("[Test Bean]{}",testBean);
            }else{
                result.setData("Test bean is same");
            }
            result.setSuccess(true);
        }
        catch(ServiceException ex){
            result=ServiceApiResult.error(ex.getMsg());
        }
        catch(Exception ex){
            result=ServiceApiResult.error(ex.getMessage());
        }
        return result;
    }
}
