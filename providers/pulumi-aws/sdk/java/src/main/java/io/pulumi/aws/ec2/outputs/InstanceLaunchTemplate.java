// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceLaunchTemplate {
    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the launch template. Conflicts with `id`.
     * 
     */
    private final @Nullable String name;
    /**
     * Template version. Can be a specific version number, `$Latest` or `$Default`. The default value is `$Default`.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"id","name","version"})
    private InstanceLaunchTemplate(
        @Nullable String id,
        @Nullable String name,
        @Nullable String version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the launch template. Conflicts with `id`.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Template version. Can be a specific version number, `$Latest` or `$Default`. The default value is `$Default`.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public InstanceLaunchTemplate build() {
            return new InstanceLaunchTemplate(id, name, version);
        }
    }
}
