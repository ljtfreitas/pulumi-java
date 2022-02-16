// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.DomainResourceSpecInstanceType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainResourceSpec {
    private final @Nullable DomainResourceSpecInstanceType instanceType;
    private final @Nullable String sageMakerImageArn;
    private final @Nullable String sageMakerImageVersionArn;

    @OutputCustomType.Constructor({"instanceType","sageMakerImageArn","sageMakerImageVersionArn"})
    private DomainResourceSpec(
        @Nullable DomainResourceSpecInstanceType instanceType,
        @Nullable String sageMakerImageArn,
        @Nullable String sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    public Optional<DomainResourceSpecInstanceType> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<String> getSageMakerImageArn() {
        return Optional.ofNullable(this.sageMakerImageArn);
    }
    public Optional<String> getSageMakerImageVersionArn() {
        return Optional.ofNullable(this.sageMakerImageVersionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainResourceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DomainResourceSpecInstanceType instanceType;
        private @Nullable String sageMakerImageArn;
        private @Nullable String sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainResourceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder setInstanceType(@Nullable DomainResourceSpecInstanceType instanceType) {
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

        public DomainResourceSpec build() {
            return new DomainResourceSpec(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}