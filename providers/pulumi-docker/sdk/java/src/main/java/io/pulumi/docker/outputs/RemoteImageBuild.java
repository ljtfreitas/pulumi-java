// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemoteImageBuild {
    private final @Nullable Map<String,String> buildArg;
    private final @Nullable String dockerfile;
    private final @Nullable Boolean forceRemove;
    private final @Nullable Map<String,String> label;
    private final @Nullable Boolean noCache;
    private final String path;
    private final @Nullable Boolean remove;
    private final @Nullable List<String> tags;
    private final @Nullable String target;

    @CustomType.Constructor
    private RemoteImageBuild(
        @CustomType.Parameter("buildArg") @Nullable Map<String,String> buildArg,
        @CustomType.Parameter("dockerfile") @Nullable String dockerfile,
        @CustomType.Parameter("forceRemove") @Nullable Boolean forceRemove,
        @CustomType.Parameter("label") @Nullable Map<String,String> label,
        @CustomType.Parameter("noCache") @Nullable Boolean noCache,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("remove") @Nullable Boolean remove,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("target") @Nullable String target) {
        this.buildArg = buildArg;
        this.dockerfile = dockerfile;
        this.forceRemove = forceRemove;
        this.label = label;
        this.noCache = noCache;
        this.path = path;
        this.remove = remove;
        this.tags = tags;
        this.target = target;
    }

    public Map<String,String> getBuildArg() {
        return this.buildArg == null ? Map.of() : this.buildArg;
    }
    public Optional<String> getDockerfile() {
        return Optional.ofNullable(this.dockerfile);
    }
    public Optional<Boolean> getForceRemove() {
        return Optional.ofNullable(this.forceRemove);
    }
    public Map<String,String> getLabel() {
        return this.label == null ? Map.of() : this.label;
    }
    public Optional<Boolean> getNoCache() {
        return Optional.ofNullable(this.noCache);
    }
    public String getPath() {
        return this.path;
    }
    public Optional<Boolean> getRemove() {
        return Optional.ofNullable(this.remove);
    }
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteImageBuild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> buildArg;
        private @Nullable String dockerfile;
        private @Nullable Boolean forceRemove;
        private @Nullable Map<String,String> label;
        private @Nullable Boolean noCache;
        private String path;
        private @Nullable Boolean remove;
        private @Nullable List<String> tags;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteImageBuild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildArg = defaults.buildArg;
    	      this.dockerfile = defaults.dockerfile;
    	      this.forceRemove = defaults.forceRemove;
    	      this.label = defaults.label;
    	      this.noCache = defaults.noCache;
    	      this.path = defaults.path;
    	      this.remove = defaults.remove;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
        }

        public Builder buildArg(@Nullable Map<String,String> buildArg) {
            this.buildArg = buildArg;
            return this;
        }

        public Builder dockerfile(@Nullable String dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }

        public Builder forceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }

        public Builder label(@Nullable Map<String,String> label) {
            this.label = label;
            return this;
        }

        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder remove(@Nullable Boolean remove) {
            this.remove = remove;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public RemoteImageBuild build() {
            return new RemoteImageBuild(buildArg, dockerfile, forceRemove, label, noCache, path, remove, tags, target);
        }
    }
}
