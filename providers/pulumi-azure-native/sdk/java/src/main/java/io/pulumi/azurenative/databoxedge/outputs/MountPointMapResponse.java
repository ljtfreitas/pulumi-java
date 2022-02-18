// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MountPointMapResponse {
    /**
     * Mount point for the share.
     * 
     */
    private final String mountPoint;
    /**
     * Mounting type.
     * 
     */
    private final String mountType;
    /**
     * ID of the role to which share is mounted.
     * 
     */
    private final String roleId;
    /**
     * Role type.
     * 
     */
    private final String roleType;
    /**
     * ID of the share mounted to the role VM.
     * 
     */
    private final String shareId;

    @OutputCustomType.Constructor({"mountPoint","mountType","roleId","roleType","shareId"})
    private MountPointMapResponse(
        String mountPoint,
        String mountType,
        String roleId,
        String roleType,
        String shareId) {
        this.mountPoint = Objects.requireNonNull(mountPoint);
        this.mountType = Objects.requireNonNull(mountType);
        this.roleId = Objects.requireNonNull(roleId);
        this.roleType = Objects.requireNonNull(roleType);
        this.shareId = Objects.requireNonNull(shareId);
    }

    /**
     * Mount point for the share.
     * 
     */
    public String getMountPoint() {
        return this.mountPoint;
    }
    /**
     * Mounting type.
     * 
     */
    public String getMountType() {
        return this.mountType;
    }
    /**
     * ID of the role to which share is mounted.
     * 
     */
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Role type.
     * 
     */
    public String getRoleType() {
        return this.roleType;
    }
    /**
     * ID of the share mounted to the role VM.
     * 
     */
    public String getShareId() {
        return this.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountPointMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPoint;
        private String mountType;
        private String roleId;
        private String roleType;
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountPointMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPoint = defaults.mountPoint;
    	      this.mountType = defaults.mountType;
    	      this.roleId = defaults.roleId;
    	      this.roleType = defaults.roleType;
    	      this.shareId = defaults.shareId;
        }

        public Builder setMountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder setMountType(String mountType) {
            this.mountType = Objects.requireNonNull(mountType);
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }

        public Builder setRoleType(String roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }

        public Builder setShareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }

        public MountPointMapResponse build() {
            return new MountPointMapResponse(mountPoint, mountType, roleId, roleType, shareId);
        }
    }
}
