// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TagsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TagsResponse Empty = new TagsResponse();

    @InputImport(name="fingerprint", required=true)
    private final String fingerprint;

    public String getFingerprint() {
        return this.fingerprint;
    }

    @InputImport(name="items", required=true)
    private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    public TagsResponse(
        String fingerprint,
        List<String> items) {
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private TagsResponse() {
        this.fingerprint = null;
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fingerprint;
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(TagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.items = defaults.items;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public TagsResponse build() {
            return new TagsResponse(fingerprint, items);
        }
    }
}