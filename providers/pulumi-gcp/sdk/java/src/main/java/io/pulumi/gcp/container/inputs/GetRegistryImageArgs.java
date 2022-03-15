// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistryImageArgs Empty = new GetRegistryImageArgs();

    @Import(name="digest")
      private final @Nullable String digest;

    public Optional<String> getDigest() {
        return this.digest == null ? Optional.empty() : Optional.ofNullable(this.digest);
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    @Import(name="tag")
      private final @Nullable String tag;

    public Optional<String> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    public GetRegistryImageArgs(
        @Nullable String digest,
        String name,
        @Nullable String project,
        @Nullable String region,
        @Nullable String tag) {
        this.digest = digest;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.region = region;
        this.tag = tag;
    }

    private GetRegistryImageArgs() {
        this.digest = null;
        this.name = null;
        this.project = null;
        this.region = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private String name;
        private @Nullable String project;
        private @Nullable String region;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tag = defaults.tag;
        }

        public Builder digest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public GetRegistryImageArgs build() {
            return new GetRegistryImageArgs(digest, name, project, region, tag);
        }
    }
}
