// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ManagedRuleSetResponse;
import io.pulumi.azurenative.network.inputs.OwaspCrsExclusionEntryResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 * 
 */
public final class ManagedRulesDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRulesDefinitionResponse Empty = new ManagedRulesDefinitionResponse();

    /**
     * The Exclusions that are applied on the policy.
     * 
     */
    @InputImport(name="exclusions")
        private final @Nullable List<OwaspCrsExclusionEntryResponse> exclusions;

    public List<OwaspCrsExclusionEntryResponse> getExclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }

    /**
     * The managed rule sets that are associated with the policy.
     * 
     */
    @InputImport(name="managedRuleSets", required=true)
        private final List<ManagedRuleSetResponse> managedRuleSets;

    public List<ManagedRuleSetResponse> getManagedRuleSets() {
        return this.managedRuleSets;
    }

    public ManagedRulesDefinitionResponse(
        @Nullable List<OwaspCrsExclusionEntryResponse> exclusions,
        List<ManagedRuleSetResponse> managedRuleSets) {
        this.exclusions = exclusions;
        this.managedRuleSets = Objects.requireNonNull(managedRuleSets, "expected parameter 'managedRuleSets' to be non-null");
    }

    private ManagedRulesDefinitionResponse() {
        this.exclusions = List.of();
        this.managedRuleSets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRulesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OwaspCrsExclusionEntryResponse> exclusions;
        private List<ManagedRuleSetResponse> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRulesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder setExclusions(@Nullable List<OwaspCrsExclusionEntryResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setManagedRuleSets(List<ManagedRuleSetResponse> managedRuleSets) {
            this.managedRuleSets = Objects.requireNonNull(managedRuleSets);
            return this;
        }
        public ManagedRulesDefinitionResponse build() {
            return new ManagedRulesDefinitionResponse(exclusions, managedRuleSets);
        }
    }
}
