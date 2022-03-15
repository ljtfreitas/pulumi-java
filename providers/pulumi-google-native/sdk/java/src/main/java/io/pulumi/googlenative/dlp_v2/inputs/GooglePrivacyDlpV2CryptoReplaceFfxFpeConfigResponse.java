// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `ReidentifyContent` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See https://cloud.google.com/dlp/docs/pseudonymization to learn more. Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
 * 
 */
public final class GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse Empty = new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse();

    /**
     * Common alphabets.
     * 
     */
    @Import(name="commonAlphabet", required=true)
      private final String commonAlphabet;

    public String getCommonAlphabet() {
        return this.commonAlphabet;
    }

    /**
     * The 'tweak', a context may be used for higher security since the same identifier in two different contexts won't be given the same surrogate. If the context is not set, a default tweak will be used. If the context is set but: 1. there is no record present when transforming a given value or 1. the field is not present when transforming a given value, a default tweak will be used. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string. The tweak is constructed as a sequence of bytes in big endian byte order such that: - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in UTF-8 format followed by a single byte of value 2
     * 
     */
    @Import(name="context", required=true)
      private final GooglePrivacyDlpV2FieldIdResponse context;

    public GooglePrivacyDlpV2FieldIdResponse getContext() {
        return this.context;
    }

    /**
     * The key used by the encryption algorithm.
     * 
     */
    @Import(name="cryptoKey", required=true)
      private final GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;

    public GooglePrivacyDlpV2CryptoKeyResponse getCryptoKey() {
        return this.cryptoKey;
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range [2, 95]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is: 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&*()_-+={[}]|\:;"'<,>.?/
     * 
     */
    @Import(name="customAlphabet", required=true)
      private final String customAlphabet;

    public String getCustomAlphabet() {
        return this.customAlphabet;
    }

    /**
     * The native way to select the alphabet. Must be in the range [2, 95].
     * 
     */
    @Import(name="radix", required=true)
      private final Integer radix;

    public Integer getRadix() {
        return this.radix;
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info_type_name(surrogate_character_count):surrogate For example, if the name of custom infoType is 'MY_TOKEN_INFO_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc' This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text. In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
     * 
     */
    @Import(name="surrogateInfoType", required=true)
      private final GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType;

    public GooglePrivacyDlpV2InfoTypeResponse getSurrogateInfoType() {
        return this.surrogateInfoType;
    }

    public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse(
        String commonAlphabet,
        GooglePrivacyDlpV2FieldIdResponse context,
        GooglePrivacyDlpV2CryptoKeyResponse cryptoKey,
        String customAlphabet,
        Integer radix,
        GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType) {
        this.commonAlphabet = Objects.requireNonNull(commonAlphabet, "expected parameter 'commonAlphabet' to be non-null");
        this.context = Objects.requireNonNull(context, "expected parameter 'context' to be non-null");
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.customAlphabet = Objects.requireNonNull(customAlphabet, "expected parameter 'customAlphabet' to be non-null");
        this.radix = Objects.requireNonNull(radix, "expected parameter 'radix' to be non-null");
        this.surrogateInfoType = Objects.requireNonNull(surrogateInfoType, "expected parameter 'surrogateInfoType' to be non-null");
    }

    private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse() {
        this.commonAlphabet = null;
        this.context = null;
        this.cryptoKey = null;
        this.customAlphabet = null;
        this.radix = null;
        this.surrogateInfoType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commonAlphabet;
        private GooglePrivacyDlpV2FieldIdResponse context;
        private GooglePrivacyDlpV2CryptoKeyResponse cryptoKey;
        private String customAlphabet;
        private Integer radix;
        private GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAlphabet = defaults.commonAlphabet;
    	      this.context = defaults.context;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.customAlphabet = defaults.customAlphabet;
    	      this.radix = defaults.radix;
    	      this.surrogateInfoType = defaults.surrogateInfoType;
        }

        public Builder commonAlphabet(String commonAlphabet) {
            this.commonAlphabet = Objects.requireNonNull(commonAlphabet);
            return this;
        }

        public Builder context(GooglePrivacyDlpV2FieldIdResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder cryptoKey(GooglePrivacyDlpV2CryptoKeyResponse cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder customAlphabet(String customAlphabet) {
            this.customAlphabet = Objects.requireNonNull(customAlphabet);
            return this;
        }

        public Builder radix(Integer radix) {
            this.radix = Objects.requireNonNull(radix);
            return this;
        }

        public Builder surrogateInfoType(GooglePrivacyDlpV2InfoTypeResponse surrogateInfoType) {
            this.surrogateInfoType = Objects.requireNonNull(surrogateInfoType);
            return this;
        }
        public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse build() {
            return new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigResponse(commonAlphabet, context, cryptoKey, customAlphabet, radix, surrogateInfoType);
        }
    }
}
