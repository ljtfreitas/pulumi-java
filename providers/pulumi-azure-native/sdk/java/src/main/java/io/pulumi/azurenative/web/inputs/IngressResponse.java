// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.TrafficWeightResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App Ingress configuration.
 * 
 */
public final class IngressResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressResponse Empty = new IngressResponse();

    /**
     * Bool indicating if HTTP connections to is allowed. If set to false HTTP connections are automatically redirected to HTTPS connections
     * 
     */
    @InputImport(name="allowInsecure")
        private final @Nullable Boolean allowInsecure;

    public Optional<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Optional.empty() : Optional.ofNullable(this.allowInsecure);
    }

    /**
     * Bool indicating if app exposes an external http endpoint
     * 
     */
    @InputImport(name="external")
        private final @Nullable Boolean external;

    public Optional<Boolean> getExternal() {
        return this.external == null ? Optional.empty() : Optional.ofNullable(this.external);
    }

    /**
     * Hostname.
     * 
     */
    @InputImport(name="fqdn", required=true)
        private final String fqdn;

    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * Target Port in containers for traffic from ingress
     * 
     */
    @InputImport(name="targetPort")
        private final @Nullable Integer targetPort;

    public Optional<Integer> getTargetPort() {
        return this.targetPort == null ? Optional.empty() : Optional.ofNullable(this.targetPort);
    }

    @InputImport(name="traffic")
        private final @Nullable List<TrafficWeightResponse> traffic;

    public List<TrafficWeightResponse> getTraffic() {
        return this.traffic == null ? List.of() : this.traffic;
    }

    /**
     * Ingress transport protocol
     * 
     */
    @InputImport(name="transport")
        private final @Nullable String transport;

    public Optional<String> getTransport() {
        return this.transport == null ? Optional.empty() : Optional.ofNullable(this.transport);
    }

    public IngressResponse(
        @Nullable Boolean allowInsecure,
        @Nullable Boolean external,
        String fqdn,
        @Nullable Integer targetPort,
        @Nullable List<TrafficWeightResponse> traffic,
        @Nullable String transport) {
        this.allowInsecure = allowInsecure;
        this.external = external == null ? false : external;
        this.fqdn = Objects.requireNonNull(fqdn, "expected parameter 'fqdn' to be non-null");
        this.targetPort = targetPort;
        this.traffic = traffic;
        this.transport = transport;
    }

    private IngressResponse() {
        this.allowInsecure = null;
        this.external = null;
        this.fqdn = null;
        this.targetPort = null;
        this.traffic = List.of();
        this.transport = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInsecure;
        private @Nullable Boolean external;
        private String fqdn;
        private @Nullable Integer targetPort;
        private @Nullable List<TrafficWeightResponse> traffic;
        private @Nullable String transport;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.external = defaults.external;
    	      this.fqdn = defaults.fqdn;
    	      this.targetPort = defaults.targetPort;
    	      this.traffic = defaults.traffic;
    	      this.transport = defaults.transport;
        }

        public Builder setAllowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder setExternal(@Nullable Boolean external) {
            this.external = external;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setTargetPort(@Nullable Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        public Builder setTraffic(@Nullable List<TrafficWeightResponse> traffic) {
            this.traffic = traffic;
            return this;
        }

        public Builder setTransport(@Nullable String transport) {
            this.transport = transport;
            return this;
        }
        public IngressResponse build() {
            return new IngressResponse(allowInsecure, external, fqdn, targetPort, traffic, transport);
        }
    }
}
