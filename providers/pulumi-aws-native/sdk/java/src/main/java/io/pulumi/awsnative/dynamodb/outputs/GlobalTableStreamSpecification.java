// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GlobalTableStreamSpecification {
    private final String streamViewType;

    @OutputCustomType.Constructor({"streamViewType"})
    private GlobalTableStreamSpecification(String streamViewType) {
        this.streamViewType = Objects.requireNonNull(streamViewType);
    }

    public String getStreamViewType() {
        return this.streamViewType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableStreamSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamViewType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableStreamSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamViewType = defaults.streamViewType;
        }

        public Builder setStreamViewType(String streamViewType) {
            this.streamViewType = Objects.requireNonNull(streamViewType);
            return this;
        }
        public GlobalTableStreamSpecification build() {
            return new GlobalTableStreamSpecification(streamViewType);
        }
    }
}
