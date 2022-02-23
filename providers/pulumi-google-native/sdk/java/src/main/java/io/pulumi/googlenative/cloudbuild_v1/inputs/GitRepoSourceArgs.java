// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.enums.GitRepoSourceRepoType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * GitRepoSource describes a repo and ref of a code repository.
 * 
 */
public final class GitRepoSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitRepoSourceArgs Empty = new GitRepoSourceArgs();

    /**
     * The branch or tag to use. Must start with "refs/" (required).
     * 
     */
    @InputImport(name="ref")
      private final @Nullable Input<String> ref;

    public Input<String> getRef() {
        return this.ref == null ? Input.empty() : this.ref;
    }

    /**
     * See RepoType below.
     * 
     */
    @InputImport(name="repoType")
      private final @Nullable Input<GitRepoSourceRepoType> repoType;

    public Input<GitRepoSourceRepoType> getRepoType() {
        return this.repoType == null ? Input.empty() : this.repoType;
    }

    /**
     * The URI of the repo (required).
     * 
     */
    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public GitRepoSourceArgs(
        @Nullable Input<String> ref,
        @Nullable Input<GitRepoSourceRepoType> repoType,
        @Nullable Input<String> uri) {
        this.ref = ref;
        this.repoType = repoType;
        this.uri = uri;
    }

    private GitRepoSourceArgs() {
        this.ref = Input.empty();
        this.repoType = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ref;
        private @Nullable Input<GitRepoSourceRepoType> repoType;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
    	      this.repoType = defaults.repoType;
    	      this.uri = defaults.uri;
        }

        public Builder setRef(@Nullable Input<String> ref) {
            this.ref = ref;
            return this;
        }

        public Builder setRef(@Nullable String ref) {
            this.ref = Input.ofNullable(ref);
            return this;
        }

        public Builder setRepoType(@Nullable Input<GitRepoSourceRepoType> repoType) {
            this.repoType = repoType;
            return this;
        }

        public Builder setRepoType(@Nullable GitRepoSourceRepoType repoType) {
            this.repoType = Input.ofNullable(repoType);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public GitRepoSourceArgs build() {
            return new GitRepoSourceArgs(ref, repoType, uri);
        }
    }
}
