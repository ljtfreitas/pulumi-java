// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.OsConstraintResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DevicePolicyResponse {
    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    private final List<String> allowedDeviceManagementLevels;
    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    private final List<String> allowedEncryptionStatuses;
    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    private final List<OsConstraintResponse> osConstraints;
    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    private final Boolean requireAdminApproval;
    /**
     * Whether the device needs to be corp owned.
     * 
     */
    private final Boolean requireCorpOwned;
    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    private final Boolean requireScreenlock;

    @CustomType.Constructor
    private DevicePolicyResponse(
        @CustomType.Parameter("allowedDeviceManagementLevels") List<String> allowedDeviceManagementLevels,
        @CustomType.Parameter("allowedEncryptionStatuses") List<String> allowedEncryptionStatuses,
        @CustomType.Parameter("osConstraints") List<OsConstraintResponse> osConstraints,
        @CustomType.Parameter("requireAdminApproval") Boolean requireAdminApproval,
        @CustomType.Parameter("requireCorpOwned") Boolean requireCorpOwned,
        @CustomType.Parameter("requireScreenlock") Boolean requireScreenlock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenlock = requireScreenlock;
    }

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
    */
    public List<String> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels;
    }
    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
    */
    public List<String> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses;
    }
    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
    */
    public List<OsConstraintResponse> getOsConstraints() {
        return this.osConstraints;
    }
    /**
     * Whether the device needs to be approved by the customer admin.
     * 
    */
    public Boolean getRequireAdminApproval() {
        return this.requireAdminApproval;
    }
    /**
     * Whether the device needs to be corp owned.
     * 
    */
    public Boolean getRequireCorpOwned() {
        return this.requireCorpOwned;
    }
    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
    */
    public Boolean getRequireScreenlock() {
        return this.requireScreenlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedDeviceManagementLevels;
        private List<String> allowedEncryptionStatuses;
        private List<OsConstraintResponse> osConstraints;
        private Boolean requireAdminApproval;
        private Boolean requireCorpOwned;
        private Boolean requireScreenlock;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenlock = defaults.requireScreenlock;
        }

        public Builder allowedDeviceManagementLevels(List<String> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Objects.requireNonNull(allowedDeviceManagementLevels);
            return this;
        }

        public Builder allowedEncryptionStatuses(List<String> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Objects.requireNonNull(allowedEncryptionStatuses);
            return this;
        }

        public Builder osConstraints(List<OsConstraintResponse> osConstraints) {
            this.osConstraints = Objects.requireNonNull(osConstraints);
            return this;
        }

        public Builder requireAdminApproval(Boolean requireAdminApproval) {
            this.requireAdminApproval = Objects.requireNonNull(requireAdminApproval);
            return this;
        }

        public Builder requireCorpOwned(Boolean requireCorpOwned) {
            this.requireCorpOwned = Objects.requireNonNull(requireCorpOwned);
            return this;
        }

        public Builder requireScreenlock(Boolean requireScreenlock) {
            this.requireScreenlock = Objects.requireNonNull(requireScreenlock);
            return this;
        }
        public DevicePolicyResponse build() {
            return new DevicePolicyResponse(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenlock);
        }
    }
}
