// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class UserProfileUserSettingsTensorBoardAppSettings {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    private final UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

    @CustomType.Constructor
    private UserProfileUserSettingsTensorBoardAppSettings(@CustomType.Parameter("defaultResourceSpec") UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
    */
    public UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsTensorBoardAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsTensorBoardAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }
        public UserProfileUserSettingsTensorBoardAppSettings build() {
            return new UserProfileUserSettingsTensorBoardAppSettings(defaultResourceSpec);
        }
    }
}
