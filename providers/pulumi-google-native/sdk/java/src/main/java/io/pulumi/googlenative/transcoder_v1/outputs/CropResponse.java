// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class CropResponse {
    /**
     * The number of pixels to crop from the bottom. The default is 0.
     * 
     */
    private final Integer bottomPixels;
    /**
     * The number of pixels to crop from the left. The default is 0.
     * 
     */
    private final Integer leftPixels;
    /**
     * The number of pixels to crop from the right. The default is 0.
     * 
     */
    private final Integer rightPixels;
    /**
     * The number of pixels to crop from the top. The default is 0.
     * 
     */
    private final Integer topPixels;

    @CustomType.Constructor
    private CropResponse(
        @CustomType.Parameter("bottomPixels") Integer bottomPixels,
        @CustomType.Parameter("leftPixels") Integer leftPixels,
        @CustomType.Parameter("rightPixels") Integer rightPixels,
        @CustomType.Parameter("topPixels") Integer topPixels) {
        this.bottomPixels = bottomPixels;
        this.leftPixels = leftPixels;
        this.rightPixels = rightPixels;
        this.topPixels = topPixels;
    }

    /**
     * The number of pixels to crop from the bottom. The default is 0.
     * 
    */
    public Integer getBottomPixels() {
        return this.bottomPixels;
    }
    /**
     * The number of pixels to crop from the left. The default is 0.
     * 
    */
    public Integer getLeftPixels() {
        return this.leftPixels;
    }
    /**
     * The number of pixels to crop from the right. The default is 0.
     * 
    */
    public Integer getRightPixels() {
        return this.rightPixels;
    }
    /**
     * The number of pixels to crop from the top. The default is 0.
     * 
    */
    public Integer getTopPixels() {
        return this.topPixels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CropResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bottomPixels;
        private Integer leftPixels;
        private Integer rightPixels;
        private Integer topPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(CropResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bottomPixels = defaults.bottomPixels;
    	      this.leftPixels = defaults.leftPixels;
    	      this.rightPixels = defaults.rightPixels;
    	      this.topPixels = defaults.topPixels;
        }

        public Builder bottomPixels(Integer bottomPixels) {
            this.bottomPixels = Objects.requireNonNull(bottomPixels);
            return this;
        }

        public Builder leftPixels(Integer leftPixels) {
            this.leftPixels = Objects.requireNonNull(leftPixels);
            return this;
        }

        public Builder rightPixels(Integer rightPixels) {
            this.rightPixels = Objects.requireNonNull(rightPixels);
            return this;
        }

        public Builder topPixels(Integer topPixels) {
            this.topPixels = Objects.requireNonNull(topPixels);
            return this;
        }
        public CropResponse build() {
            return new CropResponse(bottomPixels, leftPixels, rightPixels, topPixels);
        }
    }
}
