// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectBuildBatchConfigRestrictions {
    /**
     * An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    private final @Nullable List<String> computeTypesAlloweds;
    /**
     * Specifies the maximum number of builds allowed.
     * 
     */
    private final @Nullable Integer maximumBuildsAllowed;

    @OutputCustomType.Constructor({"computeTypesAlloweds","maximumBuildsAllowed"})
    private ProjectBuildBatchConfigRestrictions(
        @Nullable List<String> computeTypesAlloweds,
        @Nullable Integer maximumBuildsAllowed) {
        this.computeTypesAlloweds = computeTypesAlloweds;
        this.maximumBuildsAllowed = maximumBuildsAllowed;
    }

    /**
     * An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    public List<String> getComputeTypesAlloweds() {
        return this.computeTypesAlloweds == null ? List.of() : this.computeTypesAlloweds;
    }
    /**
     * Specifies the maximum number of builds allowed.
     * 
     */
    public Optional<Integer> getMaximumBuildsAllowed() {
        return Optional.ofNullable(this.maximumBuildsAllowed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBuildBatchConfigRestrictions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> computeTypesAlloweds;
        private @Nullable Integer maximumBuildsAllowed;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBuildBatchConfigRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeTypesAlloweds = defaults.computeTypesAlloweds;
    	      this.maximumBuildsAllowed = defaults.maximumBuildsAllowed;
        }

        public Builder setComputeTypesAlloweds(@Nullable List<String> computeTypesAlloweds) {
            this.computeTypesAlloweds = computeTypesAlloweds;
            return this;
        }

        public Builder setMaximumBuildsAllowed(@Nullable Integer maximumBuildsAllowed) {
            this.maximumBuildsAllowed = maximumBuildsAllowed;
            return this;
        }
        public ProjectBuildBatchConfigRestrictions build() {
            return new ProjectBuildBatchConfigRestrictions(computeTypesAlloweds, maximumBuildsAllowed);
        }
    }
}
