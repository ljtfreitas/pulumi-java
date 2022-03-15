// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlServerRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerRegistrationArgs Empty = new SqlServerRegistrationArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional Properties as JSON string
     * 
     */
    @Import(name="propertyBag")
      private final @Nullable Output<String> propertyBag;

    public Output<String> getPropertyBag() {
        return this.propertyBag == null ? Output.empty() : this.propertyBag;
    }

    /**
     * Resource Group Name
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup == null ? Output.empty() : this.resourceGroup;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Server registration.
     * 
     */
    @Import(name="sqlServerRegistrationName")
      private final @Nullable Output<String> sqlServerRegistrationName;

    public Output<String> getSqlServerRegistrationName() {
        return this.sqlServerRegistrationName == null ? Output.empty() : this.sqlServerRegistrationName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId == null ? Output.empty() : this.subscriptionId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SqlServerRegistrationArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> propertyBag,
        @Nullable Output<String> resourceGroup,
        Output<String> resourceGroupName,
        @Nullable Output<String> sqlServerRegistrationName,
        @Nullable Output<String> subscriptionId,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.propertyBag = propertyBag;
        this.resourceGroup = resourceGroup;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlServerRegistrationName = sqlServerRegistrationName;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private SqlServerRegistrationArgs() {
        this.location = Output.empty();
        this.propertyBag = Output.empty();
        this.resourceGroup = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sqlServerRegistrationName = Output.empty();
        this.subscriptionId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> propertyBag;
        private @Nullable Output<String> resourceGroup;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sqlServerRegistrationName;
        private @Nullable Output<String> subscriptionId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.propertyBag = defaults.propertyBag;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlServerRegistrationName = defaults.sqlServerRegistrationName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder propertyBag(@Nullable Output<String> propertyBag) {
            this.propertyBag = propertyBag;
            return this;
        }

        public Builder propertyBag(@Nullable String propertyBag) {
            this.propertyBag = Output.ofNullable(propertyBag);
            return this;
        }

        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Output.ofNullable(resourceGroup);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sqlServerRegistrationName(@Nullable Output<String> sqlServerRegistrationName) {
            this.sqlServerRegistrationName = sqlServerRegistrationName;
            return this;
        }

        public Builder sqlServerRegistrationName(@Nullable String sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Output.ofNullable(sqlServerRegistrationName);
            return this;
        }

        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Output.ofNullable(subscriptionId);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public SqlServerRegistrationArgs build() {
            return new SqlServerRegistrationArgs(location, propertyBag, resourceGroup, resourceGroupName, sqlServerRegistrationName, subscriptionId, tags);
        }
    }
}
