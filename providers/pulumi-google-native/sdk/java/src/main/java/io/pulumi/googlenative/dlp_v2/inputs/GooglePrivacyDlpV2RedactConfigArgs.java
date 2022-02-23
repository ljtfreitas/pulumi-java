// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * Redact a given value. For example, if used with an `InfoTypeTransformation` transforming PHONE_NUMBER, and input 'My phone number is 206-555-0123', the output would be 'My phone number is '.
 * 
 */
public final class GooglePrivacyDlpV2RedactConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RedactConfigArgs Empty = new GooglePrivacyDlpV2RedactConfigArgs();

    public GooglePrivacyDlpV2RedactConfigArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RedactConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RedactConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2RedactConfigArgs build() {
            return new GooglePrivacyDlpV2RedactConfigArgs();
        }
    }
}
