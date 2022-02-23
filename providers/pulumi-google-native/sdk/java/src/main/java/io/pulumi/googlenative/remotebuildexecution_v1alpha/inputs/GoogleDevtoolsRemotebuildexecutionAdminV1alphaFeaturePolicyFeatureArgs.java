// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="allowedValues")
      private final @Nullable Input<List<String>> allowedValues;

    public Input<List<String>> getAllowedValues() {
        return this.allowedValues == null ? Input.empty() : this.allowedValues;
    }

    /**
     * The policy of the feature.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy;

    public Input<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(
        @Nullable Input<List<String>> allowedValues,
        @Nullable Input<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy) {
        this.allowedValues = allowedValues;
        this.policy = policy;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs() {
        this.allowedValues = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedValues;
        private @Nullable Input<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.policy = defaults.policy;
        }

        public Builder setAllowedValues(@Nullable Input<List<String>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setAllowedValues(@Nullable List<String> allowedValues) {
            this.allowedValues = Input.ofNullable(allowedValues);
            return this;
        }

        public Builder setPolicy(@Nullable Input<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(allowedValues, policy);
        }
    }
}
