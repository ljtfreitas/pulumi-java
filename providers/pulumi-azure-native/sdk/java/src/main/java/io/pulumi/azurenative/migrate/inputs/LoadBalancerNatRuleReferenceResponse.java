// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines reference to load balancer NAT rules.
 * 
 */
public final class LoadBalancerNatRuleReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerNatRuleReferenceResponse Empty = new LoadBalancerNatRuleReferenceResponse();

    /**
     * Gets the name of the proxy resource on the target side.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @InputImport(name="sourceArmResourceId", required=true)
    private final String sourceArmResourceId;

    public String getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public LoadBalancerNatRuleReferenceResponse(
        @Nullable String name,
        String sourceArmResourceId) {
        this.name = name;
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private LoadBalancerNatRuleReferenceResponse() {
        this.name = null;
        this.sourceArmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerNatRuleReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerNatRuleReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }

        public LoadBalancerNatRuleReferenceResponse build() {
            return new LoadBalancerNatRuleReferenceResponse(name, sourceArmResourceId);
        }
    }
}
