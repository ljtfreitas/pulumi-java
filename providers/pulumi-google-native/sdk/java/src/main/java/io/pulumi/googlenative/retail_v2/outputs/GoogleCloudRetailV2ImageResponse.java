// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2ImageResponse {
    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Integer height;
    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    private final String uri;
    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Integer width;

    @CustomType.Constructor
    private GoogleCloudRetailV2ImageResponse(
        @CustomType.Parameter("height") Integer height,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("width") Integer width) {
        this.height = height;
        this.uri = uri;
        this.width = width;
    }

    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public Integer getHeight() {
        return this.height;
    }
    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
    */
    public String getUri() {
        return this.uri;
    }
    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public Integer getWidth() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer height;
        private String uri;
        private Integer width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2ImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(Integer height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder width(Integer width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }
        public GoogleCloudRetailV2ImageResponse build() {
            return new GoogleCloudRetailV2ImageResponse(height, uri, width);
        }
    }
}
