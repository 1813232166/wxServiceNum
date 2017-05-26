package wxtools.demo.handler;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxMessageHandler;
import com.soecode.wxtools.bean.WxXmlMessage;
import com.soecode.wxtools.bean.WxXmlOutMessage;
import com.soecode.wxtools.exception.WxErrorException;

/**
 * 示例：DemoHandler
 * 目的：返回用户 “恭喜你中奖了”
 * @author FYP
 * @date 2016/12/15
 *
 */
public class DemoHandler implements WxMessageHandler{
	protected final Log logger = LogFactory.getLog(getClass());
	@Override
	public WxXmlOutMessage handle(WxXmlMessage wxMessage, Map<String, Object> context, IService iService)
			throws WxErrorException {
        //必须以build()作为结尾，否则不生效。
		logger.info("进入DemoHandler--handle");
		WxXmlOutMessage xmlOutMsg = WxXmlOutMessage.TEXT().content("恭喜你中奖了").toUser(wxMessage.getFromUserName()).fromUser(wxMessage.getToUserName()).build();
		return xmlOutMsg;
	}
	
}
