// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServicePlacementStrategyType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePlacementStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePlacementStrategyArgs Empty = new ServicePlacementStrategyArgs();

    @InputImport(name="field")
        private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    @InputImport(name="type", required=true)
        private final Input<ServicePlacementStrategyType> type;

    public Input<ServicePlacementStrategyType> getType() {
        return this.type;
    }

    public ServicePlacementStrategyArgs(
        @Nullable Input<String> field,
        Input<ServicePlacementStrategyType> type) {
        this.field = field;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementStrategyArgs() {
        this.field = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> field;
        private Input<ServicePlacementStrategyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setType(Input<ServicePlacementStrategyType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ServicePlacementStrategyType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ServicePlacementStrategyArgs build() {
            return new ServicePlacementStrategyArgs(field, type);
        }
    }
}
