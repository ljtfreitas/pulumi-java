// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Characters to skip when doing deidentification of a value. These will be left alone and skipped.
 * 
 */
public final class GooglePrivacyDlpV2CharsToIgnoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CharsToIgnoreArgs Empty = new GooglePrivacyDlpV2CharsToIgnoreArgs();

    /**
     * Characters to not transform when masking.
     * 
     */
    @InputImport(name="charactersToSkip")
      private final @Nullable Input<String> charactersToSkip;

    public Input<String> getCharactersToSkip() {
        return this.charactersToSkip == null ? Input.empty() : this.charactersToSkip;
    }

    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * 
     */
    @InputImport(name="commonCharactersToIgnore")
      private final @Nullable Input<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore;

    public Input<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> getCommonCharactersToIgnore() {
        return this.commonCharactersToIgnore == null ? Input.empty() : this.commonCharactersToIgnore;
    }

    public GooglePrivacyDlpV2CharsToIgnoreArgs(
        @Nullable Input<String> charactersToSkip,
        @Nullable Input<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore) {
        this.charactersToSkip = charactersToSkip;
        this.commonCharactersToIgnore = commonCharactersToIgnore;
    }

    private GooglePrivacyDlpV2CharsToIgnoreArgs() {
        this.charactersToSkip = Input.empty();
        this.commonCharactersToIgnore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CharsToIgnoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> charactersToSkip;
        private @Nullable Input<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CharsToIgnoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToSkip = defaults.charactersToSkip;
    	      this.commonCharactersToIgnore = defaults.commonCharactersToIgnore;
        }

        public Builder setCharactersToSkip(@Nullable Input<String> charactersToSkip) {
            this.charactersToSkip = charactersToSkip;
            return this;
        }

        public Builder setCharactersToSkip(@Nullable String charactersToSkip) {
            this.charactersToSkip = Input.ofNullable(charactersToSkip);
            return this;
        }

        public Builder setCommonCharactersToIgnore(@Nullable Input<GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore> commonCharactersToIgnore) {
            this.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }

        public Builder setCommonCharactersToIgnore(@Nullable GooglePrivacyDlpV2CharsToIgnoreCommonCharactersToIgnore commonCharactersToIgnore) {
            this.commonCharactersToIgnore = Input.ofNullable(commonCharactersToIgnore);
            return this;
        }
        public GooglePrivacyDlpV2CharsToIgnoreArgs build() {
            return new GooglePrivacyDlpV2CharsToIgnoreArgs(charactersToSkip, commonCharactersToIgnore);
        }
    }
}
