// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.AccountCredentialDetailsResponse;
import io.pulumi.azurenative.databox.outputs.ApplianceNetworkConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataBoxSecretResponse {
    /**
     * Per account level access credentials.
     * 
     */
    private final List<AccountCredentialDetailsResponse> accountCredentialDetails;
    /**
     * Password for out of the box experience on device.
     * 
     */
    private final String devicePassword;
    /**
     * Serial number of the assigned device.
     * 
     */
    private final String deviceSerialNumber;
    /**
     * The base 64 encoded public key to authenticate with the device
     * 
     */
    private final String encodedValidationCertPubKey;
    /**
     * Network configuration of the appliance.
     * 
     */
    private final List<ApplianceNetworkConfigurationResponse> networkConfigurations;

    @OutputCustomType.Constructor({"accountCredentialDetails","devicePassword","deviceSerialNumber","encodedValidationCertPubKey","networkConfigurations"})
    private DataBoxSecretResponse(
        List<AccountCredentialDetailsResponse> accountCredentialDetails,
        String devicePassword,
        String deviceSerialNumber,
        String encodedValidationCertPubKey,
        List<ApplianceNetworkConfigurationResponse> networkConfigurations) {
        this.accountCredentialDetails = Objects.requireNonNull(accountCredentialDetails);
        this.devicePassword = Objects.requireNonNull(devicePassword);
        this.deviceSerialNumber = Objects.requireNonNull(deviceSerialNumber);
        this.encodedValidationCertPubKey = Objects.requireNonNull(encodedValidationCertPubKey);
        this.networkConfigurations = Objects.requireNonNull(networkConfigurations);
    }

    /**
     * Per account level access credentials.
     * 
     */
    public List<AccountCredentialDetailsResponse> getAccountCredentialDetails() {
        return this.accountCredentialDetails;
    }
    /**
     * Password for out of the box experience on device.
     * 
     */
    public String getDevicePassword() {
        return this.devicePassword;
    }
    /**
     * Serial number of the assigned device.
     * 
     */
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }
    /**
     * The base 64 encoded public key to authenticate with the device
     * 
     */
    public String getEncodedValidationCertPubKey() {
        return this.encodedValidationCertPubKey;
    }
    /**
     * Network configuration of the appliance.
     * 
     */
    public List<ApplianceNetworkConfigurationResponse> getNetworkConfigurations() {
        return this.networkConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccountCredentialDetailsResponse> accountCredentialDetails;
        private String devicePassword;
        private String deviceSerialNumber;
        private String encodedValidationCertPubKey;
        private List<ApplianceNetworkConfigurationResponse> networkConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountCredentialDetails = defaults.accountCredentialDetails;
    	      this.devicePassword = defaults.devicePassword;
    	      this.deviceSerialNumber = defaults.deviceSerialNumber;
    	      this.encodedValidationCertPubKey = defaults.encodedValidationCertPubKey;
    	      this.networkConfigurations = defaults.networkConfigurations;
        }

        public Builder setAccountCredentialDetails(List<AccountCredentialDetailsResponse> accountCredentialDetails) {
            this.accountCredentialDetails = Objects.requireNonNull(accountCredentialDetails);
            return this;
        }

        public Builder setDevicePassword(String devicePassword) {
            this.devicePassword = Objects.requireNonNull(devicePassword);
            return this;
        }

        public Builder setDeviceSerialNumber(String deviceSerialNumber) {
            this.deviceSerialNumber = Objects.requireNonNull(deviceSerialNumber);
            return this;
        }

        public Builder setEncodedValidationCertPubKey(String encodedValidationCertPubKey) {
            this.encodedValidationCertPubKey = Objects.requireNonNull(encodedValidationCertPubKey);
            return this;
        }

        public Builder setNetworkConfigurations(List<ApplianceNetworkConfigurationResponse> networkConfigurations) {
            this.networkConfigurations = Objects.requireNonNull(networkConfigurations);
            return this;
        }

        public DataBoxSecretResponse build() {
            return new DataBoxSecretResponse(accountCredentialDetails, devicePassword, deviceSerialNumber, encodedValidationCertPubKey, networkConfigurations);
        }
    }
}
