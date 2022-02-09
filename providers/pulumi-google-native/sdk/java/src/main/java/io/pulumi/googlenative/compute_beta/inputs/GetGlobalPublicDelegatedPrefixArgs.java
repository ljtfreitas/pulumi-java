// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalPublicDelegatedPrefixArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalPublicDelegatedPrefixArgs Empty = new GetGlobalPublicDelegatedPrefixArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="publicDelegatedPrefix", required=true)
    private final String publicDelegatedPrefix;

    public String getPublicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    public GetGlobalPublicDelegatedPrefixArgs(
        @Nullable String project,
        String publicDelegatedPrefix) {
        this.project = project;
        this.publicDelegatedPrefix = Objects.requireNonNull(publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
    }

    private GetGlobalPublicDelegatedPrefixArgs() {
        this.project = null;
        this.publicDelegatedPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String publicDelegatedPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalPublicDelegatedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.publicDelegatedPrefix = defaults.publicDelegatedPrefix;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setPublicDelegatedPrefix(String publicDelegatedPrefix) {
            this.publicDelegatedPrefix = Objects.requireNonNull(publicDelegatedPrefix);
            return this;
        }

        public GetGlobalPublicDelegatedPrefixArgs build() {
            return new GetGlobalPublicDelegatedPrefixArgs(project, publicDelegatedPrefix);
        }
    }
}