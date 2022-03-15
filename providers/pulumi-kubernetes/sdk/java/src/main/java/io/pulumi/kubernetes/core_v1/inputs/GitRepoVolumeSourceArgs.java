// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="directory")
      private final @Nullable Output<String> directory;

    public Output<String> getDirectory() {
        return this.directory == null ? Output.empty() : this.directory;
    }

    /**
     * Repository URL
     * 
     */
    @Import(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> getRepository() {
        return this.repository;
    }

    /**
     * Commit hash for the specified revision.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<String> revision;

    public Output<String> getRevision() {
        return this.revision == null ? Output.empty() : this.revision;
    }

    public GitRepoVolumeSourceArgs(
        @Nullable Output<String> directory,
        Output<String> repository,
        @Nullable Output<String> revision) {
        this.directory = directory;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.revision = revision;
    }

    private GitRepoVolumeSourceArgs() {
        this.directory = Output.empty();
        this.repository = Output.empty();
        this.revision = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> directory;
        private Output<String> repository;
        private @Nullable Output<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directory = defaults.directory;
    	      this.repository = defaults.repository;
    	      this.revision = defaults.revision;
        }

        public Builder directory(@Nullable Output<String> directory) {
            this.directory = directory;
            return this;
        }

        public Builder directory(@Nullable String directory) {
            this.directory = Output.ofNullable(directory);
            return this;
        }

        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder revision(@Nullable Output<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder revision(@Nullable String revision) {
            this.revision = Output.ofNullable(revision);
            return this;
        }
        public GitRepoVolumeSourceArgs build() {
            return new GitRepoVolumeSourceArgs(directory, repository, revision);
        }
    }
}
