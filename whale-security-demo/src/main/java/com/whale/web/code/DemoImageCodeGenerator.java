/**
 * 
 */
package com.whale.web.code;

import com.whale.security.core.validate.ValidateCodeGenerator;
import com.whale.security.core.validate.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;


/**
 * @author zhailiang
 *
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}
}
