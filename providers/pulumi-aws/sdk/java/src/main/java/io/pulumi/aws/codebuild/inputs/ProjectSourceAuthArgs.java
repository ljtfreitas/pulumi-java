// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSourceAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSourceAuthArgs Empty = new ProjectSourceAuthArgs();

    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @InputImport(name="resource")
    private final @Nullable Input<String> resource;

    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Input<String> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Input<String> getType() {
        return this.type;
    }

    public ProjectSourceAuthArgs(
        @Nullable Input<String> resource,
        Input<String> type) {
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSourceAuthArgs() {
        this.resource = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSourceAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resource;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSourceAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setResource(@Nullable Input<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ProjectSourceAuthArgs build() {
            return new ProjectSourceAuthArgs(resource, type);
        }
    }
}
