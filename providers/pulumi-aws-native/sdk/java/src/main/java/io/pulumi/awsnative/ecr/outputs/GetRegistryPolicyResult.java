// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryPolicyResult {
    /**
     * The JSON policy text to apply to your registry. The policy text follows the same format as IAM policy text. For more information, see Registry permissions (https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html) in the Amazon Elastic Container Registry User Guide.
     * 
     */
    private final @Nullable Object policyText;
    private final @Nullable String registryId;

    @OutputCustomType.Constructor
    private GetRegistryPolicyResult(
        @OutputCustomType.Parameter("policyText") @Nullable Object policyText,
        @OutputCustomType.Parameter("registryId") @Nullable String registryId) {
        this.policyText = policyText;
        this.registryId = registryId;
    }

    /**
     * The JSON policy text to apply to your registry. The policy text follows the same format as IAM policy text. For more information, see Registry permissions (https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html) in the Amazon Elastic Container Registry User Guide.
     * 
    */
    public Optional<Object> getPolicyText() {
        return Optional.ofNullable(this.policyText);
    }
    public Optional<String> getRegistryId() {
        return Optional.ofNullable(this.registryId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object policyText;
        private @Nullable String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyText = defaults.policyText;
    	      this.registryId = defaults.registryId;
        }

        public Builder setPolicyText(@Nullable Object policyText) {
            this.policyText = policyText;
            return this;
        }

        public Builder setRegistryId(@Nullable String registryId) {
            this.registryId = registryId;
            return this;
        }
        public GetRegistryPolicyResult build() {
            return new GetRegistryPolicyResult(policyText, registryId);
        }
    }
}
