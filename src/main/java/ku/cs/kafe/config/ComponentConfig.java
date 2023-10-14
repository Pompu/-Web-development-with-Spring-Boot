// Pecthgamon Sangnual 6410406819
package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

