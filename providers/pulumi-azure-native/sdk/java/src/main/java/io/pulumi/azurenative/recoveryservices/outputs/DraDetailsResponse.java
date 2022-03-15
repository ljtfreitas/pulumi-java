// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DraDetailsResponse {
    /**
     * The health of the DRA.
     * 
     */
    private final String health;
    /**
     * The health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * The DRA Id.
     * 
     */
    private final String id;
    /**
     * The last heartbeat received from the DRA.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * The DRA name.
     * 
     */
    private final String name;
    /**
     * The DRA version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private DraDetailsResponse(
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthErrors") List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("version") String version) {
        this.health = health;
        this.healthErrors = healthErrors;
        this.id = id;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.name = name;
        this.version = version;
    }

    /**
     * The health of the DRA.
     * 
    */
    public String getHealth() {
        return this.health;
    }
    /**
     * The health errors.
     * 
    */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors;
    }
    /**
     * The DRA Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last heartbeat received from the DRA.
     * 
    */
    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * The DRA name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The DRA version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DraDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String id;
        private String lastHeartbeatUtc;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DraDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public DraDetailsResponse build() {
            return new DraDetailsResponse(health, healthErrors, id, lastHeartbeatUtc, name, version);
        }
    }
}
