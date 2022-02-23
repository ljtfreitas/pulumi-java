// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.RetentionPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogProfileArgs Empty = new LogProfileArgs();

    /**
     * the categories of the logs. These categories are created as is convenient to the user. Some values are: 'Write', 'Delete', and/or 'Action.'
     * 
     */
    @InputImport(name="categories", required=true)
        private final Input<List<String>> categories;

    public Input<List<String>> getCategories() {
        return this.categories;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the 'global' location.
     * 
     */
    @InputImport(name="locations", required=true)
        private final Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations;
    }

    /**
     * The name of the log profile.
     * 
     */
    @InputImport(name="logProfileName")
        private final @Nullable Input<String> logProfileName;

    public Input<String> getLogProfileName() {
        return this.logProfileName == null ? Input.empty() : this.logProfileName;
    }

    /**
     * the retention policy for the events in the log.
     * 
     */
    @InputImport(name="retentionPolicy", required=true)
        private final Input<RetentionPolicyArgs> retentionPolicy;

    public Input<RetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource ID}/authorizationrules/{key name}'.
     * 
     */
    @InputImport(name="serviceBusRuleId")
        private final @Nullable Input<String> serviceBusRuleId;

    public Input<String> getServiceBusRuleId() {
        return this.serviceBusRuleId == null ? Input.empty() : this.serviceBusRuleId;
    }

    /**
     * the resource id of the storage account to which you would like to send the Activity Log.
     * 
     */
    @InputImport(name="storageAccountId")
        private final @Nullable Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId == null ? Input.empty() : this.storageAccountId;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LogProfileArgs(
        Input<List<String>> categories,
        @Nullable Input<String> location,
        Input<List<String>> locations,
        @Nullable Input<String> logProfileName,
        Input<RetentionPolicyArgs> retentionPolicy,
        @Nullable Input<String> serviceBusRuleId,
        @Nullable Input<String> storageAccountId,
        @Nullable Input<Map<String,String>> tags) {
        this.categories = Objects.requireNonNull(categories, "expected parameter 'categories' to be non-null");
        this.location = location;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.logProfileName = logProfileName;
        this.retentionPolicy = Objects.requireNonNull(retentionPolicy, "expected parameter 'retentionPolicy' to be non-null");
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.tags = tags;
    }

    private LogProfileArgs() {
        this.categories = Input.empty();
        this.location = Input.empty();
        this.locations = Input.empty();
        this.logProfileName = Input.empty();
        this.retentionPolicy = Input.empty();
        this.serviceBusRuleId = Input.empty();
        this.storageAccountId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> categories;
        private @Nullable Input<String> location;
        private Input<List<String>> locations;
        private @Nullable Input<String> logProfileName;
        private Input<RetentionPolicyArgs> retentionPolicy;
        private @Nullable Input<String> serviceBusRuleId;
        private @Nullable Input<String> storageAccountId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LogProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.logProfileName = defaults.logProfileName;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.tags = defaults.tags;
        }

        public Builder setCategories(Input<List<String>> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder setCategories(List<String> categories) {
            this.categories = Input.of(Objects.requireNonNull(categories));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLocations(Input<List<String>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
            return this;
        }

        public Builder setLogProfileName(@Nullable Input<String> logProfileName) {
            this.logProfileName = logProfileName;
            return this;
        }

        public Builder setLogProfileName(@Nullable String logProfileName) {
            this.logProfileName = Input.ofNullable(logProfileName);
            return this;
        }

        public Builder setRetentionPolicy(Input<RetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
            return this;
        }

        public Builder setRetentionPolicy(RetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Input.of(Objects.requireNonNull(retentionPolicy));
            return this;
        }

        public Builder setServiceBusRuleId(@Nullable Input<String> serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        public Builder setServiceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = Input.ofNullable(serviceBusRuleId);
            return this;
        }

        public Builder setStorageAccountId(@Nullable Input<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Input.ofNullable(storageAccountId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LogProfileArgs build() {
            return new LogProfileArgs(categories, location, locations, logProfileName, retentionPolicy, serviceBusRuleId, storageAccountId, tags);
        }
    }
}
