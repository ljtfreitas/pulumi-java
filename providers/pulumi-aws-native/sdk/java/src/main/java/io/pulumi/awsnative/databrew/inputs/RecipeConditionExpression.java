// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Condition expressions applied to the step action
 * 
 */
public final class RecipeConditionExpression extends io.pulumi.resources.InvokeArgs {

    public static final RecipeConditionExpression Empty = new RecipeConditionExpression();

    /**
     * Input condition to be applied to the target column
     * 
     */
    @Import(name="condition", required=true)
      private final String condition;

    public String getCondition() {
        return this.condition;
    }

    /**
     * Name of the target column
     * 
     */
    @Import(name="targetColumn", required=true)
      private final String targetColumn;

    public String getTargetColumn() {
        return this.targetColumn;
    }

    /**
     * Value of the condition
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public RecipeConditionExpression(
        String condition,
        String targetColumn,
        @Nullable String value) {
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.targetColumn = Objects.requireNonNull(targetColumn, "expected parameter 'targetColumn' to be non-null");
        this.value = value;
    }

    private RecipeConditionExpression() {
        this.condition = null;
        this.targetColumn = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeConditionExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private String targetColumn;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeConditionExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.targetColumn = defaults.targetColumn;
    	      this.value = defaults.value;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder targetColumn(String targetColumn) {
            this.targetColumn = Objects.requireNonNull(targetColumn);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public RecipeConditionExpression build() {
            return new RecipeConditionExpression(condition, targetColumn, value);
        }
    }
}
