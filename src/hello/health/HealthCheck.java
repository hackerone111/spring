package hello.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

public class HealthCheck {

	@Component
	public class MyHealth implements HealthIndicator {

	    @Override
	    public Health health() {
	    	return new Health.Builder()
	        .withDetail("tair", "timeout") // some logic check tair
	        .withDetail("tfs", "ok") // some logic check tfs
	        .status("500")
	        .down()
	        .build();
	    }
	}

}
