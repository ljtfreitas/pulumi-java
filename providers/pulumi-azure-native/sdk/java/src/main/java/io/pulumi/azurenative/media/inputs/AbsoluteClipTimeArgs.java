// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the clip time as an absolute time position in the media file.  The absolute time can point to a different position depending on whether the media file starts from a timestamp of zero or not.
 * 
 */
public final class AbsoluteClipTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AbsoluteClipTimeArgs Empty = new AbsoluteClipTimeArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AbsoluteClipTime'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     * 
     */
    @InputImport(name="time", required=true)
        private final Input<String> time;

    public Input<String> getTime() {
        return this.time;
    }

    public AbsoluteClipTimeArgs(
        Input<String> odataType,
        Input<String> time) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private AbsoluteClipTimeArgs() {
        this.odataType = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteClipTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;
        private Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteClipTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setTime(Input<String> time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Input.of(Objects.requireNonNull(time));
            return this;
        }
        public AbsoluteClipTimeArgs build() {
            return new AbsoluteClipTimeArgs(odataType, time);
        }
    }
}
