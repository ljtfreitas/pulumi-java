// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancingRuleResponse {
    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    private final Integer backendPort;
    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
     * 
     */
    private final Integer frontendPort;
    /**
     * the reference to the load balancer probe used by the load balancing rule.
     * 
     */
    private final String probeProtocol;
    /**
     * The probe request path. Only supported for HTTP/HTTPS probes.
     * 
     */
    private final @Nullable String probeRequestPath;
    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private LoadBalancingRuleResponse(
        @CustomType.Parameter("backendPort") Integer backendPort,
        @CustomType.Parameter("frontendPort") Integer frontendPort,
        @CustomType.Parameter("probeProtocol") String probeProtocol,
        @CustomType.Parameter("probeRequestPath") @Nullable String probeRequestPath,
        @CustomType.Parameter("protocol") String protocol) {
        this.backendPort = backendPort;
        this.frontendPort = frontendPort;
        this.probeProtocol = probeProtocol;
        this.probeRequestPath = probeRequestPath;
        this.protocol = protocol;
    }

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
    */
    public Integer getBackendPort() {
        return this.backendPort;
    }
    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
     * 
    */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }
    /**
     * the reference to the load balancer probe used by the load balancing rule.
     * 
    */
    public String getProbeProtocol() {
        return this.probeProtocol;
    }
    /**
     * The probe request path. Only supported for HTTP/HTTPS probes.
     * 
    */
    public Optional<String> getProbeRequestPath() {
        return Optional.ofNullable(this.probeRequestPath);
    }
    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backendPort;
        private Integer frontendPort;
        private String probeProtocol;
        private @Nullable String probeRequestPath;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.probeProtocol = defaults.probeProtocol;
    	      this.probeRequestPath = defaults.probeRequestPath;
    	      this.protocol = defaults.protocol;
        }

        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }

        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }

        public Builder probeProtocol(String probeProtocol) {
            this.probeProtocol = Objects.requireNonNull(probeProtocol);
            return this;
        }

        public Builder probeRequestPath(@Nullable String probeRequestPath) {
            this.probeRequestPath = probeRequestPath;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public LoadBalancingRuleResponse build() {
            return new LoadBalancingRuleResponse(backendPort, frontendPort, probeProtocol, probeRequestPath, protocol);
        }
    }
}
