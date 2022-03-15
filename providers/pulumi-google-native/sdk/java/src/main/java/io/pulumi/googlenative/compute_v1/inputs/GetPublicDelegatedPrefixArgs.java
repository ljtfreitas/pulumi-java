// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicDelegatedPrefixArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPublicDelegatedPrefixArgs Empty = new GetPublicDelegatedPrefixArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="publicDelegatedPrefix", required=true)
      private final String publicDelegatedPrefix;

    public String getPublicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetPublicDelegatedPrefixArgs(
        @Nullable String project,
        String publicDelegatedPrefix,
        String region) {
        this.project = project;
        this.publicDelegatedPrefix = Objects.requireNonNull(publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetPublicDelegatedPrefixArgs() {
        this.project = null;
        this.publicDelegatedPrefix = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String publicDelegatedPrefix;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicDelegatedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.publicDelegatedPrefix = defaults.publicDelegatedPrefix;
    	      this.region = defaults.region;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder publicDelegatedPrefix(String publicDelegatedPrefix) {
            this.publicDelegatedPrefix = Objects.requireNonNull(publicDelegatedPrefix);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetPublicDelegatedPrefixArgs build() {
            return new GetPublicDelegatedPrefixArgs(project, publicDelegatedPrefix, region);
        }
    }
}
