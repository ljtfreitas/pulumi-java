// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePlacementConstraint {
    /**
     * Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    private final @Nullable String expression;
    /**
     * Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ServicePlacementConstraint(
        @CustomType.Parameter("expression") @Nullable String expression,
        @CustomType.Parameter("type") String type) {
        this.expression = expression;
        this.type = type;
    }

    /**
     * Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
    */
    public Optional<String> getExpression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expression;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ServicePlacementConstraint build() {
            return new ServicePlacementConstraint(expression, type);
        }
    }
}
