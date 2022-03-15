// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.FlowSchemaConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FlowSchemaStatus represents the current state of a FlowSchema.
 * 
 */
public final class FlowSchemaStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSchemaStatusArgs Empty = new FlowSchemaStatusArgs();

    /**
     * `conditions` is a list of the current states of FlowSchema.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<FlowSchemaConditionArgs>> conditions;

    public Output<List<FlowSchemaConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    public FlowSchemaStatusArgs(@Nullable Output<List<FlowSchemaConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private FlowSchemaStatusArgs() {
        this.conditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FlowSchemaConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable Output<List<FlowSchemaConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<FlowSchemaConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public FlowSchemaStatusArgs build() {
            return new FlowSchemaStatusArgs(conditions);
        }
    }
}
