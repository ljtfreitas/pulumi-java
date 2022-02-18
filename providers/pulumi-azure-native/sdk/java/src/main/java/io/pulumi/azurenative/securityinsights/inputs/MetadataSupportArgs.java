// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.SupportTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Support information for the content item.
 * 
 */
public final class MetadataSupportArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataSupportArgs Empty = new MetadataSupportArgs();

    /**
     * Email of support contact
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * Link for support help, like to support page to open a ticket etc.
     * 
     */
    @InputImport(name="link")
    private final @Nullable Input<String> link;

    public Input<String> getLink() {
        return this.link == null ? Input.empty() : this.link;
    }

    /**
     * Name of the support contact. Company or person.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Type of support for content item
     * 
     */
    @InputImport(name="tier", required=true)
    private final Input<Either<String,SupportTier>> tier;

    public Input<Either<String,SupportTier>> getTier() {
        return this.tier;
    }

    public MetadataSupportArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> link,
        @Nullable Input<String> name,
        Input<Either<String,SupportTier>> tier) {
        this.email = email;
        this.link = link;
        this.name = name;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private MetadataSupportArgs() {
        this.email = Input.empty();
        this.link = Input.empty();
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataSupportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> link;
        private @Nullable Input<String> name;
        private Input<Either<String,SupportTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataSupportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.link = defaults.link;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setLink(@Nullable Input<String> link) {
            this.link = link;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = Input.ofNullable(link);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTier(Input<Either<String,SupportTier>> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setTier(Either<String,SupportTier> tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }

        public MetadataSupportArgs build() {
            return new MetadataSupportArgs(email, link, name, tier);
        }
    }
}
