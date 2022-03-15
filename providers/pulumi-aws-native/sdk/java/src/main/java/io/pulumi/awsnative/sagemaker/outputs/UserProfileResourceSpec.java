// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.UserProfileResourceSpecInstanceType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileResourceSpec {
    /**
     * The instance type that the image version runs on.
     * 
     */
    private final @Nullable UserProfileResourceSpecInstanceType instanceType;
    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    private final @Nullable String sageMakerImageArn;
    /**
     * The ARN of the image version created on the instance.
     * 
     */
    private final @Nullable String sageMakerImageVersionArn;

    @CustomType.Constructor
    private UserProfileResourceSpec(
        @CustomType.Parameter("instanceType") @Nullable UserProfileResourceSpecInstanceType instanceType,
        @CustomType.Parameter("sageMakerImageArn") @Nullable String sageMakerImageArn,
        @CustomType.Parameter("sageMakerImageVersionArn") @Nullable String sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    /**
     * The instance type that the image version runs on.
     * 
    */
    public Optional<UserProfileResourceSpecInstanceType> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
    */
    public Optional<String> getSageMakerImageArn() {
        return Optional.ofNullable(this.sageMakerImageArn);
    }
    /**
     * The ARN of the image version created on the instance.
     * 
    */
    public Optional<String> getSageMakerImageVersionArn() {
        return Optional.ofNullable(this.sageMakerImageVersionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileResourceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserProfileResourceSpecInstanceType instanceType;
        private @Nullable String sageMakerImageArn;
        private @Nullable String sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileResourceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder instanceType(@Nullable UserProfileResourceSpecInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder sageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        public Builder sageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }
        public UserProfileResourceSpec build() {
            return new UserProfileResourceSpec(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
