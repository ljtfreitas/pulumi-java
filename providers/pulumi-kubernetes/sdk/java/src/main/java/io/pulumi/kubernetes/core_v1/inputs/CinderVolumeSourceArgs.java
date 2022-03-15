// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 * 
 */
public final class CinderVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CinderVolumeSourceArgs Empty = new CinderVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> getFsType() {
        return this.fsType == null ? Output.empty() : this.fsType;
    }

    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Output.empty() : this.readOnly;
    }

    /**
     * Optional: points to a secret object containing parameters used to connect to OpenStack.
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<LocalObjectReferenceArgs> secretRef;

    public Output<LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Output.empty() : this.secretRef;
    }

    /**
     * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @Import(name="volumeID", required=true)
      private final Output<String> volumeID;

    public Output<String> getVolumeID() {
        return this.volumeID;
    }

    public CinderVolumeSourceArgs(
        @Nullable Output<String> fsType,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<LocalObjectReferenceArgs> secretRef,
        Output<String> volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = Objects.requireNonNull(volumeID, "expected parameter 'volumeID' to be non-null");
    }

    private CinderVolumeSourceArgs() {
        this.fsType = Output.empty();
        this.readOnly = Output.empty();
        this.secretRef = Output.empty();
        this.volumeID = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CinderVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<LocalObjectReferenceArgs> secretRef;
        private Output<String> volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(CinderVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeID = defaults.volumeID;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = Output.ofNullable(fsType);
            return this;
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Output.ofNullable(readOnly);
            return this;
        }

        public Builder secretRef(@Nullable Output<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(@Nullable LocalObjectReferenceArgs secretRef) {
            this.secretRef = Output.ofNullable(secretRef);
            return this;
        }

        public Builder volumeID(Output<String> volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }

        public Builder volumeID(String volumeID) {
            this.volumeID = Output.of(Objects.requireNonNull(volumeID));
            return this;
        }
        public CinderVolumeSourceArgs build() {
            return new CinderVolumeSourceArgs(fsType, readOnly, secretRef, volumeID);
        }
    }
}
