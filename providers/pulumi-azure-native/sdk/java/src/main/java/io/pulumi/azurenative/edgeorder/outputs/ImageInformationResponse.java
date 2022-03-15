// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImageInformationResponse {
    /**
     * Type of the image
     * 
     */
    private final String imageType;
    /**
     * Url of the image
     * 
     */
    private final String imageUrl;

    @CustomType.Constructor
    private ImageInformationResponse(
        @CustomType.Parameter("imageType") String imageType,
        @CustomType.Parameter("imageUrl") String imageUrl) {
        this.imageType = imageType;
        this.imageUrl = imageUrl;
    }

    /**
     * Type of the image
     * 
    */
    public String getImageType() {
        return this.imageType;
    }
    /**
     * Url of the image
     * 
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageType;
        private String imageUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.imageUrl = defaults.imageUrl;
        }

        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        public ImageInformationResponse build() {
            return new ImageInformationResponse(imageType, imageUrl);
        }
    }
}
