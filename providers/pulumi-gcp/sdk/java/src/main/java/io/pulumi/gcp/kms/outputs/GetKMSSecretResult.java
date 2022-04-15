// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKMSSecretResult {
    private final @Nullable String additionalAuthenticatedData;
    private final String ciphertext;
    private final String cryptoKey;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Contains the result of decrypting the provided ciphertext.
     * 
     */
    private final String plaintext;

    @CustomType.Constructor
    private GetKMSSecretResult(
        @CustomType.Parameter("additionalAuthenticatedData") @Nullable String additionalAuthenticatedData,
        @CustomType.Parameter("ciphertext") String ciphertext,
        @CustomType.Parameter("cryptoKey") String cryptoKey,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("plaintext") String plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.ciphertext = ciphertext;
        this.cryptoKey = cryptoKey;
        this.id = id;
        this.plaintext = plaintext;
    }

    public Optional<String> additionalAuthenticatedData() {
        return Optional.ofNullable(this.additionalAuthenticatedData);
    }
    public String ciphertext() {
        return this.ciphertext;
    }
    public String cryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Contains the result of decrypting the provided ciphertext.
     * 
    */
    public String plaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalAuthenticatedData;
        private String ciphertext;
        private String cryptoKey;
        private String id;
        private String plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticatedData = defaults.additionalAuthenticatedData;
    	      this.ciphertext = defaults.ciphertext;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.id = defaults.id;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder additionalAuthenticatedData(@Nullable String additionalAuthenticatedData) {
            this.additionalAuthenticatedData = additionalAuthenticatedData;
            return this;
        }
        public Builder ciphertext(String ciphertext) {
            this.ciphertext = Objects.requireNonNull(ciphertext);
            return this;
        }
        public Builder cryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder plaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }        public GetKMSSecretResult build() {
            return new GetKMSSecretResult(additionalAuthenticatedData, ciphertext, cryptoKey, id, plaintext);
        }
    }
}
