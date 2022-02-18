// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a canonical profile property.
 * 
 */
public final class CanonicalProfileDefinitionResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final CanonicalProfileDefinitionResponseProperties Empty = new CanonicalProfileDefinitionResponseProperties();

    /**
     * Profile name.
     * 
     */
    @InputImport(name="profileName")
    private final @Nullable String profileName;

    public Optional<String> getProfileName() {
        return this.profileName == null ? Optional.empty() : Optional.ofNullable(this.profileName);
    }

    /**
     * Property name of profile.
     * 
     */
    @InputImport(name="profilePropertyName")
    private final @Nullable String profilePropertyName;

    public Optional<String> getProfilePropertyName() {
        return this.profilePropertyName == null ? Optional.empty() : Optional.ofNullable(this.profilePropertyName);
    }

    /**
     * The rank.
     * 
     */
    @InputImport(name="rank")
    private final @Nullable Integer rank;

    public Optional<Integer> getRank() {
        return this.rank == null ? Optional.empty() : Optional.ofNullable(this.rank);
    }

    /**
     * Type of canonical property value.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Value of the canonical property.
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public CanonicalProfileDefinitionResponseProperties(
        @Nullable String profileName,
        @Nullable String profilePropertyName,
        @Nullable Integer rank,
        @Nullable String type,
        @Nullable String value) {
        this.profileName = profileName;
        this.profilePropertyName = profilePropertyName;
        this.rank = rank;
        this.type = type;
        this.value = value;
    }

    private CanonicalProfileDefinitionResponseProperties() {
        this.profileName = null;
        this.profilePropertyName = null;
        this.rank = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanonicalProfileDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String profileName;
        private @Nullable String profilePropertyName;
        private @Nullable Integer rank;
        private @Nullable String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CanonicalProfileDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.profilePropertyName = defaults.profilePropertyName;
    	      this.rank = defaults.rank;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setProfileName(@Nullable String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setProfilePropertyName(@Nullable String profilePropertyName) {
            this.profilePropertyName = profilePropertyName;
            return this;
        }

        public Builder setRank(@Nullable Integer rank) {
            this.rank = rank;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public CanonicalProfileDefinitionResponseProperties build() {
            return new CanonicalProfileDefinitionResponseProperties(profileName, profilePropertyName, rank, type, value);
        }
    }
}
