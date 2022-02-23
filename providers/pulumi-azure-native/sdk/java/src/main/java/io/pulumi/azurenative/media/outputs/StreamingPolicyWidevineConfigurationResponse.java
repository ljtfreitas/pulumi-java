// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamingPolicyWidevineConfigurationResponse {
    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    private final @Nullable String customLicenseAcquisitionUrlTemplate;

    @OutputCustomType.Constructor({"customLicenseAcquisitionUrlTemplate"})
    private StreamingPolicyWidevineConfigurationResponse(@Nullable String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
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

    public static Builder builder(StreamingPolicyWidevineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customLicenseAcquisitionUrlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyWidevineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
        }

        public Builder setCustomLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }
        public StreamingPolicyWidevineConfigurationResponse build() {
            return new StreamingPolicyWidevineConfigurationResponse(customLicenseAcquisitionUrlTemplate);
        }
    }
}
