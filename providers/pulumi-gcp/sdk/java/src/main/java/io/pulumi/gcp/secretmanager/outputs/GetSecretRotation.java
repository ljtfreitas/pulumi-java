// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecretRotation {
    private final String nextRotationTime;
    private final String rotationPeriod;

    @CustomType.Constructor
    private GetSecretRotation(
        @CustomType.Parameter("nextRotationTime") String nextRotationTime,
        @CustomType.Parameter("rotationPeriod") String rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    public String getNextRotationTime() {
        return this.nextRotationTime;
    }
    public String getRotationPeriod() {
        return this.rotationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretRotation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretRotation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }

        public Builder rotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }
        public GetSecretRotation build() {
            return new GetSecretRotation(nextRotationTime, rotationPeriod);
        }
    }
}
