package tienda;

import javax.ws.rs.Produces;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.codehaus.jackson.map.SerializationConfig.Feature;

@Produces(MediaType.APPLICATION_JSON)
@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper>{

    ObjectMapper mapper;

    public ObjectMapperProvider(){
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }
 

    @Override
    public ObjectMapper getContext(Class<?> arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
