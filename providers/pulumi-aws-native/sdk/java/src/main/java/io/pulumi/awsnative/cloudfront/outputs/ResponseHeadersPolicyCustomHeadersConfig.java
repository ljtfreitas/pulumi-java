// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyCustomHeader;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResponseHeadersPolicyCustomHeadersConfig {
    private final List<ResponseHeadersPolicyCustomHeader> items;

    @CustomType.Constructor
    private ResponseHeadersPolicyCustomHeadersConfig(@CustomType.Parameter("items") List<ResponseHeadersPolicyCustomHeader> items) {
        this.items = items;
    }

    public List<ResponseHeadersPolicyCustomHeader> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResponseHeadersPolicyCustomHeader> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<ResponseHeadersPolicyCustomHeader> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public ResponseHeadersPolicyCustomHeadersConfig build() {
            return new ResponseHeadersPolicyCustomHeadersConfig(items);
        }
    }
}
