package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo
{
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String hello()
    {
        return "hello world";
    }

    @RequestMapping(value = "/todaysdate", method = RequestMethod.GET)
    public String helloWithDate()
    {
        return "hello world at " + new java.util.Date();
    }
}
