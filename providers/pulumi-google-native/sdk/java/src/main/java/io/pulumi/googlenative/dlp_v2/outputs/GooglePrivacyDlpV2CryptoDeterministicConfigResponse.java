// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CryptoKeyResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CryptoDeterministicConfigResponse {
    /**
     * A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse context;
    /**
     * The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * 
     */
    private final GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;
    /**
     * The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content using the custom info type 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
     * 
     */
    private final GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType;

    @OutputCustomType.Constructor({"context","cryptoKey","surrogateInfoType"})
    private GooglePrivacyDlpV2CryptoDeterministicConfigResponse(
        GooglePrivacyDlpV2FieldIdResponse context,
        GooglePrivacyDlpV2CryptoKeyResponse cryptoKey,
        GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType) {
        this.context = Objects.requireNonNull(context);
        this.cryptoKey = Objects.requireNonNull(cryptoKey);
        this.surrogateInfoType = Objects.requireNonNull(surrogateInfoType);
    }

    /**
     * A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
     * 
     */
    public GooglePrivacyDlpV2FieldIdResponse getContext() {
        return this.context;
    }
    /**
     * The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * 
     */
    public GooglePrivacyDlpV2CryptoKeyResponse getCryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content using the custom info type 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
     * 
     */
    public GooglePrivacyDlpV2InfoTypeResponse getSurrogateInfoType() {
        return this.surrogateInfoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoDeterministicConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse context;
        private GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;
        private GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoDeterministicConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.surrogateInfoType = defaults.surrogateInfoType;
        }

        public Builder setContext(GooglePrivacyDlpV2FieldIdResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setCryptoKey(GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder setSurrogateInfoType(GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType) {
            this.surrogateInfoType = Objects.requireNonNull(surrogateInfoType);
            return this;
        }
        public GooglePrivacyDlpV2CryptoDeterministicConfigResponse build() {
            return new GooglePrivacyDlpV2CryptoDeterministicConfigResponse(context, cryptoKey, surrogateInfoType);
        }
    }
}
