// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.AddonType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddonArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddonArgs Empty = new AddonArgs();

    /**
     * The addon name.
     * 
     */
    @InputImport(name="addonName")
    private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Addon type.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<Either<String,AddonType>> kind;

    public Input<Either<String,AddonType>> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="roleName", required=true)
    private final Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName;
    }

    public AddonArgs(
        @Nullable Input<String> addonName,
        Input<String> deviceName,
        Input<Either<String,AddonType>> kind,
        Input<String> resourceGroupName,
        Input<String> roleName) {
        this.addonName = addonName;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private AddonArgs() {
        this.addonName = Input.empty();
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private Input<String> deviceName;
        private Input<Either<String,AddonType>> kind;
        private Input<String> resourceGroupName;
        private Input<String> roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setAddonName(@Nullable Input<String> addonName) {
            this.addonName = addonName;
            return this;
        }

        public Builder setAddonName(@Nullable String addonName) {
            this.addonName = Input.ofNullable(addonName);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setKind(Input<Either<String,AddonType>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,AddonType> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setRoleName(Input<String> roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Input.of(Objects.requireNonNull(roleName));
            return this;
        }

        public AddonArgs build() {
            return new AddonArgs(addonName, deviceName, kind, resourceGroupName, roleName);
        }
    }
}
