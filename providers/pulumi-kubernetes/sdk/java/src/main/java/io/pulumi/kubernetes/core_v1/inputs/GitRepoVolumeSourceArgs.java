// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 * 
 * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
 * 
 */
public final class GitRepoVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitRepoVolumeSourceArgs Empty = new GitRepoVolumeSourceArgs();

    /**
     * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    @InputImport(name="directory")
        private final @Nullable Input<String> directory;

    public Input<String> getDirectory() {
        return this.directory == null ? Input.empty() : this.directory;
    }

    /**
     * Repository URL
     * 
     */
    @InputImport(name="repository", required=true)
        private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    /**
     * Commit hash for the specified revision.
     * 
     */
    @InputImport(name="revision")
        private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    public GitRepoVolumeSourceArgs(
        @Nullable Input<String> directory,
        Input<String> repository,
        @Nullable Input<String> revision) {
        this.directory = directory;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.revision = revision;
    }

    private GitRepoVolumeSourceArgs() {
        this.directory = Input.empty();
        this.repository = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> directory;
        private Input<String> repository;
        private @Nullable Input<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directory = defaults.directory;
    	      this.repository = defaults.repository;
    	      this.revision = defaults.revision;
        }

        public Builder setDirectory(@Nullable Input<String> directory) {
            this.directory = directory;
            return this;
        }

        public Builder setDirectory(@Nullable String directory) {
            this.directory = Input.ofNullable(directory);
            return this;
        }

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder setRevision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }
        public GitRepoVolumeSourceArgs build() {
            return new GitRepoVolumeSourceArgs(directory, repository, revision);
        }
    }
}
