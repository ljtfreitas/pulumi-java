// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServicePlacementConstraintType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePlacementConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePlacementConstraintArgs Empty = new ServicePlacementConstraintArgs();

    @InputImport(name="expression")
        private final @Nullable Input<String> expression;

    public Input<String> getExpression() {
        return this.expression == null ? Input.empty() : this.expression;
    }

    @InputImport(name="type", required=true)
        private final Input<ServicePlacementConstraintType> type;

    public Input<ServicePlacementConstraintType> getType() {
        return this.type;
    }

    public ServicePlacementConstraintArgs(
        @Nullable Input<String> expression,
        Input<ServicePlacementConstraintType> type) {
        this.expression = expression;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementConstraintArgs() {
        this.expression = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expression;
        private Input<ServicePlacementConstraintType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder setExpression(@Nullable Input<String> expression) {
            this.expression = expression;
            return this;
        }

        public Builder setExpression(@Nullable String expression) {
            this.expression = Input.ofNullable(expression);
            return this;
        }

        public Builder setType(Input<ServicePlacementConstraintType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ServicePlacementConstraintType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ServicePlacementConstraintArgs build() {
            return new ServicePlacementConstraintArgs(expression, type);
        }
    }
}
