// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs Empty = new DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs();

    /**
     * The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    @Import(name="lifecycleConfigArn")
      private final @Nullable Output<String> lifecycleConfigArn;

    public Output<String> getLifecycleConfigArn() {
        return this.lifecycleConfigArn == null ? Output.empty() : this.lifecycleConfigArn;
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sagemakerImageArn")
      private final @Nullable Output<String> sagemakerImageArn;

    public Output<String> getSagemakerImageArn() {
        return this.sagemakerImageArn == null ? Output.empty() : this.sagemakerImageArn;
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sagemakerImageVersionArn")
      private final @Nullable Output<String> sagemakerImageVersionArn;

    public Output<String> getSagemakerImageVersionArn() {
        return this.sagemakerImageVersionArn == null ? Output.empty() : this.sagemakerImageVersionArn;
    }

    public DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs(
        @Nullable Output<String> instanceType,
        @Nullable Output<String> lifecycleConfigArn,
        @Nullable Output<String> sagemakerImageArn,
        @Nullable Output<String> sagemakerImageVersionArn) {
        this.instanceType = instanceType;
        this.lifecycleConfigArn = lifecycleConfigArn;
        this.sagemakerImageArn = sagemakerImageArn;
        this.sagemakerImageVersionArn = sagemakerImageVersionArn;
    }

    private DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs() {
        this.instanceType = Output.empty();
        this.lifecycleConfigArn = Output.empty();
        this.sagemakerImageArn = Output.empty();
        this.sagemakerImageVersionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> lifecycleConfigArn;
        private @Nullable Output<String> sagemakerImageArn;
        private @Nullable Output<String> sagemakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.lifecycleConfigArn = defaults.lifecycleConfigArn;
    	      this.sagemakerImageArn = defaults.sagemakerImageArn;
    	      this.sagemakerImageVersionArn = defaults.sagemakerImageVersionArn;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder lifecycleConfigArn(@Nullable Output<String> lifecycleConfigArn) {
            this.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        public Builder lifecycleConfigArn(@Nullable String lifecycleConfigArn) {
            this.lifecycleConfigArn = Output.ofNullable(lifecycleConfigArn);
            return this;
        }

        public Builder sagemakerImageArn(@Nullable Output<String> sagemakerImageArn) {
            this.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        public Builder sagemakerImageArn(@Nullable String sagemakerImageArn) {
            this.sagemakerImageArn = Output.ofNullable(sagemakerImageArn);
            return this;
        }

        public Builder sagemakerImageVersionArn(@Nullable Output<String> sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }

        public Builder sagemakerImageVersionArn(@Nullable String sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = Output.ofNullable(sagemakerImageVersionArn);
            return this;
        }
        public DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs build() {
            return new DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs(instanceType, lifecycleConfigArn, sagemakerImageArn, sagemakerImageVersionArn);
        }
    }
}
