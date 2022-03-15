// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.LiveEventEndpointResponse;
import io.pulumi.azurenative.media.outputs.LiveEventPreviewAccessControlResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventPreviewResponse {
    /**
     * The access control for live event preview.
     * 
     */
    private final @Nullable LiveEventPreviewAccessControlResponse accessControl;
    /**
     * An alternative media identifier associated with the streaming locator created for the preview. This value is specified at creation time and cannot be updated. The identifier can be used in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the StreamingPolicyName field.
     * 
     */
    private final @Nullable String alternativeMediaId;
    /**
     * The endpoints for preview. Do not share the preview URL with the live event audience.
     * 
     */
    private final @Nullable List<LiveEventEndpointResponse> endpoints;
    /**
     * The identifier of the preview locator in Guid format. Specifying this at creation time allows the caller to know the preview locator url before the event is created. If omitted, the service will generate a random identifier. This value cannot be updated once the live event is created.
     * 
     */
    private final @Nullable String previewLocator;
    /**
     * The name of streaming policy used for the live event preview. This value is specified at creation time and cannot be updated.
     * 
     */
    private final @Nullable String streamingPolicyName;

    @CustomType.Constructor
    private LiveEventPreviewResponse(
        @CustomType.Parameter("accessControl") @Nullable LiveEventPreviewAccessControlResponse accessControl,
        @CustomType.Parameter("alternativeMediaId") @Nullable String alternativeMediaId,
        @CustomType.Parameter("endpoints") @Nullable List<LiveEventEndpointResponse> endpoints,
        @CustomType.Parameter("previewLocator") @Nullable String previewLocator,
        @CustomType.Parameter("streamingPolicyName") @Nullable String streamingPolicyName) {
        this.accessControl = accessControl;
        this.alternativeMediaId = alternativeMediaId;
        this.endpoints = endpoints;
        this.previewLocator = previewLocator;
        this.streamingPolicyName = streamingPolicyName;
    }

    /**
     * The access control for live event preview.
     * 
    */
    public Optional<LiveEventPreviewAccessControlResponse> getAccessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * An alternative media identifier associated with the streaming locator created for the preview. This value is specified at creation time and cannot be updated. The identifier can be used in the CustomLicenseAcquisitionUrlTemplate or the CustomKeyAcquisitionUrlTemplate of the StreamingPolicy specified in the StreamingPolicyName field.
     * 
    */
    public Optional<String> getAlternativeMediaId() {
        return Optional.ofNullable(this.alternativeMediaId);
    }
    /**
     * The endpoints for preview. Do not share the preview URL with the live event audience.
     * 
    */
    public List<LiveEventEndpointResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * The identifier of the preview locator in Guid format. Specifying this at creation time allows the caller to know the preview locator url before the event is created. If omitted, the service will generate a random identifier. This value cannot be updated once the live event is created.
     * 
    */
    public Optional<String> getPreviewLocator() {
        return Optional.ofNullable(this.previewLocator);
    }
    /**
     * The name of streaming policy used for the live event preview. This value is specified at creation time and cannot be updated.
     * 
    */
    public Optional<String> getStreamingPolicyName() {
        return Optional.ofNullable(this.streamingPolicyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiveEventPreviewAccessControlResponse accessControl;
        private @Nullable String alternativeMediaId;
        private @Nullable List<LiveEventEndpointResponse> endpoints;
        private @Nullable String previewLocator;
        private @Nullable String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreviewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.alternativeMediaId = defaults.alternativeMediaId;
    	      this.endpoints = defaults.endpoints;
    	      this.previewLocator = defaults.previewLocator;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder accessControl(@Nullable LiveEventPreviewAccessControlResponse accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder alternativeMediaId(@Nullable String alternativeMediaId) {
            this.alternativeMediaId = alternativeMediaId;
            return this;
        }

        public Builder endpoints(@Nullable List<LiveEventEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder previewLocator(@Nullable String previewLocator) {
            this.previewLocator = previewLocator;
            return this;
        }

        public Builder streamingPolicyName(@Nullable String streamingPolicyName) {
            this.streamingPolicyName = streamingPolicyName;
            return this;
        }
        public LiveEventPreviewResponse build() {
            return new LiveEventPreviewResponse(accessControl, alternativeMediaId, endpoints, previewLocator, streamingPolicyName);
        }
    }
}
