// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstancePropertiesArgs;
import io.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstanceSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlManagedInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlManagedInstanceArgs Empty = new SqlManagedInstanceArgs();

    /**
     * The extendedLocation of the resource.
     * 
     */
    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * null
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<SqlManagedInstancePropertiesArgs> properties;

    public Input<SqlManagedInstancePropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource sku.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SqlManagedInstanceSkuArgs> sku;

    public Input<SqlManagedInstanceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The name of SQL Managed Instances
     * 
     */
    @InputImport(name="sqlManagedInstanceName")
    private final @Nullable Input<String> sqlManagedInstanceName;

    public Input<String> getSqlManagedInstanceName() {
        return this.sqlManagedInstanceName == null ? Input.empty() : this.sqlManagedInstanceName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SqlManagedInstanceArgs(
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> location,
        Input<SqlManagedInstancePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<SqlManagedInstanceSkuArgs> sku,
        @Nullable Input<String> sqlManagedInstanceName,
        @Nullable Input<Map<String,String>> tags) {
        this.extendedLocation = extendedLocation;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.sqlManagedInstanceName = sqlManagedInstanceName;
        this.tags = tags;
    }

    private SqlManagedInstanceArgs() {
        this.extendedLocation = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.sqlManagedInstanceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> location;
        private Input<SqlManagedInstancePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<SqlManagedInstanceSkuArgs> sku;
        private @Nullable Input<String> sqlManagedInstanceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlManagedInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.sqlManagedInstanceName = defaults.sqlManagedInstanceName;
    	      this.tags = defaults.tags;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
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

        public Builder setProperties(Input<SqlManagedInstancePropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(SqlManagedInstancePropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<SqlManagedInstanceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SqlManagedInstanceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSqlManagedInstanceName(@Nullable Input<String> sqlManagedInstanceName) {
            this.sqlManagedInstanceName = sqlManagedInstanceName;
            return this;
        }

        public Builder setSqlManagedInstanceName(@Nullable String sqlManagedInstanceName) {
            this.sqlManagedInstanceName = Input.ofNullable(sqlManagedInstanceName);
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

        public SqlManagedInstanceArgs build() {
            return new SqlManagedInstanceArgs(extendedLocation, location, properties, resourceGroupName, sku, sqlManagedInstanceName, tags);
        }
    }
}
