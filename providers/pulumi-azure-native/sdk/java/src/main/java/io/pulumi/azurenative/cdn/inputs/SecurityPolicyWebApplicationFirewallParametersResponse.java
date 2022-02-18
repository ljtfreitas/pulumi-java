// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.inputs.SecurityPolicyWebApplicationFirewallAssociationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The json object containing security policy waf parameters
 * 
 */
public final class SecurityPolicyWebApplicationFirewallParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyWebApplicationFirewallParametersResponse Empty = new SecurityPolicyWebApplicationFirewallParametersResponse();

    /**
     * Waf associations
     * 
     */
    @InputImport(name="associations")
    private final @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations;

    public List<SecurityPolicyWebApplicationFirewallAssociationResponse> getAssociations() {
        return this.associations == null ? List.of() : this.associations;
    }

    /**
     * The type of the Security policy to create.
     * Expected value is 'WebApplicationFirewall'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="wafPolicy")
    private final @Nullable ResourceReferenceResponse wafPolicy;

    public Optional<ResourceReferenceResponse> getWafPolicy() {
        return this.wafPolicy == null ? Optional.empty() : Optional.ofNullable(this.wafPolicy);
    }

    public SecurityPolicyWebApplicationFirewallParametersResponse(
        @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations,
        String type,
        @Nullable ResourceReferenceResponse wafPolicy) {
        this.associations = associations;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.wafPolicy = wafPolicy;
    }

    private SecurityPolicyWebApplicationFirewallParametersResponse() {
        this.associations = List.of();
        this.type = null;
        this.wafPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations;
        private String type;
        private @Nullable ResourceReferenceResponse wafPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.type = defaults.type;
    	      this.wafPolicy = defaults.wafPolicy;
        }

        public Builder setAssociations(@Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations) {
            this.associations = associations;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWafPolicy(@Nullable ResourceReferenceResponse wafPolicy) {
            this.wafPolicy = wafPolicy;
            return this;
        }

        public SecurityPolicyWebApplicationFirewallParametersResponse build() {
            return new SecurityPolicyWebApplicationFirewallParametersResponse(associations, type, wafPolicy);
        }
    }
}
