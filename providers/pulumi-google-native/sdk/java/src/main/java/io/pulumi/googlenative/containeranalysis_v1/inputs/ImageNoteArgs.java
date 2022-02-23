// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.FingerprintArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via: FROM Or an equivalent reference, e.g., a tag of the resource_url.
 * 
 */
public final class ImageNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageNoteArgs Empty = new ImageNoteArgs();

    /**
     * Immutable. The fingerprint of the base image.
     * 
     */
    @InputImport(name="fingerprint", required=true)
      private final Input<FingerprintArgs> fingerprint;

    public Input<FingerprintArgs> getFingerprint() {
        return this.fingerprint;
    }

    /**
     * Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    @InputImport(name="resourceUrl", required=true)
      private final Input<String> resourceUrl;

    public Input<String> getResourceUrl() {
        return this.resourceUrl;
    }

    public ImageNoteArgs(
        Input<FingerprintArgs> fingerprint,
        Input<String> resourceUrl) {
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.resourceUrl = Objects.requireNonNull(resourceUrl, "expected parameter 'resourceUrl' to be non-null");
    }

    private ImageNoteArgs() {
        this.fingerprint = Input.empty();
        this.resourceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FingerprintArgs> fingerprint;
        private Input<String> resourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.resourceUrl = defaults.resourceUrl;
        }

        public Builder setFingerprint(Input<FingerprintArgs> fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setFingerprint(FingerprintArgs fingerprint) {
            this.fingerprint = Input.of(Objects.requireNonNull(fingerprint));
            return this;
        }

        public Builder setResourceUrl(Input<String> resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }

        public Builder setResourceUrl(String resourceUrl) {
            this.resourceUrl = Input.of(Objects.requireNonNull(resourceUrl));
            return this;
        }
        public ImageNoteArgs build() {
            return new ImageNoteArgs(fingerprint, resourceUrl);
        }
    }
}
