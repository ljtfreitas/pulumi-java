// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.TargetEligibilityResultResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverTargetResponse {
    /**
     * The amount of free local storage available on the device in bytes.
     * 
     */
    private final @Nullable Double availableLocalStorageInBytes;
    /**
     * The amount of free tiered storage available for the device in bytes.
     * 
     */
    private final @Nullable Double availableTieredStorageInBytes;
    /**
     * The count of data containers on the device.
     * 
     */
    private final @Nullable Integer dataContainersCount;
    /**
     * The path ID of the device.
     * 
     */
    private final @Nullable String deviceId;
    /**
     * The geo location (applicable only for cloud appliances) of the device.
     * 
     */
    private final @Nullable String deviceLocation;
    /**
     * The software version of the device.
     * 
     */
    private final @Nullable String deviceSoftwareVersion;
    /**
     * The status of the device.
     * 
     */
    private final @Nullable String deviceStatus;
    /**
     * The eligibility result of the device, as a failover target device.
     * 
     */
    private final @Nullable TargetEligibilityResultResponse eligibilityResult;
    /**
     * The friendly name for the current version of software on the device.
     * 
     */
    private final @Nullable String friendlyDeviceSoftwareVersion;
    /**
     * The model number of the device.
     * 
     */
    private final @Nullable String modelDescription;
    /**
     * The count of volumes on the device.
     * 
     */
    private final @Nullable Integer volumesCount;

    @CustomType.Constructor
    private FailoverTargetResponse(
        @CustomType.Parameter("availableLocalStorageInBytes") @Nullable Double availableLocalStorageInBytes,
        @CustomType.Parameter("availableTieredStorageInBytes") @Nullable Double availableTieredStorageInBytes,
        @CustomType.Parameter("dataContainersCount") @Nullable Integer dataContainersCount,
        @CustomType.Parameter("deviceId") @Nullable String deviceId,
        @CustomType.Parameter("deviceLocation") @Nullable String deviceLocation,
        @CustomType.Parameter("deviceSoftwareVersion") @Nullable String deviceSoftwareVersion,
        @CustomType.Parameter("deviceStatus") @Nullable String deviceStatus,
        @CustomType.Parameter("eligibilityResult") @Nullable TargetEligibilityResultResponse eligibilityResult,
        @CustomType.Parameter("friendlyDeviceSoftwareVersion") @Nullable String friendlyDeviceSoftwareVersion,
        @CustomType.Parameter("modelDescription") @Nullable String modelDescription,
        @CustomType.Parameter("volumesCount") @Nullable Integer volumesCount) {
        this.availableLocalStorageInBytes = availableLocalStorageInBytes;
        this.availableTieredStorageInBytes = availableTieredStorageInBytes;
        this.dataContainersCount = dataContainersCount;
        this.deviceId = deviceId;
        this.deviceLocation = deviceLocation;
        this.deviceSoftwareVersion = deviceSoftwareVersion;
        this.deviceStatus = deviceStatus;
        this.eligibilityResult = eligibilityResult;
        this.friendlyDeviceSoftwareVersion = friendlyDeviceSoftwareVersion;
        this.modelDescription = modelDescription;
        this.volumesCount = volumesCount;
    }

    /**
     * The amount of free local storage available on the device in bytes.
     * 
    */
    public Optional<Double> getAvailableLocalStorageInBytes() {
        return Optional.ofNullable(this.availableLocalStorageInBytes);
    }
    /**
     * The amount of free tiered storage available for the device in bytes.
     * 
    */
    public Optional<Double> getAvailableTieredStorageInBytes() {
        return Optional.ofNullable(this.availableTieredStorageInBytes);
    }
    /**
     * The count of data containers on the device.
     * 
    */
    public Optional<Integer> getDataContainersCount() {
        return Optional.ofNullable(this.dataContainersCount);
    }
    /**
     * The path ID of the device.
     * 
    */
    public Optional<String> getDeviceId() {
        return Optional.ofNullable(this.deviceId);
    }
    /**
     * The geo location (applicable only for cloud appliances) of the device.
     * 
    */
    public Optional<String> getDeviceLocation() {
        return Optional.ofNullable(this.deviceLocation);
    }
    /**
     * The software version of the device.
     * 
    */
    public Optional<String> getDeviceSoftwareVersion() {
        return Optional.ofNullable(this.deviceSoftwareVersion);
    }
    /**
     * The status of the device.
     * 
    */
    public Optional<String> getDeviceStatus() {
        return Optional.ofNullable(this.deviceStatus);
    }
    /**
     * The eligibility result of the device, as a failover target device.
     * 
    */
    public Optional<TargetEligibilityResultResponse> getEligibilityResult() {
        return Optional.ofNullable(this.eligibilityResult);
    }
    /**
     * The friendly name for the current version of software on the device.
     * 
    */
    public Optional<String> getFriendlyDeviceSoftwareVersion() {
        return Optional.ofNullable(this.friendlyDeviceSoftwareVersion);
    }
    /**
     * The model number of the device.
     * 
    */
    public Optional<String> getModelDescription() {
        return Optional.ofNullable(this.modelDescription);
    }
    /**
     * The count of volumes on the device.
     * 
    */
    public Optional<Integer> getVolumesCount() {
        return Optional.ofNullable(this.volumesCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double availableLocalStorageInBytes;
        private @Nullable Double availableTieredStorageInBytes;
        private @Nullable Integer dataContainersCount;
        private @Nullable String deviceId;
        private @Nullable String deviceLocation;
        private @Nullable String deviceSoftwareVersion;
        private @Nullable String deviceStatus;
        private @Nullable TargetEligibilityResultResponse eligibilityResult;
        private @Nullable String friendlyDeviceSoftwareVersion;
        private @Nullable String modelDescription;
        private @Nullable Integer volumesCount;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableLocalStorageInBytes = defaults.availableLocalStorageInBytes;
    	      this.availableTieredStorageInBytes = defaults.availableTieredStorageInBytes;
    	      this.dataContainersCount = defaults.dataContainersCount;
    	      this.deviceId = defaults.deviceId;
    	      this.deviceLocation = defaults.deviceLocation;
    	      this.deviceSoftwareVersion = defaults.deviceSoftwareVersion;
    	      this.deviceStatus = defaults.deviceStatus;
    	      this.eligibilityResult = defaults.eligibilityResult;
    	      this.friendlyDeviceSoftwareVersion = defaults.friendlyDeviceSoftwareVersion;
    	      this.modelDescription = defaults.modelDescription;
    	      this.volumesCount = defaults.volumesCount;
        }

        public Builder availableLocalStorageInBytes(@Nullable Double availableLocalStorageInBytes) {
            this.availableLocalStorageInBytes = availableLocalStorageInBytes;
            return this;
        }

        public Builder availableTieredStorageInBytes(@Nullable Double availableTieredStorageInBytes) {
            this.availableTieredStorageInBytes = availableTieredStorageInBytes;
            return this;
        }

        public Builder dataContainersCount(@Nullable Integer dataContainersCount) {
            this.dataContainersCount = dataContainersCount;
            return this;
        }

        public Builder deviceId(@Nullable String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder deviceLocation(@Nullable String deviceLocation) {
            this.deviceLocation = deviceLocation;
            return this;
        }

        public Builder deviceSoftwareVersion(@Nullable String deviceSoftwareVersion) {
            this.deviceSoftwareVersion = deviceSoftwareVersion;
            return this;
        }

        public Builder deviceStatus(@Nullable String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }

        public Builder eligibilityResult(@Nullable TargetEligibilityResultResponse eligibilityResult) {
            this.eligibilityResult = eligibilityResult;
            return this;
        }

        public Builder friendlyDeviceSoftwareVersion(@Nullable String friendlyDeviceSoftwareVersion) {
            this.friendlyDeviceSoftwareVersion = friendlyDeviceSoftwareVersion;
            return this;
        }

        public Builder modelDescription(@Nullable String modelDescription) {
            this.modelDescription = modelDescription;
            return this;
        }

        public Builder volumesCount(@Nullable Integer volumesCount) {
            this.volumesCount = volumesCount;
            return this;
        }
        public FailoverTargetResponse build() {
            return new FailoverTargetResponse(availableLocalStorageInBytes, availableTieredStorageInBytes, dataContainersCount, deviceId, deviceLocation, deviceSoftwareVersion, deviceStatus, eligibilityResult, friendlyDeviceSoftwareVersion, modelDescription, volumesCount);
        }
    }
}
