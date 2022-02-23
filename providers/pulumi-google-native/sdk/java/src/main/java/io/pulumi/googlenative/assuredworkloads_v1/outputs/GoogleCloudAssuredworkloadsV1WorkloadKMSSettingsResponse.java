// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse {
    /**
     * Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    private final String nextRotationTime;
    /**
     * Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    private final String rotationPeriod;

    @OutputCustomType.Constructor({"nextRotationTime","rotationPeriod"})
    private GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(
        String nextRotationTime,
        String rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
    }

    /**
     * Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    public String getNextRotationTime() {
        return this.nextRotationTime;
    }
    /**
     * Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    public String getRotationPeriod() {
        return this.rotationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder setNextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder setRotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }
        public GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsResponse(nextRotationTime, rotationPeriod);
        }
    }
}
