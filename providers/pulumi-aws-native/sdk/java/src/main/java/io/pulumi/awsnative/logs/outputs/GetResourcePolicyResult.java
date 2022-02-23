// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourcePolicyResult {
    /**
     * The policy document
     * 
     */
    private final @Nullable String policyDocument;

    @OutputCustomType.Constructor({"policyDocument"})
    private GetResourcePolicyResult(@Nullable String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * The policy document
     * 
     */
    public Optional<String> getPolicyDocument() {
        return Optional.ofNullable(this.policyDocument);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policyDocument;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
        }

        public Builder setPolicyDocument(@Nullable String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public GetResourcePolicyResult build() {
            return new GetResourcePolicyResult(policyDocument);
        }
    }
}
