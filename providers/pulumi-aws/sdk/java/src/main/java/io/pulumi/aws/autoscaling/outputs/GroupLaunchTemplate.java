// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupLaunchTemplate {
    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    private final @Nullable String name;
    /**
     * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GroupLaunchTemplate(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("version") @Nullable String version) {
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
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GroupLaunchTemplate build() {
            return new GroupLaunchTemplate(id, name, version);
        }
    }
}
