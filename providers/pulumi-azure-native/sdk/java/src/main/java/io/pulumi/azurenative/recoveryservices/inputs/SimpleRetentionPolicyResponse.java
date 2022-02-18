// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.RetentionDurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Simple policy retention.
 * 
 */
public final class SimpleRetentionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SimpleRetentionPolicyResponse Empty = new SimpleRetentionPolicyResponse();

    /**
     * Retention duration of the protection policy.
     * 
     */
    @InputImport(name="retentionDuration")
    private final @Nullable RetentionDurationResponse retentionDuration;

    public Optional<RetentionDurationResponse> getRetentionDuration() {
        return this.retentionDuration == null ? Optional.empty() : Optional.ofNullable(this.retentionDuration);
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleRetentionPolicy'.
     * 
     */
    @InputImport(name="retentionPolicyType", required=true)
    private final String retentionPolicyType;

    public String getRetentionPolicyType() {
        return this.retentionPolicyType;
    }

    public SimpleRetentionPolicyResponse(
        @Nullable RetentionDurationResponse retentionDuration,
        String retentionPolicyType) {
        this.retentionDuration = retentionDuration;
        this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType, "expected parameter 'retentionPolicyType' to be non-null");
    }

    private SimpleRetentionPolicyResponse() {
        this.retentionDuration = null;
        this.retentionPolicyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RetentionDurationResponse retentionDuration;
        private String retentionPolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
        }

        public Builder setRetentionDuration(@Nullable RetentionDurationResponse retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }

        public Builder setRetentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }

        public SimpleRetentionPolicyResponse build() {
            return new SimpleRetentionPolicyResponse(retentionDuration, retentionPolicyType);
        }
    }
}
