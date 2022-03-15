// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The color information of a Product.
 * 
 */
public final class GoogleCloudRetailV2ColorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2ColorInfoResponse Empty = new GoogleCloudRetailV2ColorInfoResponse();

    /**
     * The standard color families. Strongly recommended to use the following standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colorFamilies", required=true)
      private final List<String> colorFamilies;

    public List<String> getColorFamilies() {
        return this.colorFamilies;
    }

    /**
     * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colors", required=true)
      private final List<String> colors;

    public List<String> getColors() {
        return this.colors;
    }

    public GoogleCloudRetailV2ColorInfoResponse(
        List<String> colorFamilies,
        List<String> colors) {
        this.colorFamilies = Objects.requireNonNull(colorFamilies, "expected parameter 'colorFamilies' to be non-null");
        this.colors = Objects.requireNonNull(colors, "expected parameter 'colors' to be non-null");
    }

    private GoogleCloudRetailV2ColorInfoResponse() {
        this.colorFamilies = List.of();
        this.colors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2ColorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> colorFamilies;
        private List<String> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2ColorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder colorFamilies(List<String> colorFamilies) {
            this.colorFamilies = Objects.requireNonNull(colorFamilies);
            return this;
        }

        public Builder colors(List<String> colors) {
            this.colors = Objects.requireNonNull(colors);
            return this;
        }
        public GoogleCloudRetailV2ColorInfoResponse build() {
            return new GoogleCloudRetailV2ColorInfoResponse(colorFamilies, colors);
        }
    }
}
