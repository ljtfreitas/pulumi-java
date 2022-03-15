// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rekognition;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @Import(name="projectName")
      private final @Nullable Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName == null ? Output.empty() : this.projectName;
    }

    public ProjectArgs(@Nullable Output<String> projectName) {
        this.projectName = projectName;
    }

    private ProjectArgs() {
        this.projectName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> projectName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectName = defaults.projectName;
        }

        public Builder projectName(@Nullable Output<String> projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder projectName(@Nullable String projectName) {
            this.projectName = Output.ofNullable(projectName);
            return this;
        }
        public ProjectArgs build() {
            return new ProjectArgs(projectName);
        }
    }
}
