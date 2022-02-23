// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CSIPersistentVolumeSource {
    /**
     * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    private final @Nullable SecretReference controllerExpandSecretRef;
    /**
     * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    private final @Nullable SecretReference controllerPublishSecretRef;
    /**
     * Driver is the name of the driver to use for this volume. Required.
     * 
     */
    private final String driver;
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     * 
     */
    private final @Nullable String fsType;
    /**
     * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    private final @Nullable SecretReference nodePublishSecretRef;
    /**
     * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    private final @Nullable SecretReference nodeStageSecretRef;
    /**
     * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Attributes of the volume to publish.
     * 
     */
    private final @Nullable Map<String,String> volumeAttributes;
    /**
     * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * 
     */
    private final String volumeHandle;

    @OutputCustomType.Constructor({"controllerExpandSecretRef","controllerPublishSecretRef","driver","fsType","nodePublishSecretRef","nodeStageSecretRef","readOnly","volumeAttributes","volumeHandle"})
    private CSIPersistentVolumeSource(
        @Nullable SecretReference controllerExpandSecretRef,
        @Nullable SecretReference controllerPublishSecretRef,
        String driver,
        @Nullable String fsType,
        @Nullable SecretReference nodePublishSecretRef,
        @Nullable SecretReference nodeStageSecretRef,
        @Nullable Boolean readOnly,
        @Nullable Map<String,String> volumeAttributes,
        String volumeHandle) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        this.driver = Objects.requireNonNull(driver);
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.nodeStageSecretRef = nodeStageSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
        this.volumeHandle = Objects.requireNonNull(volumeHandle);
    }

    /**
     * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<SecretReference> getControllerExpandSecretRef() {
        return Optional.ofNullable(this.controllerExpandSecretRef);
    }
    /**
     * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<SecretReference> getControllerPublishSecretRef() {
        return Optional.ofNullable(this.controllerPublishSecretRef);
    }
    /**
     * Driver is the name of the driver to use for this volume. Required.
     * 
     */
    public String getDriver() {
        return this.driver;
    }
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     * 
     */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<SecretReference> getNodePublishSecretRef() {
        return Optional.ofNullable(this.nodePublishSecretRef);
    }
    /**
     * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    public Optional<SecretReference> getNodeStageSecretRef() {
        return Optional.ofNullable(this.nodeStageSecretRef);
    }
    /**
     * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Attributes of the volume to publish.
     * 
     */
    public Map<String,String> getVolumeAttributes() {
        return this.volumeAttributes == null ? Map.of() : this.volumeAttributes;
    }
    /**
     * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * 
     */
    public String getVolumeHandle() {
        return this.volumeHandle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretReference controllerExpandSecretRef;
        private @Nullable SecretReference controllerPublishSecretRef;
        private String driver;
        private @Nullable String fsType;
        private @Nullable SecretReference nodePublishSecretRef;
        private @Nullable SecretReference nodeStageSecretRef;
        private @Nullable Boolean readOnly;
        private @Nullable Map<String,String> volumeAttributes;
        private String volumeHandle;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerExpandSecretRef = defaults.controllerExpandSecretRef;
    	      this.controllerPublishSecretRef = defaults.controllerPublishSecretRef;
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.nodeStageSecretRef = defaults.nodeStageSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
    	      this.volumeHandle = defaults.volumeHandle;
        }

        public Builder setControllerExpandSecretRef(@Nullable SecretReference controllerExpandSecretRef) {
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }

        public Builder setControllerPublishSecretRef(@Nullable SecretReference controllerPublishSecretRef) {
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }

        public Builder setDriver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setNodePublishSecretRef(@Nullable SecretReference nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }

        public Builder setNodeStageSecretRef(@Nullable SecretReference nodeStageSecretRef) {
            this.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setVolumeAttributes(@Nullable Map<String,String> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }

        public Builder setVolumeHandle(String volumeHandle) {
            this.volumeHandle = Objects.requireNonNull(volumeHandle);
            return this;
        }
        public CSIPersistentVolumeSource build() {
            return new CSIPersistentVolumeSource(controllerExpandSecretRef, controllerPublishSecretRef, driver, fsType, nodePublishSecretRef, nodeStageSecretRef, readOnly, volumeAttributes, volumeHandle);
        }
    }
}
