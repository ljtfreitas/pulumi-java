// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ProjectSecondarySourceVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondarySourceVersionArgs Empty = new ProjectSecondarySourceVersionArgs();

    /**
     * An identifier for a source in the build project.
     * 
     */
    @InputImport(name="sourceIdentifier", required=true)
    private final Input<String> sourceIdentifier;

    public Input<String> getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @InputImport(name="sourceVersion", required=true)
    private final Input<String> sourceVersion;

    public Input<String> getSourceVersion() {
        return this.sourceVersion;
    }

    public ProjectSecondarySourceVersionArgs(
        Input<String> sourceIdentifier,
        Input<String> sourceVersion) {
        this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier, "expected parameter 'sourceIdentifier' to be non-null");
        this.sourceVersion = Objects.requireNonNull(sourceVersion, "expected parameter 'sourceVersion' to be non-null");
    }

    private ProjectSecondarySourceVersionArgs() {
        this.sourceIdentifier = Input.empty();
        this.sourceVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourceIdentifier;
        private Input<String> sourceVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceIdentifier = defaults.sourceIdentifier;
    	      this.sourceVersion = defaults.sourceVersion;
        }

        public Builder setSourceIdentifier(Input<String> sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }

        public Builder setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Input.of(Objects.requireNonNull(sourceIdentifier));
            return this;
        }

        public Builder setSourceVersion(Input<String> sourceVersion) {
            this.sourceVersion = Objects.requireNonNull(sourceVersion);
            return this;
        }

        public Builder setSourceVersion(String sourceVersion) {
            this.sourceVersion = Input.of(Objects.requireNonNull(sourceVersion));
            return this;
        }
        public ProjectSecondarySourceVersionArgs build() {
            return new ProjectSecondarySourceVersionArgs(sourceIdentifier, sourceVersion);
        }
    }
}
