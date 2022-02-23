// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
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

    @OutputCustomType.Constructor({"additionalAuthenticatedData","ciphertext","cryptoKey","id","plaintext"})
    private GetKMSSecretResult(
        @Nullable String additionalAuthenticatedData,
        String ciphertext,
        String cryptoKey,
        String id,
        String plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.ciphertext = Objects.requireNonNull(ciphertext);
        this.cryptoKey = Objects.requireNonNull(cryptoKey);
        this.id = Objects.requireNonNull(id);
        this.plaintext = Objects.requireNonNull(plaintext);
    }

    public Optional<String> getAdditionalAuthenticatedData() {
        return Optional.ofNullable(this.additionalAuthenticatedData);
    }
    public String getCiphertext() {
        return this.ciphertext;
    }
    public String getCryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Contains the result of decrypting the provided ciphertext.
     * 
     */
    public String getPlaintext() {
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

        public Builder setAdditionalAuthenticatedData(@Nullable String additionalAuthenticatedData) {
            this.additionalAuthenticatedData = additionalAuthenticatedData;
            return this;
        }

        public Builder setCiphertext(String ciphertext) {
            this.ciphertext = Objects.requireNonNull(ciphertext);
            return this;
        }

        public Builder setCryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPlaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }
        public GetKMSSecretResult build() {
            return new GetKMSSecretResult(additionalAuthenticatedData, ciphertext, cryptoKey, id, plaintext);
        }
    }
}
