// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the clip time as an absolute time position in the media file.  The absolute time can point to a different position depending on whether the media file starts from a timestamp of zero or not.
 * 
 */
public final class AbsoluteClipTimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AbsoluteClipTimeResponse Empty = new AbsoluteClipTimeResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AbsoluteClipTime'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The time position on the timeline of the input media. It is usually specified as an ISO8601 period. e.g PT30S for 30 seconds.
     * 
     */
    @InputImport(name="time", required=true)
        private final String time;

    public String getTime() {
        return this.time;
    }

    public AbsoluteClipTimeResponse(
        String odataType,
        String time) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private AbsoluteClipTimeResponse() {
        this.odataType = null;
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteClipTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteClipTimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public AbsoluteClipTimeResponse build() {
            return new AbsoluteClipTimeResponse(odataType, time);
        }
    }
}
