// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs Empty = new DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Output.empty() : this.defaultResourceSpec;
    }

    public DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    private DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs() {
        this.defaultResourceSpec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
            this.defaultResourceSpec = Output.ofNullable(defaultResourceSpec);
            return this;
        }
        public DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs build() {
            return new DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs(defaultResourceSpec);
        }
    }
}
