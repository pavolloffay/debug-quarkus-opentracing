package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

/**
 * @author Pavol Loffay
 */
@Path("/hello")
public class TracedResource {

    private static final Logger LOG = Logger.getLogger(TracedResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
      LOG.info("hello");
      return "hello";
    }
}
