// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1HoldDataResponse {
    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1HoldDataResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1HoldDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1HoldDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudContactcenterinsightsV1HoldDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1HoldDataResponse();
        }
    }
}
