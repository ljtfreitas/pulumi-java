// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AccessPointRootDirectoryCreationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointRootDirectoryCreationInfoArgs Empty = new AccessPointRootDirectoryCreationInfoArgs();

    /**
     * POSIX group ID to apply to the `root_directory`.
     * 
     */
    @InputImport(name="ownerGid", required=true)
    private final Input<Integer> ownerGid;

    public Input<Integer> getOwnerGid() {
        return this.ownerGid;
    }

    /**
     * POSIX user ID to apply to the `root_directory`.
     * 
     */
    @InputImport(name="ownerUid", required=true)
    private final Input<Integer> ownerUid;

    public Input<Integer> getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     * 
     */
    @InputImport(name="permissions", required=true)
    private final Input<String> permissions;

    public Input<String> getPermissions() {
        return this.permissions;
    }

    public AccessPointRootDirectoryCreationInfoArgs(
        Input<Integer> ownerGid,
        Input<Integer> ownerUid,
        Input<String> permissions) {
        this.ownerGid = Objects.requireNonNull(ownerGid, "expected parameter 'ownerGid' to be non-null");
        this.ownerUid = Objects.requireNonNull(ownerUid, "expected parameter 'ownerUid' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private AccessPointRootDirectoryCreationInfoArgs() {
        this.ownerGid = Input.empty();
        this.ownerUid = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointRootDirectoryCreationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> ownerGid;
        private Input<Integer> ownerUid;
        private Input<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointRootDirectoryCreationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder setOwnerGid(Input<Integer> ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }

        public Builder setOwnerGid(Integer ownerGid) {
            this.ownerGid = Input.of(Objects.requireNonNull(ownerGid));
            return this;
        }

        public Builder setOwnerUid(Input<Integer> ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }

        public Builder setOwnerUid(Integer ownerUid) {
            this.ownerUid = Input.of(Objects.requireNonNull(ownerUid));
            return this;
        }

        public Builder setPermissions(Input<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Input.of(Objects.requireNonNull(permissions));
            return this;
        }
        public AccessPointRootDirectoryCreationInfoArgs build() {
            return new AccessPointRootDirectoryCreationInfoArgs(ownerGid, ownerUid, permissions);
        }
    }
}
