// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class StreamingImageTags {
    @OutputCustomType.Constructor({})
    private StreamingImageTags() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingImageTags defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingImageTags defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public StreamingImageTags build() {
            return new StreamingImageTags();
        }
    }
}
