// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DdosProtectionPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final DdosProtectionPlanArgs Empty = new DdosProtectionPlanArgs();

    /**
     * The name of the DDoS protection plan.
     * 
     */
    @Import(name="ddosProtectionPlanName")
      private final @Nullable Output<String> ddosProtectionPlanName;

    public Output<String> getDdosProtectionPlanName() {
        return this.ddosProtectionPlanName == null ? Output.empty() : this.ddosProtectionPlanName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
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

    public DdosProtectionPlanArgs(
        @Nullable Output<String> ddosProtectionPlanName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.ddosProtectionPlanName = ddosProtectionPlanName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DdosProtectionPlanArgs() {
        this.ddosProtectionPlanName = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DdosProtectionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ddosProtectionPlanName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DdosProtectionPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosProtectionPlanName = defaults.ddosProtectionPlanName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder ddosProtectionPlanName(@Nullable Output<String> ddosProtectionPlanName) {
            this.ddosProtectionPlanName = ddosProtectionPlanName;
            return this;
        }

        public Builder ddosProtectionPlanName(@Nullable String ddosProtectionPlanName) {
            this.ddosProtectionPlanName = Output.ofNullable(ddosProtectionPlanName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public DdosProtectionPlanArgs build() {
            return new DdosProtectionPlanArgs(ddosProtectionPlanName, location, resourceGroupName, tags);
        }
    }
}
