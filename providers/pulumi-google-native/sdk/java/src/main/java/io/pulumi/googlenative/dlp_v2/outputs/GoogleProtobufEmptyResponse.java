// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GoogleProtobufEmptyResponse {
    @OutputCustomType.Constructor({})
    private GoogleProtobufEmptyResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleProtobufEmptyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleProtobufEmptyResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleProtobufEmptyResponse build() {
            return new GoogleProtobufEmptyResponse();
        }
    }
}
