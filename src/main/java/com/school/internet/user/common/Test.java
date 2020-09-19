package com.school.internet.user.common;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class Test {

	public static void main(String[] args) throws IOException{
		SocketChannel socket = dcc_client.dcc_Socket("iot.harvestcloud.cn", 9877);
		
		//数据包格式看mserver相关手册
		//发送广播

		dcc_msg msg = new dcc_msg();
		msg.setMsg_type((byte) 0x00);
		msg.setMsg_len(8);
		msg.setMsg_body(ByteUtils.getByteArray("01054802FF003A5A"));
		msg.setImei("240305004056201");
		System.out.println("发送="+dcc_client.dcc_msg_send(socket, msg));
		
		
		
		//接受数据
		msg = new dcc_msg();
		 System.out.print("返回="+dcc_client.dcc_msg_recv(socket, msg));
	}
}
