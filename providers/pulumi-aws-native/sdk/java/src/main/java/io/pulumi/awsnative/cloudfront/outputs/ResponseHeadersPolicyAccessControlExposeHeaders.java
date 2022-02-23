// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResponseHeadersPolicyAccessControlExposeHeaders {
    private final List<String> items;

    @OutputCustomType.Constructor({"items"})
    private ResponseHeadersPolicyAccessControlExposeHeaders(List<String> items) {
        this.items = Objects.requireNonNull(items);
    }

    public List<String> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlExposeHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlExposeHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public ResponseHeadersPolicyAccessControlExposeHeaders build() {
            return new ResponseHeadersPolicyAccessControlExposeHeaders(items);
        }
    }
}
