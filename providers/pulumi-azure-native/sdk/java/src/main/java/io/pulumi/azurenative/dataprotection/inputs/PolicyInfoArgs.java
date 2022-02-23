// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.PolicyParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy Info in backupInstance
 * 
 */
public final class PolicyInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyInfoArgs Empty = new PolicyInfoArgs();

    @InputImport(name="policyId", required=true)
        private final Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId;
    }

    /**
     * Policy parameters for the backup instance
     * 
     */
    @InputImport(name="policyParameters")
        private final @Nullable Input<PolicyParametersArgs> policyParameters;

    public Input<PolicyParametersArgs> getPolicyParameters() {
        return this.policyParameters == null ? Input.empty() : this.policyParameters;
    }

    public PolicyInfoArgs(
        Input<String> policyId,
        @Nullable Input<PolicyParametersArgs> policyParameters) {
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.policyParameters = policyParameters;
    }

    private PolicyInfoArgs() {
        this.policyId = Input.empty();
        this.policyParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyId;
        private @Nullable Input<PolicyParametersArgs> policyParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.policyParameters = defaults.policyParameters;
        }

        public Builder setPolicyId(Input<String> policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Input.of(Objects.requireNonNull(policyId));
            return this;
        }

        public Builder setPolicyParameters(@Nullable Input<PolicyParametersArgs> policyParameters) {
            this.policyParameters = policyParameters;
            return this;
        }

        public Builder setPolicyParameters(@Nullable PolicyParametersArgs policyParameters) {
            this.policyParameters = Input.ofNullable(policyParameters);
            return this;
        }
        public PolicyInfoArgs build() {
            return new PolicyInfoArgs(policyId, policyParameters);
        }
    }
}
