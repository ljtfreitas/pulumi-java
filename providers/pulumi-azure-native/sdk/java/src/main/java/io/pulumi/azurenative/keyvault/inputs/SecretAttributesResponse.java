// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The secret management attributes.
 * 
 */
public final class SecretAttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretAttributesResponse Empty = new SecretAttributesResponse();

    /**
     * Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="created", required=true)
      private final Integer created;

    public Integer getCreated() {
        return this.created;
    }

    /**
     * Determines whether the object is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="expires")
      private final @Nullable Integer expires;

    public Optional<Integer> getExpires() {
        return this.expires == null ? Optional.empty() : Optional.ofNullable(this.expires);
    }

    /**
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="notBefore")
      private final @Nullable Integer notBefore;

    public Optional<Integer> getNotBefore() {
        return this.notBefore == null ? Optional.empty() : Optional.ofNullable(this.notBefore);
    }

    /**
     * Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="updated", required=true)
      private final Integer updated;

    public Integer getUpdated() {
        return this.updated;
    }

    public SecretAttributesResponse(
        Integer created,
        @Nullable Boolean enabled,
        @Nullable Integer expires,
        @Nullable Integer notBefore,
        Integer updated) {
        this.created = Objects.requireNonNull(created, "expected parameter 'created' to be non-null");
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
        this.updated = Objects.requireNonNull(updated, "expected parameter 'updated' to be non-null");
    }

    private SecretAttributesResponse() {
        this.created = null;
        this.enabled = null;
        this.expires = null;
        this.notBefore = null;
        this.updated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer created;
        private @Nullable Boolean enabled;
        private @Nullable Integer expires;
        private @Nullable Integer notBefore;
        private Integer updated;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
    	      this.updated = defaults.updated;
        }

        public Builder created(Integer created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder expires(@Nullable Integer expires) {
            this.expires = expires;
            return this;
        }

        public Builder notBefore(@Nullable Integer notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder updated(Integer updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public SecretAttributesResponse build() {
            return new SecretAttributesResponse(created, enabled, expires, notBefore, updated);
        }
    }
}
