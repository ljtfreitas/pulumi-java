// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.AppResourceSpecInstanceType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppResourceSpec {
    /**
     * The instance type that the image version runs on.
     * 
     */
    private final @Nullable AppResourceSpecInstanceType instanceType;
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

    @OutputCustomType.Constructor({"instanceType","sageMakerImageArn","sageMakerImageVersionArn"})
    private AppResourceSpec(
        @Nullable AppResourceSpecInstanceType instanceType,
        @Nullable String sageMakerImageArn,
        @Nullable String sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    /**
     * The instance type that the image version runs on.
     * 
     */
    public Optional<AppResourceSpecInstanceType> getInstanceType() {
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

    public static Builder builder(AppResourceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppResourceSpecInstanceType instanceType;
        private @Nullable String sageMakerImageArn;
        private @Nullable String sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AppResourceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder setInstanceType(@Nullable AppResourceSpecInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setSageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        public Builder setSageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }
        public AppResourceSpec build() {
            return new AppResourceSpec(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
