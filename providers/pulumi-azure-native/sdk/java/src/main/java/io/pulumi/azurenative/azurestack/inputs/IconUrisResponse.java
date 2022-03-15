// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Links to product icons.
 * 
 */
public final class IconUrisResponse extends io.pulumi.resources.InvokeArgs {

    public static final IconUrisResponse Empty = new IconUrisResponse();

    /**
     * URI to hero icon.
     * 
     */
    @Import(name="hero")
      private final @Nullable String hero;

    public Optional<String> getHero() {
        return this.hero == null ? Optional.empty() : Optional.ofNullable(this.hero);
    }

    /**
     * URI to large icon.
     * 
     */
    @Import(name="large")
      private final @Nullable String large;

    public Optional<String> getLarge() {
        return this.large == null ? Optional.empty() : Optional.ofNullable(this.large);
    }

    /**
     * URI to medium icon.
     * 
     */
    @Import(name="medium")
      private final @Nullable String medium;

    public Optional<String> getMedium() {
        return this.medium == null ? Optional.empty() : Optional.ofNullable(this.medium);
    }

    /**
     * URI to small icon.
     * 
     */
    @Import(name="small")
      private final @Nullable String small;

    public Optional<String> getSmall() {
        return this.small == null ? Optional.empty() : Optional.ofNullable(this.small);
    }

    /**
     * URI to wide icon.
     * 
     */
    @Import(name="wide")
      private final @Nullable String wide;

    public Optional<String> getWide() {
        return this.wide == null ? Optional.empty() : Optional.ofNullable(this.wide);
    }

    public IconUrisResponse(
        @Nullable String hero,
        @Nullable String large,
        @Nullable String medium,
        @Nullable String small,
        @Nullable String wide) {
        this.hero = hero;
        this.large = large;
        this.medium = medium;
        this.small = small;
        this.wide = wide;
    }

    private IconUrisResponse() {
        this.hero = null;
        this.large = null;
        this.medium = null;
        this.small = null;
        this.wide = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IconUrisResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hero;
        private @Nullable String large;
        private @Nullable String medium;
        private @Nullable String small;
        private @Nullable String wide;

        public Builder() {
    	      // Empty
        }

        public Builder(IconUrisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hero = defaults.hero;
    	      this.large = defaults.large;
    	      this.medium = defaults.medium;
    	      this.small = defaults.small;
    	      this.wide = defaults.wide;
        }

        public Builder hero(@Nullable String hero) {
            this.hero = hero;
            return this;
        }

        public Builder large(@Nullable String large) {
            this.large = large;
            return this;
        }

        public Builder medium(@Nullable String medium) {
            this.medium = medium;
            return this;
        }

        public Builder small(@Nullable String small) {
            this.small = small;
            return this;
        }

        public Builder wide(@Nullable String wide) {
            this.wide = wide;
            return this;
        }
        public IconUrisResponse build() {
            return new IconUrisResponse(hero, large, medium, small, wide);
        }
    }
}
