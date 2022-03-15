// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The color information of a Product.
 * 
 */
public final class GoogleCloudRetailV2betaColorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaColorInfoArgs Empty = new GoogleCloudRetailV2betaColorInfoArgs();

    /**
     * The standard color families. Strongly recommended to use the following standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colorFamilies")
      private final @Nullable Output<List<String>> colorFamilies;

    public Output<List<String>> getColorFamilies() {
        return this.colorFamilies == null ? Output.empty() : this.colorFamilies;
    }

    /**
     * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colors")
      private final @Nullable Output<List<String>> colors;

    public Output<List<String>> getColors() {
        return this.colors == null ? Output.empty() : this.colors;
    }

    public GoogleCloudRetailV2betaColorInfoArgs(
        @Nullable Output<List<String>> colorFamilies,
        @Nullable Output<List<String>> colors) {
        this.colorFamilies = colorFamilies;
        this.colors = colors;
    }

    private GoogleCloudRetailV2betaColorInfoArgs() {
        this.colorFamilies = Output.empty();
        this.colors = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaColorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> colorFamilies;
        private @Nullable Output<List<String>> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaColorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder colorFamilies(@Nullable Output<List<String>> colorFamilies) {
            this.colorFamilies = colorFamilies;
            return this;
        }

        public Builder colorFamilies(@Nullable List<String> colorFamilies) {
            this.colorFamilies = Output.ofNullable(colorFamilies);
            return this;
        }

        public Builder colors(@Nullable Output<List<String>> colors) {
            this.colors = colors;
            return this;
        }

        public Builder colors(@Nullable List<String> colors) {
            this.colors = Output.ofNullable(colors);
            return this;
        }
        public GoogleCloudRetailV2betaColorInfoArgs build() {
            return new GoogleCloudRetailV2betaColorInfoArgs(colorFamilies, colors);
        }
    }
}
