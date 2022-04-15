// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGitGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementConfigSyncGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementConfigSyncGetArgs Empty = new FeatureMembershipConfigmanagementConfigSyncGetArgs();

    /**
     * - 
     * (Optional) Structure is documented below.
     * 
     */
    @Import(name="git")
      private final @Nullable Output<FeatureMembershipConfigmanagementConfigSyncGitGetArgs> git;

    public Output<FeatureMembershipConfigmanagementConfigSyncGitGetArgs> git() {
        return this.git == null ? Codegen.empty() : this.git;
    }

    /**
     * Specifies whether the Config Sync Repo is in "hierarchical" or "unstructured" mode.
     * 
     */
    @Import(name="sourceFormat")
      private final @Nullable Output<String> sourceFormat;

    public Output<String> sourceFormat() {
        return this.sourceFormat == null ? Codegen.empty() : this.sourceFormat;
    }

    public FeatureMembershipConfigmanagementConfigSyncGetArgs(
        @Nullable Output<FeatureMembershipConfigmanagementConfigSyncGitGetArgs> git,
        @Nullable Output<String> sourceFormat) {
        this.git = git;
        this.sourceFormat = sourceFormat;
    }

    private FeatureMembershipConfigmanagementConfigSyncGetArgs() {
        this.git = Codegen.empty();
        this.sourceFormat = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementConfigSyncGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FeatureMembershipConfigmanagementConfigSyncGitGetArgs> git;
        private @Nullable Output<String> sourceFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementConfigSyncGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.git = defaults.git;
    	      this.sourceFormat = defaults.sourceFormat;
        }

        public Builder git(@Nullable Output<FeatureMembershipConfigmanagementConfigSyncGitGetArgs> git) {
            this.git = git;
            return this;
        }
        public Builder git(@Nullable FeatureMembershipConfigmanagementConfigSyncGitGetArgs git) {
            this.git = Codegen.ofNullable(git);
            return this;
        }
        public Builder sourceFormat(@Nullable Output<String> sourceFormat) {
            this.sourceFormat = sourceFormat;
            return this;
        }
        public Builder sourceFormat(@Nullable String sourceFormat) {
            this.sourceFormat = Codegen.ofNullable(sourceFormat);
            return this;
        }        public FeatureMembershipConfigmanagementConfigSyncGetArgs build() {
            return new FeatureMembershipConfigmanagementConfigSyncGetArgs(git, sourceFormat);
        }
    }
}
