// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectCacheArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectCacheArgs Empty = new ProjectCacheArgs();

    /**
     * Location of the source code from git or s3.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, `LOCAL_CUSTOM_CACHE`.
     * 
     */
    @InputImport(name="modes")
    private final @Nullable Input<List<String>> modes;

    public Input<List<String>> getModes() {
        return this.modes == null ? Input.empty() : this.modes;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProjectCacheArgs(
        @Nullable Input<String> location,
        @Nullable Input<List<String>> modes,
        @Nullable Input<String> type) {
        this.location = location;
        this.modes = modes;
        this.type = type;
    }

    private ProjectCacheArgs() {
        this.location = Input.empty();
        this.modes = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> modes;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectCacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.modes = defaults.modes;
    	      this.type = defaults.type;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setModes(@Nullable Input<List<String>> modes) {
            this.modes = modes;
            return this;
        }

        public Builder setModes(@Nullable List<String> modes) {
            this.modes = Input.ofNullable(modes);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ProjectCacheArgs build() {
            return new ProjectCacheArgs(location, modes, type);
        }
    }
}
