package com.yazilim.servisler;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/allame")
public class Dente2 {
	
	
	@Path("/giris")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public Response kent(@FormParam("ismin")String ismin,
						 @FormParam("sifren")String sifren) {
		
		String bl = "MERHABA "+ismin+ " - sifreniz : "+sifren;
		
		
		return Response.status(200).entity(bl).build();
	}

	
	@Path("/veriuret")
	@GET
	@Produces(MediaType.TEXT_XML)
	public Soner veridiz()
	{
		Soner soner = new Soner();
				soner.setAd("HAKTAN");
				soner.setSoyad("EVCIL");
		return soner;
	}
	
	@Path("/veriuretresponse")
	@GET
	@Produces(MediaType.TEXT_XML)
	public Response veridiz2()
	{
		Soner soner = new Soner();
				soner.setAd("TINAZTEPE");
				soner.setSoyad("GUZELCAMLI");
		return Response.status(200).entity(soner).build();
	}
}
