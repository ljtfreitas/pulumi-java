// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class UserProfileUserSettingsTensorBoardAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsTensorBoardAppSettingsGetArgs Empty = new UserProfileUserSettingsTensorBoardAppSettingsGetArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @InputImport(name="defaultResourceSpec", required=true)
    private final Input<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Input<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    public UserProfileUserSettingsTensorBoardAppSettingsGetArgs(Input<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
        this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
    }

    private UserProfileUserSettingsTensorBoardAppSettingsGetArgs() {
        this.defaultResourceSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsTensorBoardAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsTensorBoardAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder setDefaultResourceSpec(Input<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }

        public Builder setDefaultResourceSpec(UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
            this.defaultResourceSpec = Input.of(Objects.requireNonNull(defaultResourceSpec));
            return this;
        }
        public UserProfileUserSettingsTensorBoardAppSettingsGetArgs build() {
            return new UserProfileUserSettingsTensorBoardAppSettingsGetArgs(defaultResourceSpec);
        }
    }
}
