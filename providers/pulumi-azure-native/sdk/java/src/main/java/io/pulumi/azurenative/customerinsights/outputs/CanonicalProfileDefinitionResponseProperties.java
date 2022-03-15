// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanonicalProfileDefinitionResponseProperties {
    /**
     * Profile name.
     * 
     */
    private final @Nullable String profileName;
    /**
     * Property name of profile.
     * 
     */
    private final @Nullable String profilePropertyName;
    /**
     * The rank.
     * 
     */
    private final @Nullable Integer rank;
    /**
     * Type of canonical property value.
     * 
     */
    private final @Nullable String type;
    /**
     * Value of the canonical property.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CanonicalProfileDefinitionResponseProperties(
        @CustomType.Parameter("profileName") @Nullable String profileName,
        @CustomType.Parameter("profilePropertyName") @Nullable String profilePropertyName,
        @CustomType.Parameter("rank") @Nullable Integer rank,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.profileName = profileName;
        this.profilePropertyName = profilePropertyName;
        this.rank = rank;
        this.type = type;
        this.value = value;
    }

    /**
     * Profile name.
     * 
    */
    public Optional<String> getProfileName() {
        return Optional.ofNullable(this.profileName);
    }
    /**
     * Property name of profile.
     * 
    */
    public Optional<String> getProfilePropertyName() {
        return Optional.ofNullable(this.profilePropertyName);
    }
    /**
     * The rank.
     * 
    */
    public Optional<Integer> getRank() {
        return Optional.ofNullable(this.rank);
    }
    /**
     * Type of canonical property value.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Value of the canonical property.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
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

        public Builder profileName(@Nullable String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder profilePropertyName(@Nullable String profilePropertyName) {
            this.profilePropertyName = profilePropertyName;
            return this;
        }

        public Builder rank(@Nullable Integer rank) {
            this.rank = rank;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CanonicalProfileDefinitionResponseProperties build() {
            return new CanonicalProfileDefinitionResponseProperties(profileName, profilePropertyName, rank, type, value);
        }
    }
}
