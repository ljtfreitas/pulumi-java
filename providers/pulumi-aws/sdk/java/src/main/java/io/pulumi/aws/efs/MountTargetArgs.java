// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MountTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MountTargetArgs Empty = new MountTargetArgs();

    /**
     * The ID of the file system for which the mount target is intended.
     * 
     */
    @Import(name="fileSystemId", required=true)
      private final Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The address (within the address range of the specified subnet) at
     * which the file system may be mounted via the mount target.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * A list of up to 5 VPC security group IDs (that must
     * be for the same VPC as subnet specified) in effect for the mount target.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * The ID of the subnet to add the mount target in.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public MountTargetArgs(
        Output<String> fileSystemId,
        @Nullable Output<String> ipAddress,
        @Nullable Output<List<String>> securityGroups,
        Output<String> subnetId) {
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.ipAddress = ipAddress;
        this.securityGroups = securityGroups;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private MountTargetArgs() {
        this.fileSystemId = Output.empty();
        this.ipAddress = Output.empty();
        this.securityGroups = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fileSystemId;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<List<String>> securityGroups;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder fileSystemId(Output<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Output.of(Objects.requireNonNull(fileSystemId));
            return this;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
            return this;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public MountTargetArgs build() {
            return new MountTargetArgs(fileSystemId, ipAddress, securityGroups, subnetId);
        }
    }
}
