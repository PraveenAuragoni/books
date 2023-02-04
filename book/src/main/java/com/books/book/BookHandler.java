package com.books.book;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class BookHandler implements RequestHandler<String, Object>{
	@Override
	public Object handleRequest(String input, Context context) {
		context.getLogger().log("input "+ input);
		return "welcome to singapore "+input;
	}

}
