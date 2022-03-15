// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse {
    @CustomType.Constructor
    private GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse build() {
            return new GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse();
        }
    }
}
