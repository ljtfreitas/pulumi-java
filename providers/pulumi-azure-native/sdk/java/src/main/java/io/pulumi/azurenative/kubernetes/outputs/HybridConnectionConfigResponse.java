// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HybridConnectionConfigResponse {
    /**
     * Timestamp when this token will be expired.
     * 
     */
    private final Double expirationTime;
    /**
     * Name of the connection
     * 
     */
    private final String hybridConnectionName;
    /**
     * Name of the relay.
     * 
     */
    private final String relay;
    /**
     * Sender access token
     * 
     */
    private final String token;

    @OutputCustomType.Constructor({"expirationTime","hybridConnectionName","relay","token"})
    private HybridConnectionConfigResponse(
        Double expirationTime,
        String hybridConnectionName,
        String relay,
        String token) {
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
        this.relay = Objects.requireNonNull(relay);
        this.token = Objects.requireNonNull(token);
    }

    /**
     * Timestamp when this token will be expired.
     * 
     */
    public Double getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * Name of the connection
     * 
     */
    public String getHybridConnectionName() {
        return this.hybridConnectionName;
    }
    /**
     * Name of the relay.
     * 
     */
    public String getRelay() {
        return this.relay;
    }
    /**
     * Sender access token
     * 
     */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double expirationTime;
        private String hybridConnectionName;
        private String relay;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.relay = defaults.relay;
    	      this.token = defaults.token;
        }

        public Builder setExpirationTime(Double expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setHybridConnectionName(String hybridConnectionName) {
            this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
            return this;
        }

        public Builder setRelay(String relay) {
            this.relay = Objects.requireNonNull(relay);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public HybridConnectionConfigResponse build() {
            return new HybridConnectionConfigResponse(expirationTime, hybridConnectionName, relay, token);
        }
    }
}
