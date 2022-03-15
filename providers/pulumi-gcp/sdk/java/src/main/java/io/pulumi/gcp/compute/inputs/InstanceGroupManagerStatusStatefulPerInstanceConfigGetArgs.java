// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs Empty = new InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs();

    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    @Import(name="allEffective")
      private final @Nullable Output<Boolean> allEffective;

    public Output<Boolean> getAllEffective() {
        return this.allEffective == null ? Output.empty() : this.allEffective;
    }

    public InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs(@Nullable Output<Boolean> allEffective) {
        this.allEffective = allEffective;
    }

    private InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs() {
        this.allEffective = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allEffective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allEffective = defaults.allEffective;
        }

        public Builder allEffective(@Nullable Output<Boolean> allEffective) {
            this.allEffective = allEffective;
            return this;
        }

        public Builder allEffective(@Nullable Boolean allEffective) {
            this.allEffective = Output.ofNullable(allEffective);
            return this;
        }
        public InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs build() {
            return new InstanceGroupManagerStatusStatefulPerInstanceConfigGetArgs(allEffective);
        }
    }
}
