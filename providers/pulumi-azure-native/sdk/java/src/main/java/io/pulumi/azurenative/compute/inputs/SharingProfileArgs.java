// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.GallerySharingPermissionTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Profile for gallery sharing to subscription or tenant
 * 
 */
public final class SharingProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharingProfileArgs Empty = new SharingProfileArgs();

    /**
     * This property allows you to specify the permission of sharing gallery. <br><br> Possible values are: <br><br> **Private** <br><br> **Groups**
     * 
     */
    @InputImport(name="permissions")
        private final @Nullable Input<Either<String,GallerySharingPermissionTypes>> permissions;

    public Input<Either<String,GallerySharingPermissionTypes>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public SharingProfileArgs(@Nullable Input<Either<String,GallerySharingPermissionTypes>> permissions) {
        this.permissions = permissions;
    }

    private SharingProfileArgs() {
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,GallerySharingPermissionTypes>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
        }

        public Builder setPermissions(@Nullable Input<Either<String,GallerySharingPermissionTypes>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable Either<String,GallerySharingPermissionTypes> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }
        public SharingProfileArgs build() {
            return new SharingProfileArgs(permissions);
        }
    }
}
