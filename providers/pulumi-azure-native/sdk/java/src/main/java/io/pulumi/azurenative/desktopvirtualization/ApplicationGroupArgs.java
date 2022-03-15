// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.enums.ApplicationGroupType;
import io.pulumi.azurenative.desktopvirtualization.inputs.MigrationRequestPropertiesArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetIdentityArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetPlanArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetSkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGroupArgs Empty = new ApplicationGroupArgs();

    /**
     * The name of the application group
     * 
     */
    @Import(name="applicationGroupName")
      private final @Nullable Output<String> applicationGroupName;

    public Output<String> getApplicationGroupName() {
        return this.applicationGroupName == null ? Output.empty() : this.applicationGroupName;
    }

    /**
     * Resource Type of ApplicationGroup.
     * 
     */
    @Import(name="applicationGroupType", required=true)
      private final Output<Either<String,ApplicationGroupType>> applicationGroupType;

    public Output<Either<String,ApplicationGroupType>> getApplicationGroupType() {
        return this.applicationGroupType;
    }

    /**
     * Description of ApplicationGroup.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Friendly name of ApplicationGroup.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * HostPool arm path of ApplicationGroup.
     * 
     */
    @Import(name="hostPoolArmPath", required=true)
      private final Output<String> hostPoolArmPath;

    public Output<String> getHostPoolArmPath() {
        return this.hostPoolArmPath;
    }

    @Import(name="identity")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity;

    public Output<ResourceModelWithAllowedPropertySetIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

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
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @Import(name="managedBy")
      private final @Nullable Output<String> managedBy;

    public Output<String> getManagedBy() {
        return this.managedBy == null ? Output.empty() : this.managedBy;
    }

    /**
     * The registration info of HostPool.
     * 
     */
    @Import(name="migrationRequest")
      private final @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest;

    public Output<MigrationRequestPropertiesArgs> getMigrationRequest() {
        return this.migrationRequest == null ? Output.empty() : this.migrationRequest;
    }

    @Import(name="plan")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan;

    public Output<ResourceModelWithAllowedPropertySetPlanArgs> getPlan() {
        return this.plan == null ? Output.empty() : this.plan;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="sku")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku;

    public Output<ResourceModelWithAllowedPropertySetSkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
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

    public ApplicationGroupArgs(
        @Nullable Output<String> applicationGroupName,
        Output<Either<String,ApplicationGroupType>> applicationGroupType,
        @Nullable Output<String> description,
        @Nullable Output<String> friendlyName,
        Output<String> hostPoolArmPath,
        @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> managedBy,
        @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest,
        @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan,
        Output<String> resourceGroupName,
        @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationGroupName = applicationGroupName;
        this.applicationGroupType = Objects.requireNonNull(applicationGroupType, "expected parameter 'applicationGroupType' to be non-null");
        this.description = description;
        this.friendlyName = friendlyName;
        this.hostPoolArmPath = Objects.requireNonNull(hostPoolArmPath, "expected parameter 'hostPoolArmPath' to be non-null");
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.migrationRequest = migrationRequest;
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ApplicationGroupArgs() {
        this.applicationGroupName = Output.empty();
        this.applicationGroupType = Output.empty();
        this.description = Output.empty();
        this.friendlyName = Output.empty();
        this.hostPoolArmPath = Output.empty();
        this.identity = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.managedBy = Output.empty();
        this.migrationRequest = Output.empty();
        this.plan = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationGroupName;
        private Output<Either<String,ApplicationGroupType>> applicationGroupType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> friendlyName;
        private Output<String> hostPoolArmPath;
        private @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedBy;
        private @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest;
        private @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan;
        private Output<String> resourceGroupName;
        private @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupName = defaults.applicationGroupName;
    	      this.applicationGroupType = defaults.applicationGroupType;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostPoolArmPath = defaults.hostPoolArmPath;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.migrationRequest = defaults.migrationRequest;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder applicationGroupName(@Nullable Output<String> applicationGroupName) {
            this.applicationGroupName = applicationGroupName;
            return this;
        }

        public Builder applicationGroupName(@Nullable String applicationGroupName) {
            this.applicationGroupName = Output.ofNullable(applicationGroupName);
            return this;
        }

        public Builder applicationGroupType(Output<Either<String,ApplicationGroupType>> applicationGroupType) {
            this.applicationGroupType = Objects.requireNonNull(applicationGroupType);
            return this;
        }

        public Builder applicationGroupType(Either<String,ApplicationGroupType> applicationGroupType) {
            this.applicationGroupType = Output.of(Objects.requireNonNull(applicationGroupType));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }

        public Builder hostPoolArmPath(Output<String> hostPoolArmPath) {
            this.hostPoolArmPath = Objects.requireNonNull(hostPoolArmPath);
            return this;
        }

        public Builder hostPoolArmPath(String hostPoolArmPath) {
            this.hostPoolArmPath = Output.of(Objects.requireNonNull(hostPoolArmPath));
            return this;
        }

        public Builder identity(@Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ResourceModelWithAllowedPropertySetIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
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

        public Builder managedBy(@Nullable Output<String> managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = Output.ofNullable(managedBy);
            return this;
        }

        public Builder migrationRequest(@Nullable Output<MigrationRequestPropertiesArgs> migrationRequest) {
            this.migrationRequest = migrationRequest;
            return this;
        }

        public Builder migrationRequest(@Nullable MigrationRequestPropertiesArgs migrationRequest) {
            this.migrationRequest = Output.ofNullable(migrationRequest);
            return this;
        }

        public Builder plan(@Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder plan(@Nullable ResourceModelWithAllowedPropertySetPlanArgs plan) {
            this.plan = Output.ofNullable(plan);
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

        public Builder sku(@Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable ResourceModelWithAllowedPropertySetSkuArgs sku) {
            this.sku = Output.ofNullable(sku);
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
        public ApplicationGroupArgs build() {
            return new ApplicationGroupArgs(applicationGroupName, applicationGroupType, description, friendlyName, hostPoolArmPath, identity, kind, location, managedBy, migrationRequest, plan, resourceGroupName, sku, tags);
        }
    }
}
