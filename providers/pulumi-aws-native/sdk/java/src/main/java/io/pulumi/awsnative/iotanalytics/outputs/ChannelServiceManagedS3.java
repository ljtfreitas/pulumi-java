// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ChannelServiceManagedS3 {
    @OutputCustomType.Constructor
    private ChannelServiceManagedS3() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelServiceManagedS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelServiceManagedS3 defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ChannelServiceManagedS3 build() {
            return new ChannelServiceManagedS3();
        }
    }
}
