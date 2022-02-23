// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification {
    /**
     * The ID of the launch template. Conflicts with `launch_template_name`.
     * 
     */
    private final @Nullable String launchTemplateId;
    /**
     * The name of the launch template. Conflicts with `launch_template_id`.
     * 
     */
    private final @Nullable String launchTemplateName;
    /**
     * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"launchTemplateId","launchTemplateName","version"})
    private GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification(
        @Nullable String launchTemplateId,
        @Nullable String launchTemplateName,
        @Nullable String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    /**
     * The ID of the launch template. Conflicts with `launch_template_name`.
     * 
     */
    public Optional<String> getLaunchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * The name of the launch template. Conflicts with `launch_template_id`.
     * 
     */
    public Optional<String> getLaunchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    /**
     * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder setLaunchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder setLaunchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification build() {
            return new GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification(launchTemplateId, launchTemplateName, version);
        }
    }
}
