// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey {
    /**
     * @return Authentication key.
     * 
     */
    private final @Nullable String base64Key;
    /**
     * @return The expiration time of the authentication key.
     * 
     */
    private final @Nullable String expiration;
    /**
     * @return Identifier of the key.
     * 
     */
    private final @Nullable String identifier;

    @CustomType.Constructor
    private StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey(
        @CustomType.Parameter("base64Key") @Nullable String base64Key,
        @CustomType.Parameter("expiration") @Nullable String expiration,
        @CustomType.Parameter("identifier") @Nullable String identifier) {
        this.base64Key = base64Key;
        this.expiration = expiration;
        this.identifier = identifier;
    }

    /**
     * @return Authentication key.
     * 
     */
    public Optional<String> base64Key() {
        return Optional.ofNullable(this.base64Key);
    }
    /**
     * @return The expiration time of the authentication key.
     * 
     */
    public Optional<String> expiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * @return Identifier of the key.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String base64Key;
        private @Nullable String expiration;
        private @Nullable String identifier;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64Key = defaults.base64Key;
    	      this.expiration = defaults.expiration;
    	      this.identifier = defaults.identifier;
        }

        public Builder base64Key(@Nullable String base64Key) {
            this.base64Key = base64Key;
            return this;
        }
        public Builder expiration(@Nullable String expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }        public StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey build() {
            return new StreamingEndpointAccessControlAkamaiSignatureHeaderAuthenticationKey(base64Key, expiration, identifier);
        }
    }
}
