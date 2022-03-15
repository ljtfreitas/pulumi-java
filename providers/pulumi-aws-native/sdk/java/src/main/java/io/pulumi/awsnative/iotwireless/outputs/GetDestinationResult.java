// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.enums.DestinationExpressionType;
import io.pulumi.awsnative.iotwireless.outputs.DestinationTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDestinationResult {
    /**
     * Destination arn. Returned after successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * Destination description
     * 
     */
    private final @Nullable String description;
    /**
     * Destination expression
     * 
     */
    private final @Nullable String expression;
    /**
     * Must be RuleName
     * 
     */
    private final @Nullable DestinationExpressionType expressionType;
    /**
     * AWS role ARN that grants access
     * 
     */
    private final @Nullable String roleArn;
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    private final @Nullable List<DestinationTag> tags;

    @CustomType.Constructor
    private GetDestinationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") @Nullable String expression,
        @CustomType.Parameter("expressionType") @Nullable DestinationExpressionType expressionType,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("tags") @Nullable List<DestinationTag> tags) {
        this.arn = arn;
        this.description = description;
        this.expression = expression;
        this.expressionType = expressionType;
        this.roleArn = roleArn;
        this.tags = tags;
    }

    /**
     * Destination arn. Returned after successful create.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Destination description
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Destination expression
     * 
    */
    public Optional<String> getExpression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * Must be RuleName
     * 
    */
    public Optional<DestinationExpressionType> getExpressionType() {
        return Optional.ofNullable(this.expressionType);
    }
    /**
     * AWS role ARN that grants access
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
    */
    public List<DestinationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDestinationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String expression;
        private @Nullable DestinationExpressionType expressionType;
        private @Nullable String roleArn;
        private @Nullable List<DestinationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDestinationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.expressionType = defaults.expressionType;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }

        public Builder expressionType(@Nullable DestinationExpressionType expressionType) {
            this.expressionType = expressionType;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder tags(@Nullable List<DestinationTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDestinationResult build() {
            return new GetDestinationResult(arn, description, expression, expressionType, roleArn, tags);
        }
    }
}
