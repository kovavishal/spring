package com.example.demo.rest;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Registerbean;
import com.example.demo.entity.Register;


@RestController
public class RegisterController {
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();
		 //ApplicationContext ctx = 
		   //      new AnnotationConfigApplicationContext(DemoConfig.class);
	    @Autowired
	    Registerbean sb = null;
	   /* @RequestMapping("/register")
	    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
	    	System.out.println("greeting controller");
		    //  Manager m = ContextLoader.getInstance().getApplicationContext().getBean(Manager.class);
		      //m.appraise();
		      //System.out.println("Loading  company");
		      //Company c = ContextLoader.getInstance().getApplicationContext().getBean(Company.class);
		      //c.open();
		      //StudentBean sb = ContextLoader.getInstance().getApplicationContext().getBean(StudentBean.class);
		      Register r = new Register();
		      r.setLoginName("raja");
		      r.setPassword("ammu");
		      r.setEmailid("kovavishal@gmail.com");
		      r.setContactNumber("9443453320");
		      r.setGender("male");
		      
		    	sb.saveRegister(r);

	        return new Greetings(counter.incrementAndGet(),
	                            String.format(template, name));
	    }*/
	    @RequestMapping(value = "/Register", method = RequestMethod.POST)
		public @ResponseBody Register createStudent(@RequestBody Register msg) {
			System.out.println("name:" + msg.getloginName());
			System.out.println("email:" + msg.getemailId());
			System.out.println("password:" + msg.getpassword());
			System.out.println("contactnumber:" + msg.getcontactNumber());
			System.out.println("gender:" + msg.getgender());
			sb.saveRegister(msg);
			return msg;
		}
	 
	   
	    
}
