// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrustPolicyResponse {
    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    private final @Nullable String status;
    /**
     * The type of trust policy.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private TrustPolicyResponse(
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("type") @Nullable String type) {
        this.status = status;
        this.type = type;
    }

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The type of trust policy.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public TrustPolicyResponse build() {
            return new TrustPolicyResponse(status, type);
        }
    }
}
