// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigRestrictionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectBuildBatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectBuildBatchConfigArgs Empty = new ProjectBuildBatchConfigArgs();

    /**
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * 
     */
    @Import(name="combineArtifacts")
      private final @Nullable Output<Boolean> combineArtifacts;

    public Output<Boolean> getCombineArtifacts() {
        return this.combineArtifacts == null ? Output.empty() : this.combineArtifacts;
    }

    /**
     * Specifies the restrictions for the batch build.
     * 
     */
    @Import(name="restrictions")
      private final @Nullable Output<ProjectBuildBatchConfigRestrictionsArgs> restrictions;

    public Output<ProjectBuildBatchConfigRestrictionsArgs> getRestrictions() {
        return this.restrictions == null ? Output.empty() : this.restrictions;
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @Import(name="serviceRole", required=true)
      private final Output<String> serviceRole;

    public Output<String> getServiceRole() {
        return this.serviceRole;
    }

    /**
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * 
     */
    @Import(name="timeoutInMins")
      private final @Nullable Output<Integer> timeoutInMins;

    public Output<Integer> getTimeoutInMins() {
        return this.timeoutInMins == null ? Output.empty() : this.timeoutInMins;
    }

    public ProjectBuildBatchConfigArgs(
        @Nullable Output<Boolean> combineArtifacts,
        @Nullable Output<ProjectBuildBatchConfigRestrictionsArgs> restrictions,
        Output<String> serviceRole,
        @Nullable Output<Integer> timeoutInMins) {
        this.combineArtifacts = combineArtifacts;
        this.restrictions = restrictions;
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
        this.timeoutInMins = timeoutInMins;
    }

    private ProjectBuildBatchConfigArgs() {
        this.combineArtifacts = Output.empty();
        this.restrictions = Output.empty();
        this.serviceRole = Output.empty();
        this.timeoutInMins = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> combineArtifacts;
        private @Nullable Output<ProjectBuildBatchConfigRestrictionsArgs> restrictions;
        private Output<String> serviceRole;
        private @Nullable Output<Integer> timeoutInMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combineArtifacts = defaults.combineArtifacts;
    	      this.restrictions = defaults.restrictions;
    	      this.serviceRole = defaults.serviceRole;
    	      this.timeoutInMins = defaults.timeoutInMins;
        }

        public Builder combineArtifacts(@Nullable Output<Boolean> combineArtifacts) {
            this.combineArtifacts = combineArtifacts;
            return this;
        }

        public Builder combineArtifacts(@Nullable Boolean combineArtifacts) {
            this.combineArtifacts = Output.ofNullable(combineArtifacts);
            return this;
        }

        public Builder restrictions(@Nullable Output<ProjectBuildBatchConfigRestrictionsArgs> restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(@Nullable ProjectBuildBatchConfigRestrictionsArgs restrictions) {
            this.restrictions = Output.ofNullable(restrictions);
            return this;
        }

        public Builder serviceRole(Output<String> serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }

        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Output.of(Objects.requireNonNull(serviceRole));
            return this;
        }

        public Builder timeoutInMins(@Nullable Output<Integer> timeoutInMins) {
            this.timeoutInMins = timeoutInMins;
            return this;
        }

        public Builder timeoutInMins(@Nullable Integer timeoutInMins) {
            this.timeoutInMins = Output.ofNullable(timeoutInMins);
            return this;
        }
        public ProjectBuildBatchConfigArgs build() {
            return new ProjectBuildBatchConfigArgs(combineArtifacts, restrictions, serviceRole, timeoutInMins);
        }
    }
}
