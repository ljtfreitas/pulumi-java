// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.FingerprintResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageNoteResponse {
    /**
     * Immutable. The fingerprint of the base image.
     * 
     */
    private final FingerprintResponse fingerprint;
    /**
     * Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    private final String resourceUrl;

    @OutputCustomType.Constructor({"fingerprint","resourceUrl"})
    private ImageNoteResponse(
        FingerprintResponse fingerprint,
        String resourceUrl) {
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.resourceUrl = Objects.requireNonNull(resourceUrl);
    }

    /**
     * Immutable. The fingerprint of the base image.
     * 
     */
    public FingerprintResponse getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FingerprintResponse fingerprint;
        private String resourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.resourceUrl = defaults.resourceUrl;
        }

        public Builder setFingerprint(FingerprintResponse fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setResourceUrl(String resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }
        public ImageNoteResponse build() {
            return new ImageNoteResponse(fingerprint, resourceUrl);
        }
    }
}
