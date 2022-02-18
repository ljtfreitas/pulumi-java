// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.QuarantinePolicyResponse;
import io.pulumi.azurenative.containerregistry.inputs.RetentionPolicyResponse;
import io.pulumi.azurenative.containerregistry.inputs.TrustPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policies for a container registry.
 * 
 */
public final class PoliciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PoliciesResponse Empty = new PoliciesResponse();

    /**
     * The quarantine policy for a container registry.
     * 
     */
    @InputImport(name="quarantinePolicy")
    private final @Nullable QuarantinePolicyResponse quarantinePolicy;

    public Optional<QuarantinePolicyResponse> getQuarantinePolicy() {
        return this.quarantinePolicy == null ? Optional.empty() : Optional.ofNullable(this.quarantinePolicy);
    }

    /**
     * The retention policy for a container registry.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable RetentionPolicyResponse retentionPolicy;

    public Optional<RetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy == null ? Optional.empty() : Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The content trust policy for a container registry.
     * 
     */
    @InputImport(name="trustPolicy")
    private final @Nullable TrustPolicyResponse trustPolicy;

    public Optional<TrustPolicyResponse> getTrustPolicy() {
        return this.trustPolicy == null ? Optional.empty() : Optional.ofNullable(this.trustPolicy);
    }

    public PoliciesResponse(
        @Nullable QuarantinePolicyResponse quarantinePolicy,
        @Nullable RetentionPolicyResponse retentionPolicy,
        @Nullable TrustPolicyResponse trustPolicy) {
        this.quarantinePolicy = quarantinePolicy;
        this.retentionPolicy = retentionPolicy;
        this.trustPolicy = trustPolicy;
    }

    private PoliciesResponse() {
        this.quarantinePolicy = null;
        this.retentionPolicy = null;
        this.trustPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QuarantinePolicyResponse quarantinePolicy;
        private @Nullable RetentionPolicyResponse retentionPolicy;
        private @Nullable TrustPolicyResponse trustPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quarantinePolicy = defaults.quarantinePolicy;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.trustPolicy = defaults.trustPolicy;
        }

        public Builder setQuarantinePolicy(@Nullable QuarantinePolicyResponse quarantinePolicy) {
            this.quarantinePolicy = quarantinePolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setTrustPolicy(@Nullable TrustPolicyResponse trustPolicy) {
            this.trustPolicy = trustPolicy;
            return this;
        }

        public PoliciesResponse build() {
            return new PoliciesResponse(quarantinePolicy, retentionPolicy, trustPolicy);
        }
    }
}
