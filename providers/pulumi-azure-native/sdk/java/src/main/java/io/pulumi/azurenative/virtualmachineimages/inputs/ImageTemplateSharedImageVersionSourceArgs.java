// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an image source that is an image version in a shared image gallery.
 * 
 */
public final class ImageTemplateSharedImageVersionSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateSharedImageVersionSourceArgs Empty = new ImageTemplateSharedImageVersionSourceArgs();

    /**
     * ARM resource id of the image version in the shared image gallery
     * 
     */
    @InputImport(name="imageVersionId", required=true)
        private final Input<String> imageVersionId;

    public Input<String> getImageVersionId() {
        return this.imageVersionId;
    }

    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'SharedImageVersion'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ImageTemplateSharedImageVersionSourceArgs(
        Input<String> imageVersionId,
        Input<String> type) {
        this.imageVersionId = Objects.requireNonNull(imageVersionId, "expected parameter 'imageVersionId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateSharedImageVersionSourceArgs() {
        this.imageVersionId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateSharedImageVersionSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> imageVersionId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateSharedImageVersionSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersionId = defaults.imageVersionId;
    	      this.type = defaults.type;
        }

        public Builder setImageVersionId(Input<String> imageVersionId) {
            this.imageVersionId = Objects.requireNonNull(imageVersionId);
            return this;
        }

        public Builder setImageVersionId(String imageVersionId) {
            this.imageVersionId = Input.of(Objects.requireNonNull(imageVersionId));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ImageTemplateSharedImageVersionSourceArgs build() {
            return new ImageTemplateSharedImageVersionSourceArgs(imageVersionId, type);
        }
    }
}
