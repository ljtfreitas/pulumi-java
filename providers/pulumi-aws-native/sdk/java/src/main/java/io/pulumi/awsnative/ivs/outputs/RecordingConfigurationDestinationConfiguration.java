// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.outputs;

import io.pulumi.awsnative.ivs.outputs.RecordingConfigurationS3DestinationConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RecordingConfigurationDestinationConfiguration {
    private final RecordingConfigurationS3DestinationConfiguration s3;

    @CustomType.Constructor
    private RecordingConfigurationDestinationConfiguration(@CustomType.Parameter("s3") RecordingConfigurationS3DestinationConfiguration s3) {
        this.s3 = s3;
    }

    public RecordingConfigurationS3DestinationConfiguration getS3() {
        return this.s3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordingConfigurationDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingConfigurationS3DestinationConfiguration s3;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordingConfigurationDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(RecordingConfigurationS3DestinationConfiguration s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }
        public RecordingConfigurationDestinationConfiguration build() {
            return new RecordingConfigurationDestinationConfiguration(s3);
        }
    }
}
