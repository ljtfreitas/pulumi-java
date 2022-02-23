// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.DataStringComparisonBehavior;
import io.pulumi.azurenative.timeseriesinsights.inputs.ReferenceDataSetKeyPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReferenceDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReferenceDataSetArgs Empty = new ReferenceDataSetArgs();

    /**
     * The reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used.
     * 
     */
    @InputImport(name="dataStringComparisonBehavior")
        private final @Nullable Input<Either<String,DataStringComparisonBehavior>> dataStringComparisonBehavior;

    public Input<Either<String,DataStringComparisonBehavior>> getDataStringComparisonBehavior() {
        return this.dataStringComparisonBehavior == null ? Input.empty() : this.dataStringComparisonBehavior;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
        private final Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * The list of key properties for the reference data set.
     * 
     */
    @InputImport(name="keyProperties", required=true)
        private final Input<List<ReferenceDataSetKeyPropertyArgs>> keyProperties;

    public Input<List<ReferenceDataSetKeyPropertyArgs>> getKeyProperties() {
        return this.keyProperties;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the reference data set.
     * 
     */
    @InputImport(name="referenceDataSetName")
        private final @Nullable Input<String> referenceDataSetName;

    public Input<String> getReferenceDataSetName() {
        return this.referenceDataSetName == null ? Input.empty() : this.referenceDataSetName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ReferenceDataSetArgs(
        @Nullable Input<Either<String,DataStringComparisonBehavior>> dataStringComparisonBehavior,
        Input<String> environmentName,
        Input<List<ReferenceDataSetKeyPropertyArgs>> keyProperties,
        @Nullable Input<String> location,
        @Nullable Input<String> referenceDataSetName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.dataStringComparisonBehavior = dataStringComparisonBehavior;
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.keyProperties = Objects.requireNonNull(keyProperties, "expected parameter 'keyProperties' to be non-null");
        this.location = location;
        this.referenceDataSetName = referenceDataSetName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ReferenceDataSetArgs() {
        this.dataStringComparisonBehavior = Input.empty();
        this.environmentName = Input.empty();
        this.keyProperties = Input.empty();
        this.location = Input.empty();
        this.referenceDataSetName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DataStringComparisonBehavior>> dataStringComparisonBehavior;
        private Input<String> environmentName;
        private Input<List<ReferenceDataSetKeyPropertyArgs>> keyProperties;
        private @Nullable Input<String> location;
        private @Nullable Input<String> referenceDataSetName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStringComparisonBehavior = defaults.dataStringComparisonBehavior;
    	      this.environmentName = defaults.environmentName;
    	      this.keyProperties = defaults.keyProperties;
    	      this.location = defaults.location;
    	      this.referenceDataSetName = defaults.referenceDataSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDataStringComparisonBehavior(@Nullable Input<Either<String,DataStringComparisonBehavior>> dataStringComparisonBehavior) {
            this.dataStringComparisonBehavior = dataStringComparisonBehavior;
            return this;
        }

        public Builder setDataStringComparisonBehavior(@Nullable Either<String,DataStringComparisonBehavior> dataStringComparisonBehavior) {
            this.dataStringComparisonBehavior = Input.ofNullable(dataStringComparisonBehavior);
            return this;
        }

        public Builder setEnvironmentName(Input<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Input.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder setKeyProperties(Input<List<ReferenceDataSetKeyPropertyArgs>> keyProperties) {
            this.keyProperties = Objects.requireNonNull(keyProperties);
            return this;
        }

        public Builder setKeyProperties(List<ReferenceDataSetKeyPropertyArgs> keyProperties) {
            this.keyProperties = Input.of(Objects.requireNonNull(keyProperties));
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

        public Builder setReferenceDataSetName(@Nullable Input<String> referenceDataSetName) {
            this.referenceDataSetName = referenceDataSetName;
            return this;
        }

        public Builder setReferenceDataSetName(@Nullable String referenceDataSetName) {
            this.referenceDataSetName = Input.ofNullable(referenceDataSetName);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ReferenceDataSetArgs build() {
            return new ReferenceDataSetArgs(dataStringComparisonBehavior, environmentName, keyProperties, location, referenceDataSetName, resourceGroupName, tags);
        }
    }
}
