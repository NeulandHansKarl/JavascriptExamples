package com.airhacks;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/fun")
@Stateless
public class Fun {

	@GET
	public String fun() {
		return "hello";
	}
}
