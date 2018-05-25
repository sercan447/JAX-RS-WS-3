package com.yazilim.servisler;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path("/developer")
public class Dente {

	
	
	@GET
	@Path("/csharp")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String microsoftyazilim()
	{		
		return "<b>C# Developer</b>"; 
	}
	
	@GET
	@Path("/aspnet")
	@Produces(MediaType.APPLICATION_JSON)
	public Response microsoftwebyazilim()
	{
		String soner =  "<i>ASP.NET</i>";
		return Response.status(200).entity(soner).build();
	}
	
	
	@GET
	@Path("/tunelxmltipi/{ad:[a-z]+}/{soyad:[A-Z]+}/{no:[0-9]+}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response xmlveritipi(@PathParam("ad")String ad,
								@PathParam("soyad")String soyad,
								@PathParam("no")int no)
	{
	//	Soner soner = new Soner("semih","tinaztepe");
		String soner ="<?xml version=\"1.0\"?>"
				+ "<Kisi>"+
					"<ad>"+ad+"</ad>"+
					"<soyad>"+soyad+"</soyad>"+
					"<numara>"+no+"</numara>"+
				 "</Kisi>";
		return Response.status(200).entity(soner).build();
	}
	
	//stack/developer/javadizayn;kisi1=soner;kisi2=ramazan;kisi3=%C5%9Fenol
	
	@GET
	@Path("/javadizayn")
	@Produces("text/plain;charset=utf-8")
	public Response javayazilim(@MatrixParam("kisi1")String kisi1,
								@MatrixParam("kisi2")String kisi2,
								@MatrixParam("kisi3")String kisi3)
	{
		
		String anlam = kisi1+" - "+kisi2+" - "+kisi3;
		return Response.status(200).entity(anlam).build();
	}
	
	//stack/developer/javawebtek/FARKETMEYECEKVERI;bor=55;harman=ankara;
	@GET
	@Path("/javawebtek/{durum}")
	@Produces("text/plain;charset=utf-8")
	public Response javawebteknoloji(@PathParam("durum")PathSegment segment) {
		MultivaluedMap<String, String> multimap = segment.getMatrixParameters();
		String veriler = "MILYON : ";
		for(String key : multimap.keySet())
		{
			veriler += key+" : "+multimap.get(key);
		}
		return Response.status(200).entity(veriler).build();
	}
	
	
	
	
	
}
