// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyFairPlayConfigurationResponse {
    /**
     * All license to be persistent or not
     * 
     */
    private final Boolean allowPersistentLicense;
    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    private final @Nullable String customLicenseAcquisitionUrlTemplate;

    @CustomType.Constructor
    private StreamingPolicyFairPlayConfigurationResponse(
        @CustomType.Parameter("allowPersistentLicense") Boolean allowPersistentLicense,
        @CustomType.Parameter("customLicenseAcquisitionUrlTemplate") @Nullable String customLicenseAcquisitionUrlTemplate) {
        this.allowPersistentLicense = allowPersistentLicense;
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
    }

    /**
     * All license to be persistent or not
     * 
    */
    public Boolean getAllowPersistentLicense() {
        return this.allowPersistentLicense;
    }
    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
    */
    public Optional<String> getCustomLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyFairPlayConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPersistentLicense;
        private @Nullable String customLicenseAcquisitionUrlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyFairPlayConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPersistentLicense = defaults.allowPersistentLicense;
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
        }

        public Builder allowPersistentLicense(Boolean allowPersistentLicense) {
            this.allowPersistentLicense = Objects.requireNonNull(allowPersistentLicense);
            return this;
        }

        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }
        public StreamingPolicyFairPlayConfigurationResponse build() {
            return new StreamingPolicyFairPlayConfigurationResponse(allowPersistentLicense, customLicenseAcquisitionUrlTemplate);
        }
    }
}
