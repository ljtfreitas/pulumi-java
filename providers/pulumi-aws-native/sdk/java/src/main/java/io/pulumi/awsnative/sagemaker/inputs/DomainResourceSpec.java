// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.DomainResourceSpecInstanceType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainResourceSpec extends io.pulumi.resources.InvokeArgs {

    public static final DomainResourceSpec Empty = new DomainResourceSpec();

    /**
     * The instance type that the image version runs on.
     * 
     */
    @InputImport(name="instanceType")
        private final @Nullable DomainResourceSpecInstanceType instanceType;

    public Optional<DomainResourceSpecInstanceType> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @InputImport(name="sageMakerImageArn")
        private final @Nullable String sageMakerImageArn;

    public Optional<String> getSageMakerImageArn() {
        return this.sageMakerImageArn == null ? Optional.empty() : Optional.ofNullable(this.sageMakerImageArn);
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @InputImport(name="sageMakerImageVersionArn")
        private final @Nullable String sageMakerImageVersionArn;

    public Optional<String> getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn == null ? Optional.empty() : Optional.ofNullable(this.sageMakerImageVersionArn);
    }

    public DomainResourceSpec(
        @Nullable DomainResourceSpecInstanceType instanceType,
        @Nullable String sageMakerImageArn,
        @Nullable String sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    private DomainResourceSpec() {
        this.instanceType = null;
        this.sageMakerImageArn = null;
        this.sageMakerImageVersionArn = null;
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
