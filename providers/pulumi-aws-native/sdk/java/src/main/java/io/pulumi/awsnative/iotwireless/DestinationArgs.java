// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.enums.DestinationExpressionType;
import io.pulumi.awsnative.iotwireless.inputs.DestinationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * Destination description
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Destination expression
     * 
     */
    @InputImport(name="expression", required=true)
        private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * Must be RuleName
     * 
     */
    @InputImport(name="expressionType", required=true)
        private final Input<DestinationExpressionType> expressionType;

    public Input<DestinationExpressionType> getExpressionType() {
        return this.expressionType;
    }

    /**
     * Unique name of destination
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * AWS role ARN that grants access
     * 
     */
    @InputImport(name="roleArn", required=true)
        private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<DestinationTagArgs>> tags;

    public Input<List<DestinationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DestinationArgs(
        @Nullable Input<String> description,
        Input<String> expression,
        Input<DestinationExpressionType> expressionType,
        @Nullable Input<String> name,
        Input<String> roleArn,
        @Nullable Input<List<DestinationTagArgs>> tags) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.expressionType = Objects.requireNonNull(expressionType, "expected parameter 'expressionType' to be non-null");
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private DestinationArgs() {
        this.description = Input.empty();
        this.expression = Input.empty();
        this.expressionType = Input.empty();
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> expression;
        private Input<DestinationExpressionType> expressionType;
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private @Nullable Input<List<DestinationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.expressionType = defaults.expressionType;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setExpressionType(Input<DestinationExpressionType> expressionType) {
            this.expressionType = Objects.requireNonNull(expressionType);
            return this;
        }

        public Builder setExpressionType(DestinationExpressionType expressionType) {
            this.expressionType = Input.of(Objects.requireNonNull(expressionType));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DestinationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DestinationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DestinationArgs build() {
            return new DestinationArgs(description, expression, expressionType, name, roleArn, tags);
        }
    }
}
