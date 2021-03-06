package wxtools.demo.interceptor;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxConsts;
import com.soecode.wxtools.api.WxMessageInterceptor;
import com.soecode.wxtools.bean.WxXmlMessage;
import com.soecode.wxtools.exception.WxErrorException;

/**
 * 示例：拦截器
 * 目的：拦截非TEXT类型的所有消息
 * @author FYP
 * @date 2016/12/15
 *
 */
public class DemoInterceptor implements WxMessageInterceptor{
	protected final Log logger = LogFactory.getLog(getClass());
	@Override
	public boolean intercept(WxXmlMessage wxMessage, Map<String, Object> context, IService iService)
			throws WxErrorException {
		logger.info("进入DemoInterceptor--intercept");
		//拦截所有非TEXT类型的消息,true通行；false拦截
		if(WxConsts.XML_MSG_TEXT.equals(wxMessage.getMsgType())){
			return true;
		}
		return false;
	}
}
