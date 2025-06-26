import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    public TigerHabitat tigerHabitat() {
        return new TigerHabitat();
    }

    @Bean
    @Scope("prototype")
    public Tiger bengalTiger(String color, double weight, String climate) {
        return new BengalTiger(color, weight, climate);
    }

    @Bean
    @Scope("prototype")
    public Tiger siberianTiger(String color, double weight, String climate) {
        return new SiberianTiger(color, weight, climate);
    }

    @Bean
    @Scope("prototype")
    public Tiger sumatranTiger(String color, double weight, String climate) {
        return new SumatranTiger(color, weight, climate);
    }
}
