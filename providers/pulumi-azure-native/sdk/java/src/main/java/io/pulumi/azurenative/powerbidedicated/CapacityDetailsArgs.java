// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated;

import io.pulumi.azurenative.powerbidedicated.enums.Mode;
import io.pulumi.azurenative.powerbidedicated.inputs.CapacitySkuArgs;
import io.pulumi.azurenative.powerbidedicated.inputs.DedicatedCapacityAdministratorsArgs;
import io.pulumi.azurenative.powerbidedicated.inputs.SystemDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityDetailsArgs Empty = new CapacityDetailsArgs();

    @InputImport(name="administration")
    private final @Nullable Input<DedicatedCapacityAdministratorsArgs> administration;

    public Input<DedicatedCapacityAdministratorsArgs> getAdministration() {
        return this.administration == null ? Input.empty() : this.administration;
    }

    @InputImport(name="dedicatedCapacityName")
    private final @Nullable Input<String> dedicatedCapacityName;

    public Input<String> getDedicatedCapacityName() {
        return this.dedicatedCapacityName == null ? Input.empty() : this.dedicatedCapacityName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="mode")
    private final @Nullable Input<Either<String,Mode>> mode;

    public Input<Either<String,Mode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku", required=true)
    private final Input<CapacitySkuArgs> sku;

    public Input<CapacitySkuArgs> getSku() {
        return this.sku;
    }

    @InputImport(name="systemData")
    private final @Nullable Input<SystemDataArgs> systemData;

    public Input<SystemDataArgs> getSystemData() {
        return this.systemData == null ? Input.empty() : this.systemData;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CapacityDetailsArgs(
        @Nullable Input<DedicatedCapacityAdministratorsArgs> administration,
        @Nullable Input<String> dedicatedCapacityName,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,Mode>> mode,
        Input<String> resourceGroupName,
        Input<CapacitySkuArgs> sku,
        @Nullable Input<SystemDataArgs> systemData,
        @Nullable Input<Map<String,String>> tags) {
        this.administration = administration;
        this.dedicatedCapacityName = dedicatedCapacityName;
        this.location = location;
        this.mode = mode;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.systemData = systemData;
        this.tags = tags;
    }

    private CapacityDetailsArgs() {
        this.administration = Input.empty();
        this.dedicatedCapacityName = Input.empty();
        this.location = Input.empty();
        this.mode = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.systemData = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DedicatedCapacityAdministratorsArgs> administration;
        private @Nullable Input<String> dedicatedCapacityName;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,Mode>> mode;
        private Input<String> resourceGroupName;
        private Input<CapacitySkuArgs> sku;
        private @Nullable Input<SystemDataArgs> systemData;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administration = defaults.administration;
    	      this.dedicatedCapacityName = defaults.dedicatedCapacityName;
    	      this.location = defaults.location;
    	      this.mode = defaults.mode;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
        }

        public Builder setAdministration(@Nullable Input<DedicatedCapacityAdministratorsArgs> administration) {
            this.administration = administration;
            return this;
        }

        public Builder setAdministration(@Nullable DedicatedCapacityAdministratorsArgs administration) {
            this.administration = Input.ofNullable(administration);
            return this;
        }

        public Builder setDedicatedCapacityName(@Nullable Input<String> dedicatedCapacityName) {
            this.dedicatedCapacityName = dedicatedCapacityName;
            return this;
        }

        public Builder setDedicatedCapacityName(@Nullable String dedicatedCapacityName) {
            this.dedicatedCapacityName = Input.ofNullable(dedicatedCapacityName);
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

        public Builder setMode(@Nullable Input<Either<String,Mode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,Mode> mode) {
            this.mode = Input.ofNullable(mode);
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

        public Builder setSku(Input<CapacitySkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(CapacitySkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setSystemData(@Nullable Input<SystemDataArgs> systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setSystemData(@Nullable SystemDataArgs systemData) {
            this.systemData = Input.ofNullable(systemData);
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

        public CapacityDetailsArgs build() {
            return new CapacityDetailsArgs(administration, dedicatedCapacityName, location, mode, resourceGroupName, sku, systemData, tags);
        }
    }
}