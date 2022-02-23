// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsKernelGatewayAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsKernelGatewayAppSettingsGetArgs Empty = new UserProfileUserSettingsKernelGatewayAppSettingsGetArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    @InputImport(name="customImages")
    private final @Nullable Input<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;

    public Input<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> getCustomImages() {
        return this.customImages == null ? Input.empty() : this.customImages;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @InputImport(name="defaultResourceSpec", required=true)
    private final Input<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Input<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    @InputImport(name="lifecycleConfigArns")
    private final @Nullable Input<List<String>> lifecycleConfigArns;

    public Input<List<String>> getLifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? Input.empty() : this.lifecycleConfigArns;
    }

    public UserProfileUserSettingsKernelGatewayAppSettingsGetArgs(
        @Nullable Input<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages,
        Input<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec,
        @Nullable Input<List<String>> lifecycleConfigArns) {
        this.customImages = customImages;
        this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private UserProfileUserSettingsKernelGatewayAppSettingsGetArgs() {
        this.customImages = Input.empty();
        this.defaultResourceSpec = Input.empty();
        this.lifecycleConfigArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;
        private Input<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;
        private @Nullable Input<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder setCustomImages(@Nullable Input<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages) {
            this.customImages = customImages;
            return this;
        }

        public Builder setCustomImages(@Nullable List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs> customImages) {
            this.customImages = Input.ofNullable(customImages);
            return this;
        }

        public Builder setDefaultResourceSpec(Input<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }

        public Builder setDefaultResourceSpec(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
            this.defaultResourceSpec = Input.of(Objects.requireNonNull(defaultResourceSpec));
            return this;
        }

        public Builder setLifecycleConfigArns(@Nullable Input<List<String>> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }

        public Builder setLifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {
            this.lifecycleConfigArns = Input.ofNullable(lifecycleConfigArns);
            return this;
        }
        public UserProfileUserSettingsKernelGatewayAppSettingsGetArgs build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsGetArgs(customImages, defaultResourceSpec, lifecycleConfigArns);
        }
    }
}
