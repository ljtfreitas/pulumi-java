// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudRetailV2alphaColorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaColorInfoResponse Empty = new GoogleCloudRetailV2alphaColorInfoResponse();

    @InputImport(name="colorFamilies", required=true)
    private final List<String> colorFamilies;

    public List<String> getColorFamilies() {
        return this.colorFamilies;
    }

    @InputImport(name="colors", required=true)
    private final List<String> colors;

    public List<String> getColors() {
        return this.colors;
    }

    public GoogleCloudRetailV2alphaColorInfoResponse(
        List<String> colorFamilies,
        List<String> colors) {
        this.colorFamilies = Objects.requireNonNull(colorFamilies, "expected parameter 'colorFamilies' to be non-null");
        this.colors = Objects.requireNonNull(colors, "expected parameter 'colors' to be non-null");
    }

    private GoogleCloudRetailV2alphaColorInfoResponse() {
        this.colorFamilies = List.of();
        this.colors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> colorFamilies;
        private List<String> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder setColorFamilies(List<String> colorFamilies) {
            this.colorFamilies = Objects.requireNonNull(colorFamilies);
            return this;
        }

        public Builder setColors(List<String> colors) {
            this.colors = Objects.requireNonNull(colors);
            return this;
        }

        public GoogleCloudRetailV2alphaColorInfoResponse build() {
            return new GoogleCloudRetailV2alphaColorInfoResponse(colorFamilies, colors);
        }
    }
}