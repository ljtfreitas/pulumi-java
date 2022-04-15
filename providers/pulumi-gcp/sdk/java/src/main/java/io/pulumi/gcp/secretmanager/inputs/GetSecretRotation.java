// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretRotation extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretRotation Empty = new GetSecretRotation();

    @Import(name="nextRotationTime", required=true)
      private final String nextRotationTime;

    public String nextRotationTime() {
        return this.nextRotationTime;
    }

    @Import(name="rotationPeriod", required=true)
      private final String rotationPeriod;

    public String rotationPeriod() {
        return this.rotationPeriod;
    }

    public GetSecretRotation(
        String nextRotationTime,
        String rotationPeriod) {
        this.nextRotationTime = Objects.requireNonNull(nextRotationTime, "expected parameter 'nextRotationTime' to be non-null");
        this.rotationPeriod = Objects.requireNonNull(rotationPeriod, "expected parameter 'rotationPeriod' to be non-null");
    }

    private GetSecretRotation() {
        this.nextRotationTime = null;
        this.rotationPeriod = null;
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
        }        public GetSecretRotation build() {
            return new GetSecretRotation(nextRotationTime, rotationPeriod);
        }
    }
}
