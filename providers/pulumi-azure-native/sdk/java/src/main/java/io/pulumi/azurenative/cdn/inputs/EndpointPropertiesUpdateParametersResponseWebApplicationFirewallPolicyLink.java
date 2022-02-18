// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Web Application Firewall policy for the endpoint (if applicable)
 * 
 */
public final class EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink extends io.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink Empty = new EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink(@Nullable String id) {
        this.id = id;
    }

    private EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink build() {
            return new EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink(id);
        }
    }
}
