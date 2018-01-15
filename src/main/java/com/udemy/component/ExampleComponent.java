package com.udemy.component;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Component;



@Component("exampleComponent")
public class ExampleComponent {
	
	public static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello() {
		LOG.info("HELLO FROM EXAMPLECOMPONENT");
	}

}
