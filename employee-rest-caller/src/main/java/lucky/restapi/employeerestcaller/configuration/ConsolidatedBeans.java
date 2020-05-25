package lucky.restapi.employeerestcaller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsolidatedBeans
{
    @Bean
    public RestTemplate getRestTemplateInstance()
    {
        return new RestTemplate();
    }
}
