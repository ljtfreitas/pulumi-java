// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FrontDoorManagedRuleSetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the list of managed rule sets for the policy.
 * 
 */
public final class ManagedRuleSetListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleSetListArgs Empty = new ManagedRuleSetListArgs();

    /**
     * List of rule sets.
     * 
     */
    @InputImport(name="managedRuleSets")
    private final @Nullable Input<List<FrontDoorManagedRuleSetArgs>> managedRuleSets;

    public Input<List<FrontDoorManagedRuleSetArgs>> getManagedRuleSets() {
        return this.managedRuleSets == null ? Input.empty() : this.managedRuleSets;
    }

    public ManagedRuleSetListArgs(@Nullable Input<List<FrontDoorManagedRuleSetArgs>> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
    }

    private ManagedRuleSetListArgs() {
        this.managedRuleSets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FrontDoorManagedRuleSetArgs>> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder setManagedRuleSets(@Nullable Input<List<FrontDoorManagedRuleSetArgs>> managedRuleSets) {
            this.managedRuleSets = managedRuleSets;
            return this;
        }

        public Builder setManagedRuleSets(@Nullable List<FrontDoorManagedRuleSetArgs> managedRuleSets) {
            this.managedRuleSets = Input.ofNullable(managedRuleSets);
            return this;
        }

        public ManagedRuleSetListArgs build() {
            return new ManagedRuleSetListArgs(managedRuleSets);
        }
    }
}
