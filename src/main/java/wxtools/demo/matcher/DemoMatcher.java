package wxtools.demo.matcher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.soecode.wxtools.api.WxMessageMatcher;
import com.soecode.wxtools.bean.WxXmlMessage;

/**
 * 示例：DemoMatcher匹配器
 * 目的：拦截“在吗”的消息
 * 
 * @author FYP
 * @date 2016/12/15
 *
 */
public class DemoMatcher implements WxMessageMatcher{
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Override
	public boolean match(WxXmlMessage message) {
		logger.info("进入DemoMatcher--match");
		//拦截“在吗”的消息，true通行；false拦截
		if("在吗".equals(message.getContent())){
			return false;
		}
		return true;
	}
}
