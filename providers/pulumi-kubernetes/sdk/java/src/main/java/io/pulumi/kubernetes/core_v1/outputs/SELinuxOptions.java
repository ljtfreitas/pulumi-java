// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SELinuxOptions {
    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    private final @Nullable String level;
    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    private final @Nullable String role;
    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    private final @Nullable String type;
    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    private final @Nullable String user;

    @OutputCustomType.Constructor({"level","role","type","user"})
    private SELinuxOptions(
        @Nullable String level,
        @Nullable String role,
        @Nullable String type,
        @Nullable String user) {
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }
    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SELinuxOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String level;
        private @Nullable String role;
        private @Nullable String type;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(SELinuxOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = user;
            return this;
        }
        public SELinuxOptions build() {
            return new SELinuxOptions(level, role, type, user);
        }
    }
}
