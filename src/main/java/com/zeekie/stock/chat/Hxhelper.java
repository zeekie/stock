package com.zeekie.stock.chat;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zeekie.stock.Constants;
import com.zeekie.stock.chat.httpclient.apidemo.EasemobIMUsers;

public class Hxhelper {

	public static void registhx(String userid) {
		ObjectNode datanode = JsonNodeFactory.instance.objectNode();
		datanode.put("username", userid);
		datanode.put("password", Constants.code_hx_pwd);
		ObjectNode createNewIMUserSingleNode = EasemobIMUsers
				.createNewIMUserSingle(datanode);
		if (null != createNewIMUserSingleNode) {
			System.out.println(createNewIMUserSingleNode.toString());
		}
	}

	public static void main(String[] args) {
		
		for(int i=4321;i<=4327;i++){
			registhx(i+"");
		}
	}
}