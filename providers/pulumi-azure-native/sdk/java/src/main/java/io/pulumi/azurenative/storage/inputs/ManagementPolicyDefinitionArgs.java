// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyActionArgs;
import io.pulumi.azurenative.storage.inputs.ManagementPolicyFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that defines the Lifecycle rule. Each definition is made up with a filters set and an actions set.
 * 
 */
public final class ManagementPolicyDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyDefinitionArgs Empty = new ManagementPolicyDefinitionArgs();

    /**
     * An object that defines the action set.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<ManagementPolicyActionArgs> actions;

    public Output<ManagementPolicyActionArgs> getActions() {
        return this.actions;
    }

    /**
     * An object that defines the filter set.
     * 
     */
    @Import(name="filters")
      private final @Nullable Output<ManagementPolicyFilterArgs> filters;

    public Output<ManagementPolicyFilterArgs> getFilters() {
        return this.filters == null ? Output.empty() : this.filters;
    }

    public ManagementPolicyDefinitionArgs(
        Output<ManagementPolicyActionArgs> actions,
        @Nullable Output<ManagementPolicyFilterArgs> filters) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.filters = filters;
    }

    private ManagementPolicyDefinitionArgs() {
        this.actions = Output.empty();
        this.filters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagementPolicyActionArgs> actions;
        private @Nullable Output<ManagementPolicyFilterArgs> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.filters = defaults.filters;
        }

        public Builder actions(Output<ManagementPolicyActionArgs> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder actions(ManagementPolicyActionArgs actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder filters(@Nullable Output<ManagementPolicyFilterArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder filters(@Nullable ManagementPolicyFilterArgs filters) {
            this.filters = Output.ofNullable(filters);
            return this;
        }
        public ManagementPolicyDefinitionArgs build() {
            return new ManagementPolicyDefinitionArgs(actions, filters);
        }
    }
}
