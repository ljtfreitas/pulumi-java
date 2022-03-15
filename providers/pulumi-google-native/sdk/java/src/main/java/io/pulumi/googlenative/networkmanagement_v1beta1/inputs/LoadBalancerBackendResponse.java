// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a specific load balancer backend.
 * 
 */
public final class LoadBalancerBackendResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerBackendResponse Empty = new LoadBalancerBackendResponse();

    /**
     * Name of a Compute Engine instance or network endpoint.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * A list of firewall rule URIs allowing probes from health check IP ranges.
     * 
     */
    @Import(name="healthCheckAllowingFirewallRules", required=true)
      private final List<String> healthCheckAllowingFirewallRules;

    public List<String> getHealthCheckAllowingFirewallRules() {
        return this.healthCheckAllowingFirewallRules;
    }

    /**
     * A list of firewall rule URIs blocking probes from health check IP ranges.
     * 
     */
    @Import(name="healthCheckBlockingFirewallRules", required=true)
      private final List<String> healthCheckBlockingFirewallRules;

    public List<String> getHealthCheckBlockingFirewallRules() {
        return this.healthCheckBlockingFirewallRules;
    }

    /**
     * State of the health check firewall configuration.
     * 
     */
    @Import(name="healthCheckFirewallState", required=true)
      private final String healthCheckFirewallState;

    public String getHealthCheckFirewallState() {
        return this.healthCheckFirewallState;
    }

    /**
     * URI of a Compute Engine instance or network endpoint.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public LoadBalancerBackendResponse(
        String displayName,
        List<String> healthCheckAllowingFirewallRules,
        List<String> healthCheckBlockingFirewallRules,
        String healthCheckFirewallState,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.healthCheckAllowingFirewallRules = Objects.requireNonNull(healthCheckAllowingFirewallRules, "expected parameter 'healthCheckAllowingFirewallRules' to be non-null");
        this.healthCheckBlockingFirewallRules = Objects.requireNonNull(healthCheckBlockingFirewallRules, "expected parameter 'healthCheckBlockingFirewallRules' to be non-null");
        this.healthCheckFirewallState = Objects.requireNonNull(healthCheckFirewallState, "expected parameter 'healthCheckFirewallState' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private LoadBalancerBackendResponse() {
        this.displayName = null;
        this.healthCheckAllowingFirewallRules = List.of();
        this.healthCheckBlockingFirewallRules = List.of();
        this.healthCheckFirewallState = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private List<String> healthCheckAllowingFirewallRules;
        private List<String> healthCheckBlockingFirewallRules;
        private String healthCheckFirewallState;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.healthCheckAllowingFirewallRules = defaults.healthCheckAllowingFirewallRules;
    	      this.healthCheckBlockingFirewallRules = defaults.healthCheckBlockingFirewallRules;
    	      this.healthCheckFirewallState = defaults.healthCheckFirewallState;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder healthCheckAllowingFirewallRules(List<String> healthCheckAllowingFirewallRules) {
            this.healthCheckAllowingFirewallRules = Objects.requireNonNull(healthCheckAllowingFirewallRules);
            return this;
        }

        public Builder healthCheckBlockingFirewallRules(List<String> healthCheckBlockingFirewallRules) {
            this.healthCheckBlockingFirewallRules = Objects.requireNonNull(healthCheckBlockingFirewallRules);
            return this;
        }

        public Builder healthCheckFirewallState(String healthCheckFirewallState) {
            this.healthCheckFirewallState = Objects.requireNonNull(healthCheckFirewallState);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public LoadBalancerBackendResponse build() {
            return new LoadBalancerBackendResponse(displayName, healthCheckAllowingFirewallRules, healthCheckBlockingFirewallRules, healthCheckFirewallState, uri);
        }
    }
}
