// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepoResponse {
    /**
     * Array of branches.
     * 
     */
    private final @Nullable List<String> branches;
    /**
     * The name of the repository.
     * 
     */
    private final @Nullable String fullName;
    /**
     * The url to access the repository.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor({"branches","fullName","url"})
    private RepoResponse(
        @Nullable List<String> branches,
        @Nullable String fullName,
        @Nullable String url) {
        this.branches = branches;
        this.fullName = fullName;
        this.url = url;
    }

    /**
     * Array of branches.
     * 
     */
    public List<String> getBranches() {
        return this.branches == null ? List.of() : this.branches;
    }
    /**
     * The name of the repository.
     * 
     */
    public Optional<String> getFullName() {
        return Optional.ofNullable(this.fullName);
    }
    /**
     * The url to access the repository.
     * 
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> branches;
        private @Nullable String fullName;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.fullName = defaults.fullName;
    	      this.url = defaults.url;
        }

        public Builder setBranches(@Nullable List<String> branches) {
            this.branches = branches;
            return this;
        }

        public Builder setFullName(@Nullable String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public RepoResponse build() {
            return new RepoResponse(branches, fullName, url);
        }
    }
}
