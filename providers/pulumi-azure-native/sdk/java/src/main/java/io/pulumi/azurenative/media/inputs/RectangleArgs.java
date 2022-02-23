// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties of a rectangular window applied to the input media before processing it.
 * 
 */
public final class RectangleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RectangleArgs Empty = new RectangleArgs();

    /**
     * The height of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    @InputImport(name="height")
        private final @Nullable Input<String> height;

    public Input<String> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * The number of pixels from the left-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    @InputImport(name="left")
        private final @Nullable Input<String> left;

    public Input<String> getLeft() {
        return this.left == null ? Input.empty() : this.left;
    }

    /**
     * The number of pixels from the top-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    @InputImport(name="top")
        private final @Nullable Input<String> top;

    public Input<String> getTop() {
        return this.top == null ? Input.empty() : this.top;
    }

    /**
     * The width of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    @InputImport(name="width")
        private final @Nullable Input<String> width;

    public Input<String> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public RectangleArgs(
        @Nullable Input<String> height,
        @Nullable Input<String> left,
        @Nullable Input<String> top,
        @Nullable Input<String> width) {
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    private RectangleArgs() {
        this.height = Input.empty();
        this.left = Input.empty();
        this.top = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RectangleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> height;
        private @Nullable Input<String> left;
        private @Nullable Input<String> top;
        private @Nullable Input<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(RectangleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.left = defaults.left;
    	      this.top = defaults.top;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable Input<String> height) {
            this.height = height;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder setLeft(@Nullable Input<String> left) {
            this.left = left;
            return this;
        }

        public Builder setLeft(@Nullable String left) {
            this.left = Input.ofNullable(left);
            return this;
        }

        public Builder setTop(@Nullable Input<String> top) {
            this.top = top;
            return this;
        }

        public Builder setTop(@Nullable String top) {
            this.top = Input.ofNullable(top);
            return this;
        }

        public Builder setWidth(@Nullable Input<String> width) {
            this.width = width;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = Input.ofNullable(width);
            return this;
        }
        public RectangleArgs build() {
            return new RectangleArgs(height, left, top, width);
        }
    }
}
