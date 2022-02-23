// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetadataSupportResponse {
    /**
     * Email of support contact
     * 
     */
    private final @Nullable String email;
    /**
     * Link for support help, like to support page to open a ticket etc.
     * 
     */
    private final @Nullable String link;
    /**
     * Name of the support contact. Company or person.
     * 
     */
    private final @Nullable String name;
    /**
     * Type of support for content item
     * 
     */
    private final String tier;

    @OutputCustomType.Constructor({"email","link","name","tier"})
    private MetadataSupportResponse(
        @Nullable String email,
        @Nullable String link,
        @Nullable String name,
        String tier) {
        this.email = email;
        this.link = link;
        this.name = name;
        this.tier = Objects.requireNonNull(tier);
    }

    /**
     * Email of support contact
     * 
     */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * Link for support help, like to support page to open a ticket etc.
     * 
     */
    public Optional<String> getLink() {
        return Optional.ofNullable(this.link);
    }
    /**
     * Name of the support contact. Company or person.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Type of support for content item
     * 
     */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataSupportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String link;
        private @Nullable String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataSupportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.link = defaults.link;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public MetadataSupportResponse build() {
            return new MetadataSupportResponse(email, link, name, tier);
        }
    }
}
