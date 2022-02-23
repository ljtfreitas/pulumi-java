// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.EdgeUsageDataCollectionPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMediaServiceEdgePoliciesResult {
    private final @Nullable EdgeUsageDataCollectionPolicyResponse usageDataCollectionPolicy;

    @OutputCustomType.Constructor({"usageDataCollectionPolicy"})
    private ListMediaServiceEdgePoliciesResult(@Nullable EdgeUsageDataCollectionPolicyResponse usageDataCollectionPolicy) {
        this.usageDataCollectionPolicy = usageDataCollectionPolicy;
    }

    public Optional<EdgeUsageDataCollectionPolicyResponse> getUsageDataCollectionPolicy() {
        return Optional.ofNullable(this.usageDataCollectionPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMediaServiceEdgePoliciesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EdgeUsageDataCollectionPolicyResponse usageDataCollectionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMediaServiceEdgePoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usageDataCollectionPolicy = defaults.usageDataCollectionPolicy;
        }

        public Builder setUsageDataCollectionPolicy(@Nullable EdgeUsageDataCollectionPolicyResponse usageDataCollectionPolicy) {
            this.usageDataCollectionPolicy = usageDataCollectionPolicy;
            return this;
        }
        public ListMediaServiceEdgePoliciesResult build() {
            return new ListMediaServiceEdgePoliciesResult(usageDataCollectionPolicy);
        }
    }
}
