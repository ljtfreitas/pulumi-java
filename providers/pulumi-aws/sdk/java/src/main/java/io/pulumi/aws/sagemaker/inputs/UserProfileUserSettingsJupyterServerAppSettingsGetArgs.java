// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsJupyterServerAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsJupyterServerAppSettingsGetArgs Empty = new UserProfileUserSettingsJupyterServerAppSettingsGetArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @InputImport(name="defaultResourceSpec", required=true)
    private final Input<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Input<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
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

    public UserProfileUserSettingsJupyterServerAppSettingsGetArgs(
        Input<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec,
        @Nullable Input<List<String>> lifecycleConfigArns) {
        this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private UserProfileUserSettingsJupyterServerAppSettingsGetArgs() {
        this.defaultResourceSpec = Input.empty();
        this.lifecycleConfigArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsJupyterServerAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;
        private @Nullable Input<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsJupyterServerAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder setDefaultResourceSpec(Input<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }

        public Builder setDefaultResourceSpec(UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
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
        public UserProfileUserSettingsJupyterServerAppSettingsGetArgs build() {
            return new UserProfileUserSettingsJupyterServerAppSettingsGetArgs(defaultResourceSpec, lifecycleConfigArns);
        }
    }
}
