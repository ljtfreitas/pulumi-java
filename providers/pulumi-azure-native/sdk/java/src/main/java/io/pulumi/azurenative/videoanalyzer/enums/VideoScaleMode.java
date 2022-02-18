// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes the video scaling mode to be applied. Default mode is 'Pad'. If the mode is 'Pad' or 'Stretch' then both width and height must be specified. Else if the mode is 'PreserveAspectRatio' then only one of width or height need be provided.
     * 
     */
    @EnumType
    public enum VideoScaleMode {
        /**
         * Pads the video with black horizontal stripes (letterbox) or black vertical stripes (pillar-box) so the video is resized to the specified dimensions while not altering the content aspect ratio.
         * 
         */
        Pad("Pad"),
        /**
         * Preserves the same aspect ratio as the input video. If only one video dimension is provided, the second dimension is calculated based on the input video aspect ratio. When 2 dimensions are provided, the video is resized to fit the most constraining dimension, considering the input video size and aspect ratio.
         * 
         */
        PreserveAspectRatio("PreserveAspectRatio"),
        /**
         * Stretches the original video so it resized to the specified dimensions.
         * 
         */
        Stretch("Stretch");

        private final String value;

        VideoScaleMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VideoScaleMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
