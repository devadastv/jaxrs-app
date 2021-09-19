// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
// end::comment[]
package io.openliberty.guides.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class PropertiesResource {

	@Path("/employee") 
	@GET 
	@Produces(MediaType.APPLICATION_JSON) 
	public ResponseItem get__employee() { 
	  return new ResponseItem("/employee", "dummy description"); 
	}

	@Path("/employee/{id}") 
	@GET 
	@Produces(MediaType.APPLICATION_JSON) 
	public ResponseItem get__employee__id_() { 
	  return new ResponseItem("/employee/{id}", "dummy description"); 
	}

}
