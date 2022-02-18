// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filter and return results from input array based on the conditions.
 * 
 */
public final class FilterActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterActivityArgs Empty = new FilterActivityArgs();

    /**
     * Condition to be used for filtering the input.
     * 
     */
    @InputImport(name="condition", required=true)
    private final Input<ExpressionArgs> condition;

    public Input<ExpressionArgs> getCondition() {
        return this.condition;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Input array on which filter should be applied.
     * 
     */
    @InputImport(name="items", required=true)
    private final Input<ExpressionArgs> items;

    public Input<ExpressionArgs> getItems() {
        return this.items;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'Filter'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public FilterActivityArgs(
        Input<ExpressionArgs> condition,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<ExpressionArgs> items,
        Input<String> name,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private FilterActivityArgs() {
        this.condition = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.items = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ExpressionArgs> condition;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<ExpressionArgs> items;
        private Input<String> name;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCondition(Input<ExpressionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(ExpressionArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setItems(Input<ExpressionArgs> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(ExpressionArgs items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public FilterActivityArgs build() {
            return new FilterActivityArgs(condition, dependsOn, description, items, name, type, userProperties);
        }
    }
}
