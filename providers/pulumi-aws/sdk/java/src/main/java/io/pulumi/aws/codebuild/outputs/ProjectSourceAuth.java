// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSourceAuth {
    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private final @Nullable String resource;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
        @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    private final String type;

    @CustomType.Constructor
    private ProjectSourceAuth(
        @CustomType.Parameter("resource") @Nullable String resource,
        @CustomType.Parameter("type") String type) {
        this.resource = resource;
        this.type = type;
    }

    /**
     * Resource value that applies to the specified authorization type. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
    */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
    */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSourceAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSourceAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectSourceAuth build() {
            return new ProjectSourceAuth(resource, type);
        }
    }
}
