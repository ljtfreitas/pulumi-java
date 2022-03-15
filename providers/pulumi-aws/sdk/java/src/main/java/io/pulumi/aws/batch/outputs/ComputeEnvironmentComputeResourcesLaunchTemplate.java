// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeEnvironmentComputeResourcesLaunchTemplate {
    /**
     * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
     * 
     */
    private final @Nullable String launchTemplateId;
    /**
     * Name of the launch template.
     * 
     */
    private final @Nullable String launchTemplateName;
    /**
     * The version number of the launch template. Default: The default version of the launch template.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ComputeEnvironmentComputeResourcesLaunchTemplate(
        @CustomType.Parameter("launchTemplateId") @Nullable String launchTemplateId,
        @CustomType.Parameter("launchTemplateName") @Nullable String launchTemplateName,
        @CustomType.Parameter("version") @Nullable String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    /**
     * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
     * 
    */
    public Optional<String> getLaunchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * Name of the launch template.
     * 
    */
    public Optional<String> getLaunchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    /**
     * The version number of the launch template. Default: The default version of the launch template.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ComputeEnvironmentComputeResourcesLaunchTemplate build() {
            return new ComputeEnvironmentComputeResourcesLaunchTemplate(launchTemplateId, launchTemplateName, version);
        }
    }
}
