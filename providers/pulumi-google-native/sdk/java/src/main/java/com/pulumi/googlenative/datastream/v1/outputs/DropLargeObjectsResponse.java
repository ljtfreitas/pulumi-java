// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DropLargeObjectsResponse {
    @CustomType.Constructor
    private DropLargeObjectsResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropLargeObjectsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DropLargeObjectsResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public DropLargeObjectsResponse build() {
            return new DropLargeObjectsResponse();
        }
    }
}
