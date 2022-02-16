// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasic;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelCustom;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessLevelsAccessLevel {
    private final @Nullable AccessLevelsAccessLevelBasic basic;
    private final @Nullable AccessLevelsAccessLevelCustom custom;
    private final @Nullable String description;
    private final String name;
    private final String title;

    @OutputCustomType.Constructor({"basic","custom","description","name","title"})
    private AccessLevelsAccessLevel(
        @Nullable AccessLevelsAccessLevelBasic basic,
        @Nullable AccessLevelsAccessLevelCustom custom,
        @Nullable String description,
        String name,
        String title) {
        this.basic = basic;
        this.custom = custom;
        this.description = description;
        this.name = Objects.requireNonNull(name);
        this.title = Objects.requireNonNull(title);
    }

    public Optional<AccessLevelsAccessLevelBasic> getBasic() {
        return Optional.ofNullable(this.basic);
    }
    public Optional<AccessLevelsAccessLevelCustom> getCustom() {
        return Optional.ofNullable(this.custom);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getName() {
        return this.name;
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessLevelsAccessLevelBasic basic;
        private @Nullable AccessLevelsAccessLevelCustom custom;
        private @Nullable String description;
        private String name;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
        }

        public Builder setBasic(@Nullable AccessLevelsAccessLevelBasic basic) {
            this.basic = basic;
            return this;
        }

        public Builder setCustom(@Nullable AccessLevelsAccessLevelCustom custom) {
            this.custom = custom;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public AccessLevelsAccessLevel build() {
            return new AccessLevelsAccessLevel(basic, custom, description, name, title);
        }
    }
}