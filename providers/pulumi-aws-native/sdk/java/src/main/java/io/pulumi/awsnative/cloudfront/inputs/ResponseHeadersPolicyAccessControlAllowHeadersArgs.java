// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlAllowHeadersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyAccessControlAllowHeadersArgs Empty = new ResponseHeadersPolicyAccessControlAllowHeadersArgs();

    @InputImport(name="items", required=true)
        private final Input<List<String>> items;

    public Input<List<String>> getItems() {
        return this.items;
    }

    public ResponseHeadersPolicyAccessControlAllowHeadersArgs(Input<List<String>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyAccessControlAllowHeadersArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlAllowHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlAllowHeadersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(Input<List<String>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(List<String> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }
        public ResponseHeadersPolicyAccessControlAllowHeadersArgs build() {
            return new ResponseHeadersPolicyAccessControlAllowHeadersArgs(items);
        }
    }
}
