// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2PublishToStackdriverResponse {
    @CustomType.Constructor
    private GooglePrivacyDlpV2PublishToStackdriverResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PublishToStackdriverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PublishToStackdriverResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2PublishToStackdriverResponse build() {
            return new GooglePrivacyDlpV2PublishToStackdriverResponse();
        }
    }
}
