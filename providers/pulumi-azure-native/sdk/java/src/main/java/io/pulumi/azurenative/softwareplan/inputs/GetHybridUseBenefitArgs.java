// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.softwareplan.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridUseBenefitArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHybridUseBenefitArgs Empty = new GetHybridUseBenefitArgs();

    /**
     * This is a unique identifier for a plan. Should be a guid.
     * 
     */
    @Import(name="planId", required=true)
      private final String planId;

    public String getPlanId() {
        return this.planId;
    }

    /**
     * The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetHybridUseBenefitArgs(
        String planId,
        String scope) {
        this.planId = Objects.requireNonNull(planId, "expected parameter 'planId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetHybridUseBenefitArgs() {
        this.planId = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridUseBenefitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String planId;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridUseBenefitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planId = defaults.planId;
    	      this.scope = defaults.scope;
        }

        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetHybridUseBenefitArgs build() {
            return new GetHybridUseBenefitArgs(planId, scope);
        }
    }
}
