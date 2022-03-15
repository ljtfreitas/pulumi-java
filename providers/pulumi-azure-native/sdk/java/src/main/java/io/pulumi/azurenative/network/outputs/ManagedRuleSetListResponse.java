// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FrontDoorManagedRuleSetResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedRuleSetListResponse {
    /**
     * List of rule sets.
     * 
     */
    private final @Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets;

    @CustomType.Constructor
    private ManagedRuleSetListResponse(@CustomType.Parameter("managedRuleSets") @Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
    }

    /**
     * List of rule sets.
     * 
    */
    public List<FrontDoorManagedRuleSetResponse> getManagedRuleSets() {
        return this.managedRuleSets == null ? List.of() : this.managedRuleSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder managedRuleSets(@Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets) {
            this.managedRuleSets = managedRuleSets;
            return this;
        }
        public ManagedRuleSetListResponse build() {
            return new ManagedRuleSetListResponse(managedRuleSets);
        }
    }
}
