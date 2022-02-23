// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageTemplateSharedImageVersionSourceResponse {
    /**
     * ARM resource id of the image version in the shared image gallery
     * 
     */
    private final String imageVersionId;
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'SharedImageVersion'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"imageVersionId","type"})
    private ImageTemplateSharedImageVersionSourceResponse(
        String imageVersionId,
        String type) {
        this.imageVersionId = Objects.requireNonNull(imageVersionId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ARM resource id of the image version in the shared image gallery
     * 
     */
    public String getImageVersionId() {
        return this.imageVersionId;
    }
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'SharedImageVersion'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateSharedImageVersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageVersionId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateSharedImageVersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersionId = defaults.imageVersionId;
    	      this.type = defaults.type;
        }

        public Builder setImageVersionId(String imageVersionId) {
            this.imageVersionId = Objects.requireNonNull(imageVersionId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateSharedImageVersionSourceResponse build() {
            return new ImageTemplateSharedImageVersionSourceResponse(imageVersionId, type);
        }
    }
}
