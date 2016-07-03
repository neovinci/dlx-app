package by.epamlab.dlx.utilities;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * Created by Sergei Astapenko on 03.07.2016.
 */
public class ServerContext {
    public static final Properties JBossProperties;

    static {
        JBossProperties = new Properties();
        JBossProperties.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        JBossProperties.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
        JBossProperties.put("java.naming.provider.url", "jnp://localhost:1099");
    }

    public static Context getContext(Properties properties) throws NamingException {
        Context context = new InitialContext(properties);
        return context;
    }
}
