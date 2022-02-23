// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This activity verifies that an external resource exists.
 * 
 */
public final class ValidationActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidationActivityResponse Empty = new ValidationActivityResponse();

    /**
     * Can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="childItems")
        private final @Nullable Object childItems;

    public Optional<Object> getChildItems() {
        return this.childItems == null ? Optional.empty() : Optional.ofNullable(this.childItems);
    }

    /**
     * Validation activity dataset reference.
     * 
     */
    @InputImport(name="dataset", required=true)
        private final DatasetReferenceResponse dataset;

    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
        private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="minimumSize")
        private final @Nullable Object minimumSize;

    public Optional<Object> getMinimumSize() {
        return this.minimumSize == null ? Optional.empty() : Optional.ofNullable(this.minimumSize);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * A delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sleep")
        private final @Nullable Object sleep;

    public Optional<Object> getSleep() {
        return this.sleep == null ? Optional.empty() : Optional.ofNullable(this.sleep);
    }

    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="timeout")
        private final @Nullable Object timeout;

    public Optional<Object> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is 'Validation'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
        private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public ValidationActivityResponse(
        @Nullable Object childItems,
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object minimumSize,
        String name,
        @Nullable Object sleep,
        @Nullable Object timeout,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
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

    private ValidationActivityResponse() {
        this.childItems = null;
        this.dataset = null;
        this.dependsOn = List.of();
        this.description = null;
        this.minimumSize = null;
        this.name = null;
        this.sleep = null;
        this.timeout = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object childItems;
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object minimumSize;
        private String name;
        private @Nullable Object sleep;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationActivityResponse defaults) {
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

        public Builder setChildItems(@Nullable Object childItems) {
            this.childItems = childItems;
            return this;
        }

        public Builder setDataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMinimumSize(@Nullable Object minimumSize) {
            this.minimumSize = minimumSize;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSleep(@Nullable Object sleep) {
            this.sleep = sleep;
            return this;
        }

        public Builder setTimeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public ValidationActivityResponse build() {
            return new ValidationActivityResponse(childItems, dataset, dependsOn, description, minimumSize, name, sleep, timeout, type, userProperties);
        }
    }
}
