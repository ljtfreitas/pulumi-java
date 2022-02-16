// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceGroupManagerStatusStatefulPerInstanceConfig {
    private final @Nullable Boolean allEffective;

    @OutputCustomType.Constructor({"allEffective"})
    private InstanceGroupManagerStatusStatefulPerInstanceConfig(@Nullable Boolean allEffective) {
        this.allEffective = allEffective;
    }

    public Optional<Boolean> getAllEffective() {
        return Optional.ofNullable(this.allEffective);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allEffective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allEffective = defaults.allEffective;
        }

        public Builder setAllEffective(@Nullable Boolean allEffective) {
            this.allEffective = allEffective;
            return this;
        }

        public InstanceGroupManagerStatusStatefulPerInstanceConfig build() {
            return new InstanceGroupManagerStatusStatefulPerInstanceConfig(allEffective);
        }
    }
}