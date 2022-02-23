// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This activity verifies that an external resource exists.
 * 
 */
public final class ValidationActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidationActivityArgs Empty = new ValidationActivityArgs();

    /**
     * Can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="childItems")
        private final @Nullable Input<Object> childItems;

    public Input<Object> getChildItems() {
        return this.childItems == null ? Input.empty() : this.childItems;
    }

    /**
     * Validation activity dataset reference.
     * 
     */
    @InputImport(name="dataset", required=true)
        private final Input<DatasetReferenceArgs> dataset;

    public Input<DatasetReferenceArgs> getDataset() {
        return this.dataset;
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
     * Can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="minimumSize")
        private final @Nullable Input<Object> minimumSize;

    public Input<Object> getMinimumSize() {
        return this.minimumSize == null ? Input.empty() : this.minimumSize;
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
     * A delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sleep")
        private final @Nullable Input<Object> sleep;

    public Input<Object> getSleep() {
        return this.sleep == null ? Input.empty() : this.sleep;
    }

    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="timeout")
        private final @Nullable Input<Object> timeout;

    public Input<Object> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Type of activity.
     * Expected value is 'Validation'.
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

    public ValidationActivityArgs(
        @Nullable Input<Object> childItems,
        Input<DatasetReferenceArgs> dataset,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> minimumSize,
        Input<String> name,
        @Nullable Input<Object> sleep,
        @Nullable Input<Object> timeout,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.childItems = childItems;
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.minimumSize = minimumSize;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sleep = sleep;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ValidationActivityArgs() {
        this.childItems = Input.empty();
        this.dataset = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.minimumSize = Input.empty();
        this.name = Input.empty();
        this.sleep = Input.empty();
        this.timeout = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> childItems;
        private Input<DatasetReferenceArgs> dataset;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> minimumSize;
        private Input<String> name;
        private @Nullable Input<Object> sleep;
        private @Nullable Input<Object> timeout;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childItems = defaults.childItems;
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.minimumSize = defaults.minimumSize;
    	      this.name = defaults.name;
    	      this.sleep = defaults.sleep;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setChildItems(@Nullable Input<Object> childItems) {
            this.childItems = childItems;
            return this;
        }

        public Builder setChildItems(@Nullable Object childItems) {
            this.childItems = Input.ofNullable(childItems);
            return this;
        }

        public Builder setDataset(Input<DatasetReferenceArgs> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDataset(DatasetReferenceArgs dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
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

        public Builder setMinimumSize(@Nullable Input<Object> minimumSize) {
            this.minimumSize = minimumSize;
            return this;
        }

        public Builder setMinimumSize(@Nullable Object minimumSize) {
            this.minimumSize = Input.ofNullable(minimumSize);
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

        public Builder setSleep(@Nullable Input<Object> sleep) {
            this.sleep = sleep;
            return this;
        }

        public Builder setSleep(@Nullable Object sleep) {
            this.sleep = Input.ofNullable(sleep);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Object> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Object timeout) {
            this.timeout = Input.ofNullable(timeout);
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
        public ValidationActivityArgs build() {
            return new ValidationActivityArgs(childItems, dataset, dependsOn, description, minimumSize, name, sleep, timeout, type, userProperties);
        }
    }
}
