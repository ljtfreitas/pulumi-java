// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Resource representing the Android specific attributes of a Device.
 * 
 */
public final class GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse Empty = new GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse();

    /**
     * Whether applications from unknown sources can be installed on device.
     * 
     */
    @InputImport(name="enabledUnknownSources", required=true)
      private final Boolean enabledUnknownSources;

    public Boolean getEnabledUnknownSources() {
        return this.enabledUnknownSources;
    }

    /**
     * Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles.
     * 
     */
    @InputImport(name="ownerProfileAccount", required=true)
      private final Boolean ownerProfileAccount;

    public Boolean getOwnerProfileAccount() {
        return this.ownerProfileAccount;
    }

    /**
     * Ownership privileges on device.
     * 
     */
    @InputImport(name="ownershipPrivilege", required=true)
      private final String ownershipPrivilege;

    public String getOwnershipPrivilege() {
        return this.ownershipPrivilege;
    }

    /**
     * Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy.
     * 
     */
    @InputImport(name="supportsWorkProfile", required=true)
      private final Boolean supportsWorkProfile;

    public Boolean getSupportsWorkProfile() {
        return this.supportsWorkProfile;
    }

    public GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse(
        Boolean enabledUnknownSources,
        Boolean ownerProfileAccount,
        String ownershipPrivilege,
        Boolean supportsWorkProfile) {
        this.enabledUnknownSources = Objects.requireNonNull(enabledUnknownSources, "expected parameter 'enabledUnknownSources' to be non-null");
        this.ownerProfileAccount = Objects.requireNonNull(ownerProfileAccount, "expected parameter 'ownerProfileAccount' to be non-null");
        this.ownershipPrivilege = Objects.requireNonNull(ownershipPrivilege, "expected parameter 'ownershipPrivilege' to be non-null");
        this.supportsWorkProfile = Objects.requireNonNull(supportsWorkProfile, "expected parameter 'supportsWorkProfile' to be non-null");
    }

    private GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse() {
        this.enabledUnknownSources = null;
        this.ownerProfileAccount = null;
        this.ownershipPrivilege = null;
        this.supportsWorkProfile = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabledUnknownSources;
        private Boolean ownerProfileAccount;
        private String ownershipPrivilege;
        private Boolean supportsWorkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledUnknownSources = defaults.enabledUnknownSources;
    	      this.ownerProfileAccount = defaults.ownerProfileAccount;
    	      this.ownershipPrivilege = defaults.ownershipPrivilege;
    	      this.supportsWorkProfile = defaults.supportsWorkProfile;
        }

        public Builder setEnabledUnknownSources(Boolean enabledUnknownSources) {
            this.enabledUnknownSources = Objects.requireNonNull(enabledUnknownSources);
            return this;
        }

        public Builder setOwnerProfileAccount(Boolean ownerProfileAccount) {
            this.ownerProfileAccount = Objects.requireNonNull(ownerProfileAccount);
            return this;
        }

        public Builder setOwnershipPrivilege(String ownershipPrivilege) {
            this.ownershipPrivilege = Objects.requireNonNull(ownershipPrivilege);
            return this;
        }

        public Builder setSupportsWorkProfile(Boolean supportsWorkProfile) {
            this.supportsWorkProfile = Objects.requireNonNull(supportsWorkProfile);
            return this;
        }
        public GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse build() {
            return new GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse(enabledUnknownSources, ownerProfileAccount, ownershipPrivilege, supportsWorkProfile);
        }
    }
}
