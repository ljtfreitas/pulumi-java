// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.enums.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines whether a feature can be used or what values are accepted.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs();

    /**
     * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
     */
    @Import(name="allowedValues")
      private final @Nullable Output<List<String>> allowedValues;

    public Output<List<String>> getAllowedValues() {
        return this.allowedValues == null ? Output.empty() : this.allowedValues;
    }

    /**
     * The policy of the feature.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(
        @Nullable Output<List<String>> allowedValues,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy) {
        this.allowedValues = allowedValues;
        this.policy = policy;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs() {
        this.allowedValues = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedValues;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.policy = defaults.policy;
        }

        public Builder allowedValues(@Nullable Output<List<String>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder allowedValues(@Nullable List<String> allowedValues) {
            this.allowedValues = Output.ofNullable(allowedValues);
            return this;
        }

        public Builder policy(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(allowedValues, policy);
        }
    }
}
